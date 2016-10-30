
package gov.nih.nlm.umls.uts.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para explicitListDetailedDefinitionEntryDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="explicitListDetailedDefinitionEntryDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}valueSetDefinitionDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceAtomClusters" type="{http://webservice.uts.umls.nlm.nih.gov/}sourceAtomClusterDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "explicitListDetailedDefinitionEntryDTO", propOrder = {
    "sourceAtomClusters"
})
public class ExplicitListDetailedDefinitionEntryDTO
    extends ValueSetDefinitionDTO
{

    @XmlElement(nillable = true)
    protected List<SourceAtomClusterDTO> sourceAtomClusters;

    /**
     * Gets the value of the sourceAtomClusters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceAtomClusters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceAtomClusters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceAtomClusterDTO }
     * 
     * 
     */
    public List<SourceAtomClusterDTO> getSourceAtomClusters() {
        if (sourceAtomClusters == null) {
            sourceAtomClusters = new ArrayList<SourceAtomClusterDTO>();
        }
        return this.sourceAtomClusters;
    }

}
