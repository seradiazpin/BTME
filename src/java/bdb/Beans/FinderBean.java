/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdb.Beans;

import bdb.Logic.UMLSClient;
import bdb.Data.Information;
import gov.nih.nlm.umls.uts.webservice.UiLabel;
import gov.nih.nlm.umls.uts.webservice.UtsFault_Exception;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

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
    private UMLSClient umls;
    private String term;
    private String termID;
    private Information inf;
    private List<UiLabel> ans;
    
    public FinderBean() {
        ans = new ArrayList<>();
        inf = new Information();
        umls  = new UMLSClient();
        
    }
    
    public void find(){
        ans.clear();
        inf = new Information();
        try {
            ans = umls.findTerm(term);
            
        } catch (UtsFault_Exception ex) {
            ans.clear();
        }
    }


    public void information(String ui){
        try {
            termID = ui;
            inf = umls.termInformation(ui);
        } catch (UtsFault_Exception ex) {
            ans.clear();
        }
     
    }
    

    
    public String getTerm() {
        return term;
    }

    
    public List<UiLabel> getAns() {
        return ans;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Information getInf() {
        return inf;
    }

    public String getTermSpecific() {
        return termID;
    }
    
    
    
}
