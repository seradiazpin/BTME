
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para vsCodeDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="vsCodeDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="classType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defaultPreferredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="release" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rootSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceUi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vsCodeDTO", propOrder = {
    "classType",
    "defaultPreferredName",
    "handle",
    "release",
    "rootSource",
    "sourceUi",
    "subType"
})
@XmlSeeAlso({
    VsCodeDetailedDTO.class
})
public class VsCodeDTO {

    protected String classType;
    protected String defaultPreferredName;
    protected String handle;
    protected String release;
    protected String rootSource;
    protected String sourceUi;
    protected String subType;

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
     * Obtiene el valor de la propiedad handle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandle() {
        return handle;
    }

    /**
     * Define el valor de la propiedad handle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandle(String value) {
        this.handle = value;
    }

    /**
     * Obtiene el valor de la propiedad release.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelease() {
        return release;
    }

    /**
     * Define el valor de la propiedad release.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelease(String value) {
        this.release = value;
    }

    /**
     * Obtiene el valor de la propiedad rootSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootSource() {
        return rootSource;
    }

    /**
     * Define el valor de la propiedad rootSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootSource(String value) {
        this.rootSource = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceUi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUi() {
        return sourceUi;
    }

    /**
     * Define el valor de la propiedad sourceUi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUi(String value) {
        this.sourceUi = value;
    }

    /**
     * Obtiene el valor de la propiedad subType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Define el valor de la propiedad subType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

}
