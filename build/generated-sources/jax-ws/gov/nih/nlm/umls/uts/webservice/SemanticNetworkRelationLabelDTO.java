
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para semanticNetworkRelationLabelDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="semanticNetworkRelationLabelDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="childCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="classType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="definition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="example" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inverseLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relationCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="treeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ui" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "semanticNetworkRelationLabelDTO", propOrder = {
    "abbreviation",
    "childCount",
    "classType",
    "definition",
    "example",
    "inverseLabel",
    "label",
    "relationCount",
    "treeNumber",
    "ui",
    "usageNote"
})
public class SemanticNetworkRelationLabelDTO {

    protected String abbreviation;
    protected int childCount;
    protected String classType;
    protected String definition;
    protected String example;
    protected String inverseLabel;
    protected String label;
    protected int relationCount;
    protected String treeNumber;
    protected String ui;
    protected String usageNote;

    /**
     * Obtiene el valor de la propiedad abbreviation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Define el valor de la propiedad abbreviation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
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
     * Obtiene el valor de la propiedad definition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * Define el valor de la propiedad definition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinition(String value) {
        this.definition = value;
    }

    /**
     * Obtiene el valor de la propiedad example.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExample() {
        return example;
    }

    /**
     * Define el valor de la propiedad example.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExample(String value) {
        this.example = value;
    }

    /**
     * Obtiene el valor de la propiedad inverseLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInverseLabel() {
        return inverseLabel;
    }

    /**
     * Define el valor de la propiedad inverseLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInverseLabel(String value) {
        this.inverseLabel = value;
    }

    /**
     * Obtiene el valor de la propiedad label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Define el valor de la propiedad label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Obtiene el valor de la propiedad relationCount.
     * 
     */
    public int getRelationCount() {
        return relationCount;
    }

    /**
     * Define el valor de la propiedad relationCount.
     * 
     */
    public void setRelationCount(int value) {
        this.relationCount = value;
    }

    /**
     * Obtiene el valor de la propiedad treeNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreeNumber() {
        return treeNumber;
    }

    /**
     * Define el valor de la propiedad treeNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreeNumber(String value) {
        this.treeNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad ui.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUi() {
        return ui;
    }

    /**
     * Define el valor de la propiedad ui.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUi(String value) {
        this.ui = value;
    }

    /**
     * Obtiene el valor de la propiedad usageNote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageNote() {
        return usageNote;
    }

    /**
     * Define el valor de la propiedad usageNote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageNote(String value) {
        this.usageNote = value;
    }

}
