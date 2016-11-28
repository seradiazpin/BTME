
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mapsetDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mapsetDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}sourceDataDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributeCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="complexity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromComplexity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromExhaustive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromRootSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mappingCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="separatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toComplexity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toExhaustive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toNullObject" type="{http://webservice.uts.umls.nlm.nih.gov/}mapObjectDTO" minOccurs="0"/&gt;
 *         &lt;element name="toRootSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="umlsSeparator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mapsetDTO", propOrder = {
    "attributeCount",
    "complexity",
    "fromComplexity",
    "fromExhaustive",
    "fromRootSource",
    "fromSource",
    "mappingCount",
    "name",
    "separatorCode",
    "toComplexity",
    "toExhaustive",
    "toNullObject",
    "toRootSource",
    "toSource",
    "type",
    "umlsSeparator",
    "version"
})
public class MapsetDTO
    extends SourceDataDTO
{

    protected int attributeCount;
    protected String complexity;
    protected String fromComplexity;
    protected String fromExhaustive;
    protected String fromRootSource;
    protected String fromSource;
    protected int mappingCount;
    protected String name;
    protected String separatorCode;
    protected String toComplexity;
    protected String toExhaustive;
    protected MapObjectDTO toNullObject;
    protected String toRootSource;
    protected String toSource;
    protected String type;
    protected String umlsSeparator;
    protected String version;

    /**
     * Obtiene el valor de la propiedad attributeCount.
     * 
     */
    public int getAttributeCount() {
        return attributeCount;
    }

    /**
     * Define el valor de la propiedad attributeCount.
     * 
     */
    public void setAttributeCount(int value) {
        this.attributeCount = value;
    }

    /**
     * Obtiene el valor de la propiedad complexity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexity() {
        return complexity;
    }

    /**
     * Define el valor de la propiedad complexity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexity(String value) {
        this.complexity = value;
    }

    /**
     * Obtiene el valor de la propiedad fromComplexity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromComplexity() {
        return fromComplexity;
    }

    /**
     * Define el valor de la propiedad fromComplexity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromComplexity(String value) {
        this.fromComplexity = value;
    }

    /**
     * Obtiene el valor de la propiedad fromExhaustive.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromExhaustive() {
        return fromExhaustive;
    }

    /**
     * Define el valor de la propiedad fromExhaustive.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromExhaustive(String value) {
        this.fromExhaustive = value;
    }

    /**
     * Obtiene el valor de la propiedad fromRootSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromRootSource() {
        return fromRootSource;
    }

    /**
     * Define el valor de la propiedad fromRootSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromRootSource(String value) {
        this.fromRootSource = value;
    }

    /**
     * Obtiene el valor de la propiedad fromSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromSource() {
        return fromSource;
    }

    /**
     * Define el valor de la propiedad fromSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromSource(String value) {
        this.fromSource = value;
    }

    /**
     * Obtiene el valor de la propiedad mappingCount.
     * 
     */
    public int getMappingCount() {
        return mappingCount;
    }

    /**
     * Define el valor de la propiedad mappingCount.
     * 
     */
    public void setMappingCount(int value) {
        this.mappingCount = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad separatorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparatorCode() {
        return separatorCode;
    }

    /**
     * Define el valor de la propiedad separatorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparatorCode(String value) {
        this.separatorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad toComplexity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToComplexity() {
        return toComplexity;
    }

    /**
     * Define el valor de la propiedad toComplexity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToComplexity(String value) {
        this.toComplexity = value;
    }

    /**
     * Obtiene el valor de la propiedad toExhaustive.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToExhaustive() {
        return toExhaustive;
    }

    /**
     * Define el valor de la propiedad toExhaustive.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToExhaustive(String value) {
        this.toExhaustive = value;
    }

    /**
     * Obtiene el valor de la propiedad toNullObject.
     * 
     * @return
     *     possible object is
     *     {@link MapObjectDTO }
     *     
     */
    public MapObjectDTO getToNullObject() {
        return toNullObject;
    }

    /**
     * Define el valor de la propiedad toNullObject.
     * 
     * @param value
     *     allowed object is
     *     {@link MapObjectDTO }
     *     
     */
    public void setToNullObject(MapObjectDTO value) {
        this.toNullObject = value;
    }

    /**
     * Obtiene el valor de la propiedad toRootSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRootSource() {
        return toRootSource;
    }

    /**
     * Define el valor de la propiedad toRootSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRootSource(String value) {
        this.toRootSource = value;
    }

    /**
     * Obtiene el valor de la propiedad toSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToSource() {
        return toSource;
    }

    /**
     * Define el valor de la propiedad toSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToSource(String value) {
        this.toSource = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad umlsSeparator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmlsSeparator() {
        return umlsSeparator;
    }

    /**
     * Define el valor de la propiedad umlsSeparator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUmlsSeparator(String value) {
        this.umlsSeparator = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
