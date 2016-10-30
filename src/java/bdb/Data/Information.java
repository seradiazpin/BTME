/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdb.Data;


import gov.nih.nlm.umls.uts.webservice.AtomDTO;
import gov.nih.nlm.umls.uts.webservice.ConceptDTO;
import gov.nih.nlm.umls.uts.webservice.DefinitionDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sergiodiazpinilla
 */
public class Information {

    private ConceptDTO concept;
    private List<DefinitionDTO> definitions;

    public Information() {
        this.definitions = new ArrayList<>();
    }
    
    public Information(ConceptDTO conceptDTO, List<DefinitionDTO> definitions) {
        this.concept = conceptDTO;
        this.definitions = definitions;
    }

    public ConceptDTO getConcept() {
        return concept;
    }

    
    public List<DefinitionDTO> getDefinitions() {
        return definitions;
    }
    

    


    
}
