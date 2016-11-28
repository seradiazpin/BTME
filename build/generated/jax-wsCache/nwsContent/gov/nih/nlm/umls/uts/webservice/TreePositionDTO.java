
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para treePositionDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="treePositionDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}sourceDataDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalRelationLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="childCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="defaultPreferredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pathsToRootCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="siblingCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "treePositionDTO", propOrder = {
    "additionalRelationLabel",
    "childCount",
    "defaultPreferredName",
    "pathsToRootCount",
    "siblingCount"
})
@XmlSeeAlso({
    SourceAtomClusterTreePositionDTO.class,
    AtomTreePositionDTO.class
})
public class TreePositionDTO
    extends SourceDataDTO
{

    protected String additionalRelationLabel;
    protected int childCount;
    protected String defaultPreferredName;
    protected int pathsToRootCount;
    protected int siblingCount;

    /**
     * Obtiene el valor de la propiedad additionalRelationLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalRelationLabel() {
        return additionalRelationLabel;
    }

    /**
     * Define el valor de la propiedad additionalRelationLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalRelationLabel(String value) {
        this.additionalRelationLabel = value;
    }

    /**
     * Obtiene el valor de la propiedad childCount.
     * 
     */
    public int getChildCount() {
        return childCount;
    }

    /**
     * Define el valor de la propiedad childCount.
     * 
     */
    public void setChildCount(int value) {
        this.childCount = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultPreferredName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPreferredName() {
        return defaultPreferredName;
    }

    /**
     * Define el valor de la propiedad defaultPreferredName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPreferredName(String value) {
        this.defaultPreferredName = value;
    }

    /**
     * Obtiene el valor de la propiedad pathsToRootCount.
     * 
     */
    public int getPathsToRootCount() {
        return pathsToRootCount;
    }

    /**
     * Define el valor de la propiedad pathsToRootCount.
     * 
     */
    public void setPathsToRootCount(int value) {
        this.pathsToRootCount = value;
    }

    /**
     * Obtiene el valor de la propiedad siblingCount.
     * 
     */
    public int getSiblingCount() {
        return siblingCount;
    }

    /**
     * Define el valor de la propiedad siblingCount.
     * 
     */
    public void setSiblingCount(int value) {
        this.siblingCount = value;
    }

}
