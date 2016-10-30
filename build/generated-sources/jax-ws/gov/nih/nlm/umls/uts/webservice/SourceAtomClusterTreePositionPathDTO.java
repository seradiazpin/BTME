
package gov.nih.nlm.umls.uts.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sourceAtomClusterTreePositionPathDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sourceAtomClusterTreePositionPathDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="classType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="treePositions" type="{http://webservice.uts.umls.nlm.nih.gov/}sourceAtomClusterTreePositionDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceAtomClusterTreePositionPathDTO", propOrder = {
    "classType",
    "treePositions"
})
public class SourceAtomClusterTreePositionPathDTO {

    protected String classType;
    @XmlElement(nillable = true)
    protected List<SourceAtomClusterTreePositionDTO> treePositions;

    /**
     * Obtiene el valor de la propiedad classType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassType() {
        return classType;
    }

    /**
     * Define el valor de la propiedad classType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassType(String value) {
        this.classType = value;
    }

    /**
     * Gets the value of the treePositions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the treePositions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTreePositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceAtomClusterTreePositionDTO }
     * 
     * 
     */
    public List<SourceAtomClusterTreePositionDTO> getTreePositions() {
        if (treePositions == null) {
            treePositions = new ArrayList<SourceAtomClusterTreePositionDTO>();
        }
        return this.treePositions;
    }

}
