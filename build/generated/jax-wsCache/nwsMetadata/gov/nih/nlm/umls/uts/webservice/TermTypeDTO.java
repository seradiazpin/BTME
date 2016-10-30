
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para termTypeDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="termTypeDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}validDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeVariantType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hierarchicalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nameVariantType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="obsolete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sourceTermType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="style" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "termTypeDTO", propOrder = {
    "codeVariantType",
    "hierarchicalType",
    "nameVariantType",
    "obsolete",
    "sourceTermType",
    "style",
    "usage"
})
public class TermTypeDTO
    extends ValidDTO
{

    protected String codeVariantType;
    protected String hierarchicalType;
    protected String nameVariantType;
    protected boolean obsolete;
    protected String sourceTermType;
    protected String style;
    protected String usage;

    /**
     * Obtiene el valor de la propiedad codeVariantType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeVariantType() {
        return codeVariantType;
    }

    /**
     * Define el valor de la propiedad codeVariantType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeVariantType(String value) {
        this.codeVariantType = value;
    }

    /**
     * Obtiene el valor de la propiedad hierarchicalType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchicalType() {
        return hierarchicalType;
    }

    /**
     * Define el valor de la propiedad hierarchicalType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchicalType(String value) {
        this.hierarchicalType = value;
    }

    /**
     * Obtiene el valor de la propiedad nameVariantType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameVariantType() {
        return nameVariantType;
    }

    /**
     * Define el valor de la propiedad nameVariantType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameVariantType(String value) {
        this.nameVariantType = value;
    }

    /**
     * Obtiene el valor de la propiedad obsolete.
     * 
     */
    public boolean isObsolete() {
        return obsolete;
    }

    /**
     * Define el valor de la propiedad obsolete.
     * 
     */
    public void setObsolete(boolean value) {
        this.obsolete = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceTermType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTermType() {
        return sourceTermType;
    }

    /**
     * Define el valor de la propiedad sourceTermType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceTermType(String value) {
        this.sourceTermType = value;
    }

    /**
     * Obtiene el valor de la propiedad style.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Define el valor de la propiedad style.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Obtiene el valor de la propiedad usage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Define el valor de la propiedad usage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

}
