/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdb.Logic;


import bdb.Data.Information;
import gov.nih.nlm.umls.uts.webservice.AtomDTO;
import gov.nih.nlm.umls.uts.webservice.ConceptDTO;
import gov.nih.nlm.umls.uts.webservice.DefinitionDTO;
import gov.nih.nlm.umls.uts.webservice.Psf;



import gov.nih.nlm.umls.uts.webservice.UiLabel;
import gov.nih.nlm.umls.uts.webservice.UtsFault_Exception;
import gov.nih.nlm.umls.uts.webservice.UtsWsContentController;
import gov.nih.nlm.umls.uts.webservice.UtsWsContentControllerImplService;
import gov.nih.nlm.umls.uts.webservice.UtsWsFinderController;
import gov.nih.nlm.umls.uts.webservice.UtsWsFinderControllerImplService;
import gov.nih.nlm.umls.uts.webservice.UtsWsMetadataController;
import gov.nih.nlm.umls.uts.webservice.UtsWsMetadataControllerImplService;
import gov.nih.nlm.umls.uts.webservice.UtsWsSecurityController;
import gov.nih.nlm.umls.uts.webservice.UtsWsSecurityControllerImplService;
import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author sergiodiazpinilla
 */
public class UMLSClient {
    //username = "biologicDB";
    //password = "$Secret123";
    private String apikey = "87c13531-0fc4-4293-89c8-e9500ace33ad";
    private String service = "http://umlsks.nlm.nih.gov";
    
    private UtsWsSecurityController utsSecurityService;
    private UtsWsContentController utsContentService;
    private UtsWsMetadataController utsMetadataService;
    private UtsWsFinderController utsFinderService;
    private String ticketGrantingTicket;
    
    private String currentUmlsRelease; 
    
    public UMLSClient(){
        try {
            utsSecurityService = (new UtsWsSecurityControllerImplService()).getUtsWsSecurityControllerImplPort();
            utsContentService = (new UtsWsContentControllerImplService()).getUtsWsContentControllerImplPort();
            utsMetadataService = (new UtsWsMetadataControllerImplService()).getUtsWsMetadataControllerImplPort();
            utsFinderService = (new UtsWsFinderControllerImplService()).getUtsWsFinderControllerImplPort();
            getProxyGrantTicket();
            currentUmlsRelease = utsMetadataService.getCurrentUMLSVersion(getTiket());
        } catch (Exception e) {
            System.out.println("Error!!!" + e.getMessage());
        }
        
    }
    
    private void getProxyGrantTicket(){
        try {
            ticketGrantingTicket = utsSecurityService.getProxyGrantTicketWithApiKey(apikey);
        } catch (UtsFault_Exception ex) {
            System.out.println("Error! tiket!!"+ ex.toString());
        }
    }
    
    private String getTiket() throws UtsFault_Exception{
        return utsSecurityService.getProxyTicket(ticketGrantingTicket, "http://umlsks.nlm.nih.gov");
    }
    
    public boolean validateTiket(String ticket){
        try {
            return apikey.equals(utsSecurityService.validateProxyTicket(ticket,"http://umlsks.nlm.nih.gov"));
        } catch (UtsFault_Exception ex) {
            System.out.println("Error Validation!!!"+ex.toString());
        }
        return false;
    }
    
    public void sources() throws UtsFault_Exception,  gov.nih.nlm.umls.uts.webservice.UtsFault_Exception{
        String umlsReleases = utsMetadataService.getAllUMLSVersions(getTiket());
        System.out.println(umlsReleases);
}
    
    public void sample() throws  UtsFault_Exception, gov.nih.nlm.umls.uts.webservice.UtsFault_Exception{
        
        ConceptDTO concept = utsContentService.getConcept(getTiket(), "2011AB", "C0004057");
        String name = concept.getDefaultPreferredName();
        List<String> semanticTypes = concept.getSemanticTypes();
        int numberofAtoms = concept.getAtomCount();
        System.out.println("Name:"+name);
        System.out.println("Tupes:"+semanticTypes);
        System.out.println("numberAtoms:"+numberofAtoms);

    }
    
    public List<UiLabel> findTerm(String term) throws gov.nih.nlm.umls.uts.webservice.UtsFault_Exception, UtsFault_Exception{
        Psf myPsf = new Psf();
        int pageNum = 1;
        myPsf.setIncludedLanguage("ENG");
        myPsf.setIncludeObsolete(false);
        myPsf.setIncludeSuppressible(false);
        List<UiLabel> results = new ArrayList<>();

        //do {
            String ticket = utsSecurityService.getProxyTicket(ticketGrantingTicket, "http://umlsks.nlm.nih.gov");
            myPsf.setPageNum(pageNum);
            results = utsFinderService.findConcepts(ticket, currentUmlsRelease, "atom", term, "words", myPsf);
            pageNum++;

        //} while (results.size() > 0);

        return results;
    }
    
    public Information termInformation(String id) throws UtsFault_Exception{
        Psf myPsf = new Psf();
        int pageNum = 1;
        myPsf.setIncludedLanguage("ENG");
        myPsf.setIncludeObsolete(false);
        myPsf.setIncludeSuppressible(false);
        
        ConceptDTO concept = utsContentService.getConcept(getTiket(), currentUmlsRelease, id);
        List<DefinitionDTO> definitions = utsContentService.getConceptDefinitions(getTiket(), currentUmlsRelease, id, myPsf);
        Information info = new Information(concept, definitions);
        System.out.println("Name"+concept.getDefaultPreferredName());
        int numberofAtoms = concept.getAtomCount();
        return info;
    }

    public void getAtom(String atomId) throws UtsFault_Exception{
        AtomDTO myAtom = utsContentService.getAtom(getTiket(), "2011AB", atomId);
        String atomName = myAtom.getTermString().getName();
        String source = myAtom.getRootSource();
        String sourceConceptUi = myAtom.getSourceConcept().getUi();
        String sourceConceptName = myAtom.getSourceConcept().getDefaultPreferredName();
        String sourceDescriptorUi = myAtom.getSourceDescriptor().getUi();
        String sourceDescriptorName = myAtom.getSourceDescriptor().getDefaultPreferredName();
        String conceptUi = myAtom.getConcept().getUi();
        String conceptName = myAtom.getConcept().getDefaultPreferredName();
    }
    
    public static void main(String[] args) {
        UMLSClient umls = new UMLSClient();
        umls.getProxyGrantTicket();
        System.out.println("UMLSTIKET->"+umls.ticketGrantingTicket);
        //System.out.println("VAlidate->"+umls.validateTiket());
        try {
            System.out.println("Example");
            //umls.findTerm("head");
            //umls.termInformation("T109");
            umls.getAtom("A6955581");
            //umls.sources();
            
        } catch (UtsFault_Exception ex) {
            System.out.println("Error ->"+ex.toString());
        }
    }
}

