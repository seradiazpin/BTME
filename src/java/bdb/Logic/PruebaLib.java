/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdb.Logic;

import rest.gwas.client.GwasClient;
import rest.gwas.search.gen.phenotypes.SearchGenPhenotypes;
import rest.gwas.search.gen.studies.SearchStudy;
import rest.gwas.search.phenotype.SearchPhenotypes;
import rest.gwas.search.studies.SearchStudies;
import rest.pubchem.assays.PCAssayContainers;
import rest.pubchem.client.PubChemClient;
import rest.pubchem.compounds.PCCompounds;
import rest.pubchem.substances.PCSubstances;
import rest.pubmed.client.PubmedClient;
import rest.pubmed.efetch.Author;
import rest.pubmed.efetch.PubmedArticleSet;
import rest.pubmed.search.SearchTermPubMed;
import rest.umls.client.UmlsClient;
import rest.umls.search.SearchTerm;
import rest.umls.search.cui.SearchCUI;
import rest.umls.search.cui.definition.SearchDefinitionCUI;

/**
 *
 * @author sergiodiazpinilla
 */
public class PruebaLib {
    public static void main(String[] args) {
        UmlsClient  umlsClient = new UmlsClient();;
        SearchTerm searchTerm = umlsClient.searchTerm("Brain Cancer", null, null);
        System.out.println(searchTerm.getResult().getResults().get(0).getName());
        System.out.println("searchTerm page size:"+searchTerm.getPageSize());
        //SearchCUI cui = umlsClient.searchContentBYCUI(searchTerm.getResult().getResults().get(0).getUi());
        SearchDefinitionCUI s = umlsClient.searchDefinitionContentBYCUI(searchTerm.getResult().getResults().get(0).getUi());
        System.out.println("CUI->"+s.getResult().get(1).getValue());
        PubmedClient pubmedClient = new PubmedClient();
        SearchTermPubMed spm = pubmedClient.searchTerm("Lung Carcinoma Metastatic in the Brain");
        
        
	PubmedArticleSet searchTermPubMed=pubmedClient.searchEFetchById(spm.geteSearchResult().getIdlist().get(0));
        System.out.println("id:"+searchTermPubMed.getPubmedArticle().getMedlineCitation().getArticle().getArticleTitle());
	System.out.println("searchCUI:"+searchTermPubMed.getPubmedArticle().getMedlineCitation().getArticle().getAbstract_().getAbstractText());
        for(Author a:searchTermPubMed.getPubmedArticle().getMedlineCitation().getArticle().getAuthors()){
            System.out.println("A:"+a.getLastName());
        }
        
        
        PubChemClient pubchem = new PubChemClient();
        PCCompounds prueba=pubchem.getCompoundByName("Serotonin");
        System.out.println("PUBCHEID:"+prueba.getPCCompounds().get(0).getId().getId().getCid());
        System.out.println("PUBCHEIDURN:"+prueba.getPCCompounds());
        PCCompounds prueba1=pubchem.getCompoundByCID("10531");
        PCSubstances prueba2 = pubchem.getSustanceBySID("10531");
        
        PCAssayContainers prueba3 = pubchem.getAssayByAID("504526");
        
        if(prueba!=null){
                System.out.println("heavy atom:"+prueba.getPCCompounds().get(0).getCount().getHeavyAtom());
                System.out.println("heavy atom:"+prueba1.getPCCompounds().get(0).getCount().getHeavyAtom());
                System.out.println("heavy atom:"+prueba2.getPCSubstances().get(0).getXref().get(0).getRegid());
                System.out.println("heavy atom:"+prueba3.getPCAssayContainer().get(0).getAssay().getDescr().getName());
        }else{
                System.out.println("Error al consultar el servicio");
        }
        
        
        GwasClient gwasClient = new GwasClient();
        SearchStudy[] searchStudy = gwasClient.getStudiesByGen("BRCA1", "6");
        System.out.println("searchStudy:"+searchStudy[1].getCitations().get(0).getPubmedid());

        SearchStudies[] searchGebPhenotypesT=gwasClient.getStudies("Brain", "1");
        System.out.println("STUDIES"+searchGebPhenotypesT[0].getPhenotypes());
           
        SearchGenPhenotypes[] searchGebPhenotypes=gwasClient.getPhenotypesByGen("BRCA1", "1");
        System.out.println("searchStudy:"+searchGebPhenotypes[0].getPhenotypeAnnotations().get(0).getAnnotationDetail());

        SearchStudies[] searchStudies= gwasClient.getStudies("replication", "3");
        System.out.println("searchStudy:"+searchStudies[0].getLink());

        SearchPhenotypes[] searchPhenotypes= gwasClient.getPhenotypes("fever", "1");
        System.out.println("searchPhenotypes:"+searchPhenotypes[0].getLink());
    }
}
