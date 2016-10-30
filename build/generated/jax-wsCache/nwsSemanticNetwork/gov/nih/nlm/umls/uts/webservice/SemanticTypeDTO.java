
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para semanticTypeDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="semanticTypeDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="childCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="classType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="definition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="example" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nonHuman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relationCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="semanticTypeGroup" type="{http://webservice.uts.umls.nlm.nih.gov/}semanticTypeGroupDTO" minOccurs="0"/&gt;
 *         &lt;element name="treeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ui" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usageNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "semanticTypeDTO", propOrder = {
    "abbreviation",
    "childCount",
    "classType",
    "definition",
    "example",
    "nonHuman",
    "relationCount",
    "semanticTypeGroup",
    "treeNumber",
    "ui",
    "usageNote",
    "value"
})
public class SemanticTypeDTO {

    protected String abbreviation;
    protected int childCount;
    protected String classType;
    protected String definition;
    protected String example;
    protected String nonHuman;
    protected int relationCount;
    protected SemanticTypeGroupDTO semanticTypeGroup;
    protected String treeNumber;
    protected String ui;
    protected String usageNote;
    protected String value;

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
     * Obtiene el valor de la propiedad nonHuman.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonHuman() {
        return nonHuman;
    }

    /**
     * Define el valor de la propiedad nonHuman.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonHuman(String value) {
        this.nonHuman = value;
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
     * Obtiene el valor de la propiedad semanticTypeGroup.
     * 
     * @return
     *     possible object is
     *     {@link SemanticTypeGroupDTO }
     *     
     */
    public SemanticTypeGroupDTO getSemanticTypeGroup() {
        return semanticTypeGroup;
    }

    /**
     * Define el valor de la propiedad semanticTypeGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link SemanticTypeGroupDTO }
     *     
     */
    public void setSemanticTypeGroup(SemanticTypeGroupDTO value) {
        this.semanticTypeGroup = value;
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

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
