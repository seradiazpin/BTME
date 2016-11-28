
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sourceTermTypeDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sourceTermTypeDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="classType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="literal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="origValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rootSource" type="{http://webservice.uts.umls.nlm.nih.gov/}rootSourceDTO" minOccurs="0"/&gt;
 *         &lt;element name="sourceOriginated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="suppressible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="termType" type="{http://webservice.uts.umls.nlm.nih.gov/}termTypeDTO" minOccurs="0"/&gt;
 *         &lt;element name="versionsAgo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceTermTypeDTO", propOrder = {
    "classType",
    "handle",
    "literal",
    "origValue",
    "rootSource",
    "sourceOriginated",
    "suppressible",
    "termType",
    "versionsAgo"
})
public class SourceTermTypeDTO {

    protected String classType;
    protected String handle;
    protected boolean literal;
    protected String origValue;
    protected RootSourceDTO rootSource;
    protected boolean sourceOriginated;
    protected boolean suppressible;
    protected TermTypeDTO termType;
    protected int versionsAgo;

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

    /**
     * Obtiene el valor de la propiedad suppressible.
     * 
     */
    public boolean isSuppressible() {
        return suppressible;
    }

    /**
     * Define el valor de la propiedad suppressible.
     * 
     */
    public void setSuppressible(boolean value) {
        this.suppressible = value;
    }

    /**
     * Obtiene el valor de la propiedad termType.
     * 
     * @return
     *     possible object is
     *     {@link TermTypeDTO }
     *     
     */
    public TermTypeDTO getTermType() {
        return termType;
    }

    /**
     * Define el valor de la propiedad termType.
     * 
     * @param value
     *     allowed object is
     *     {@link TermTypeDTO }
     *     
     */
    public void setTermType(TermTypeDTO value) {
        this.termType = value;
    }

    /**
     * Obtiene el valor de la propiedad versionsAgo.
     * 
     */
    public int getVersionsAgo() {
        return versionsAgo;
    }

    /**
     * Define el valor de la propiedad versionsAgo.
     * 
     */
    public void setVersionsAgo(int value) {
        this.versionsAgo = value;
    }

}
