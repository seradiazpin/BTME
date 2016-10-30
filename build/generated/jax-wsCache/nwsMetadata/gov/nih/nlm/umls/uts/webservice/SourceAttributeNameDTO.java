
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sourceAttributeNameDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sourceAttributeNameDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributeName" type="{http://webservice.uts.umls.nlm.nih.gov/}attributeNameDTO" minOccurs="0"/&gt;
 *         &lt;element name="classType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="domainId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functional" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="handle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="literal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="origValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rootSource" type="{http://webservice.uts.umls.nlm.nih.gov/}rootSourceDTO" minOccurs="0"/&gt;
 *         &lt;element name="sourceOriginated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceAttributeNameDTO", propOrder = {
    "attributeName",
    "classType",
    "domainId",
    "functional",
    "handle",
    "literal",
    "origValue",
    "rootSource",
    "sourceOriginated"
})
public class SourceAttributeNameDTO {

    protected AttributeNameDTO attributeName;
    protected String classType;
    protected String domainId;
    protected boolean functional;
    protected String handle;
    protected boolean literal;
    protected String origValue;
    protected RootSourceDTO rootSource;
    protected boolean sourceOriginated;

    /**
     * Obtiene el valor de la propiedad attributeName.
     * 
     * @return
     *     possible object is
     *     {@link AttributeNameDTO }
     *     
     */
    public AttributeNameDTO getAttributeName() {
        return attributeName;
    }

    /**
     * Define el valor de la propiedad attributeName.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeNameDTO }
     *     
     */
    public void setAttributeName(AttributeNameDTO value) {
        this.attributeName = value;
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
     * Obtiene el valor de la propiedad domainId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * Define el valor de la propiedad domainId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainId(String value) {
        this.domainId = value;
    }

    /**
     * Obtiene el valor de la propiedad functional.
     * 
     */
    public boolean isFunctional() {
        return functional;
    }

    /**
     * Define el valor de la propiedad functional.
     * 
     */
    public void setFunctional(boolean value) {
        this.functional = value;
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
     * Obtiene el valor de la propiedad literal.
     * 
     */
    public boolean isLiteral() {
        return literal;
    }

    /**
     * Define el valor de la propiedad literal.
     * 
     */
    public void setLiteral(boolean value) {
        this.literal = value;
    }

    /**
     * Obtiene el valor de la propiedad origValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigValue() {
        return origValue;
    }

    /**
     * Define el valor de la propiedad origValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigValue(String value) {
        this.origValue = value;
    }

    /**
     * Obtiene el valor de la propiedad rootSource.
     * 
     * @return
     *     possible object is
     *     {@link RootSourceDTO }
     *     
     */
    public RootSourceDTO getRootSource() {
        return rootSource;
    }

    /**
     * Define el valor de la propiedad rootSource.
     * 
     * @param value
     *     allowed object is
     *     {@link RootSourceDTO }
     *     
     */
    public void setRootSource(RootSourceDTO value) {
        this.rootSource = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceOriginated.
     * 
     */
    public boolean isSourceOriginated() {
        return sourceOriginated;
    }

    /**
     * Define el valor de la propiedad sourceOriginated.
     * 
     */
    public void setSourceOriginated(boolean value) {
        this.sourceOriginated = value;
    }

}
