/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdb.Beans;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import rest.gwas.client.GwasClient;
import rest.gwas.search.gen.studies.SearchStudy;
import rest.gwas.search.phenotype.SearchPhenotypes;
import rest.gwas.search.studies.SearchStudies;
import rest.pubchem.client.PubChemClient;
import rest.pubchem.compounds.Id;
import rest.pubchem.compounds.Id_;
import rest.pubchem.compounds.PCCompound;
import rest.pubchem.compounds.PCCompounds;
import rest.pubchem.substances.PCSubstance;
import rest.pubmed.client.PubmedClient;
import rest.pubmed.efetch.PubmedArticleSet;
import rest.pubmed.search.SearchTermPubMed;
import rest.umls.client.UmlsClient;

import rest.umls.search.Results;
import rest.umls.search.SearchTerm;
import rest.umls.search.cui.SearchCUI;
import rest.umls.search.cui.definition.Result;
import rest.umls.search.cui.definition.SearchDefinitionCUI;

/**
 *
 * @author sergiodiazpinilla
 */
@Named(value = "finder")
@SessionScoped
public class FinderBean implements Serializable{

    /**
     * Creates a new instance of findTermBean
     */
    private boolean init = true;
    private String term;
    private String termID;
    private String message;
    private List<Results> recent;
    private List<Results> ans;
    //Libreria
    private final UmlsClient  umlsClient;
    private final PubmedClient pubmedClient;
    private final GwasClient gwasClient;
    private final PubChemClient pubchemClient;
    
    private SearchCUI inf;
    private SearchDefinitionCUI definitionsResult;
    private Result definitionText;
    private List<PubmedArticleSet> pubMedGeneral;
    private List<PubmedArticleSet> pubMedChem;
    private List<SearchPhenotypes> searchPhenotypes;
    private List<SearchStudies> searchStudys;
    
    private List<PCCompound> compounds;
    
    
    public FinderBean() {
        ans = new ArrayList<>();
        umlsClient = new UmlsClient();
        pubchemClient = new PubChemClient();
        pubmedClient = new PubmedClient();
        gwasClient = new GwasClient();
        recent = new ArrayList<>();
        pubMedGeneral = new ArrayList<>();
        searchPhenotypes = new ArrayList<>();
        searchStudys = new ArrayList<>();
        compounds = new ArrayList<>();
        pubMedChem = new ArrayList<>();
    }
    
    public void find(){
        ans.clear();
        //probando el servicio de consulta por termino
        SearchTerm searchTerm = umlsClient.searchTerm(term, null, null);
        System.out.println(searchTerm.getResult().getResults().get(0).getRootSource());
        System.out.println("searchTerm page size:"+searchTerm.getPageSize());
        ans = searchTerm.getResult().getResults();
    }


    public void information(Results result,boolean recentFlag){
        findDefinition(result, recentFlag);
        findArticle(termID);
        findPhenotipes(term);
        findChem(term);
        init = false;
    }
    
    public void findDefinition(Results result,boolean recentFlag){
        
        definitionsResult = umlsClient.searchDefinitionContentBYCUI(result.getUi());
        
        try {
            definitionText = definitionsResult.getResult().get(0);
        } catch (Exception e) {
            Result r = new Result();
            r.setValue("No definition");
            r.setRootSource("");
            definitionText = r;
        }
        
        inf = umlsClient.searchContentBYCUI(result.getUi());
        termID = inf.getResult().getName();
        if(recentFlag && !recent.contains(result)){
            if(recent.size() < 5){
                recent.add(result);
            }else{
                recent.remove(0);
                recent.add(result);
            }
        }
    }
    
    public void findArticle(String query){
        pubMedGeneral.clear();
        SearchTermPubMed spm = pubmedClient.searchTerm(query);
        for(int i =0; i<3;i++){
            pubMedGeneral.add(pubmedClient.searchEFetchById(spm.geteSearchResult().getIdlist().get(i)));
        }
    }
    
    public void findPhenotipes(String term){
        try{
            searchPhenotypes = Arrays.asList(gwasClient.getPhenotypes(term, "1"));
            searchStudys = Arrays.asList(gwasClient.getStudies(term, "1"));
        }catch(Exception e){
            searchStudys.clear();
            searchPhenotypes.clear();
        }
        
    }
    
    public void findArticleByID(String query){
        pubMedGeneral.clear();
        SearchTermPubMed spm = pubmedClient.searchTerm(query);
        for(int i =0; i<3;i++){
            
            pubMedGeneral.add(pubmedClient.searchEFetchById(spm.geteSearchResult().getIdlist().get(i)));
        }
    }
    
    public void findArticleChemByID(){
        pubMedChem.clear();
        String qry = termID + " chemistry";
        SearchTermPubMed spm = pubmedClient.searchTerm(qry);
        for(int i =0; i<3;i++){
            
            pubMedChem.add(pubmedClient.searchEFetchById(spm.geteSearchResult().getIdlist().get(i)));
        }
    }
    
    public void findChem(String term){
        compounds.clear();
        try{
            PCCompounds pc = pubchemClient.getCompoundByName(term);

            for(int i =0; i<pc.getPCCompounds().size();i++){
                compounds.add(pc.getPCCompounds().get(i));
            }
        }catch(Exception e){
            message = "NO COMPOUND";
        }
        findArticleChemByID();
        //PCSubstance substance = pubchemClient.get
    }
   
    
    public String getTerm() {
        return term;
    }

    public List<Results> getAns() {
        return ans;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public SearchCUI getInf() {
        return inf;
    }


    public String getTermSpecific() {
        return termID;
    }

    public List<Results> getRecent() {
        return recent;
    }

    public SearchDefinitionCUI getDefinitionsResult() {
        return definitionsResult;
    }

    public Result getDefinitionText() {
        return definitionText;
    }

    public List<PubmedArticleSet> getPubMedGeneral() {
        return pubMedGeneral;
    }

    public List<SearchPhenotypes> getSearchPhenotypes() {
        return searchPhenotypes;
    }

    public List<SearchStudies> getSearchStudys() {
        return searchStudys;
    }

    public List<PCCompound> getCompound() {
        return compounds;
    }

    public List<PubmedArticleSet> getPubMedChem() {
        return pubMedChem;
    }

    public String getMessage() {
        return message;
    }

    public boolean isInit() {
        return init;
    }


    public void redirect() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().redirect("search.xhtml");
        find();
    }
    
}
