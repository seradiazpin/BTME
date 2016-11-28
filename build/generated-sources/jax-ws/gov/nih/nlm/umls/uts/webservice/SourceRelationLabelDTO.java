
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sourceRelationLabelDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sourceRelationLabelDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalRelationLabel" type="{http://webservice.uts.umls.nlm.nih.gov/}additionalRelationLabelDTO" minOccurs="0"/&gt;
 *         &lt;element name="classType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="domainId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functional" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="handle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inverse" type="{http://webservice.uts.umls.nlm.nih.gov/}sourceRelationLabelDTO" minOccurs="0"/&gt;
 *         &lt;element name="inverseFunctional" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="literal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="origValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rangeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relationLabel" type="{http://webservice.uts.umls.nlm.nih.gov/}relationLabelDTO" minOccurs="0"/&gt;
 *         &lt;element name="rootSource" type="{http://webservice.uts.umls.nlm.nih.gov/}rootSourceDTO" minOccurs="0"/&gt;
 *         &lt;element name="sourceOriginated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="symmetric" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="transitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "sourceRelationLabelDTO", propOrder = {
    "additionalRelationLabel",
    "classType",
    "domainId",
    "functional",
    "handle",
    "inverse",
    "inverseFunctional",
    "literal",
    "origValue",
    "rangeId",
    "relationLabel",
    "rootSource",
    "sourceOriginated",
    "symmetric",
    "transitive",
    "versionsAgo"
})
public class SourceRelationLabelDTO {

    protected AdditionalRelationLabelDTO additionalRelationLabel;
    protected String classType;
    protected String domainId;
    protected boolean functional;
    protected String handle;
    protected SourceRelationLabelDTO inverse;
    protected boolean inverseFunctional;
    protected boolean literal;
    protected String origValue;
    protected String rangeId;
    protected RelationLabelDTO relationLabel;
    protected RootSourceDTO rootSource;
    protected boolean sourceOriginated;
    protected boolean symmetric;
    protected boolean transitive;
    protected int versionsAgo;

    /**
     * Obtiene el valor de la propiedad additionalRelationLabel.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalRelationLabelDTO }
     *     
     */
    public AdditionalRelationLabelDTO getAdditionalRelationLabel() {
        return additionalRelationLabel;
    }

    /**
     * Define el valor de la propiedad additionalRelationLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalRelationLabelDTO }
     *     
     */
    public void setAdditionalRelationLabel(AdditionalRelationLabelDTO value) {
        this.additionalRelationLabel = value;
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
     * Obtiene el valor de la propiedad inverse.
     * 
     * @return
     *     possible object is
     *     {@link SourceRelationLabelDTO }
     *     
     */
    public SourceRelationLabelDTO getInverse() {
        return inverse;
    }

    /**
     * Define el valor de la propiedad inverse.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceRelationLabelDTO }
     *     
     */
    public void setInverse(SourceRelationLabelDTO value) {
        this.inverse = value;
    }

    /**
     * Obtiene el valor de la propiedad inverseFunctional.
     * 
     */
    public boolean isInverseFunctional() {
        return inverseFunctional;
    }

    /**
     * Define el valor de la propiedad inverseFunctional.
     * 
     */
    public void setInverseFunctional(boolean value) {
        this.inverseFunctional = value;
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
     * Obtiene el valor de la propiedad rangeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeId() {
        return rangeId;
    }

    /**
     * Define el valor de la propiedad rangeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeId(String value) {
        this.rangeId = value;
    }

    /**
     * Obtiene el valor de la propiedad relationLabel.
     * 
     * @return
     *     possible object is
     *     {@link RelationLabelDTO }
     *     
     */
    public RelationLabelDTO getRelationLabel() {
        return relationLabel;
    }

    /**
     * Define el valor de la propiedad relationLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationLabelDTO }
     *     
     */
    public void setRelationLabel(RelationLabelDTO value) {
        this.relationLabel = value;
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
     * Obtiene el valor de la propiedad symmetric.
     * 
     */
    public boolean isSymmetric() {
        return symmetric;
    }

    /**
     * Define el valor de la propiedad symmetric.
     * 
     */
    public void setSymmetric(boolean value) {
        this.symmetric = value;
    }

    /**
     * Obtiene el valor de la propiedad transitive.
     * 
     */
    public boolean isTransitive() {
        return transitive;
    }

    /**
     * Define el valor de la propiedad transitive.
     * 
     */
    public void setTransitive(boolean value) {
        this.transitive = value;
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
