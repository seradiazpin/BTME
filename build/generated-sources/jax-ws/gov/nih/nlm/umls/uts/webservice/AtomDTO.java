
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para atomDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="atomDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}sourceDataDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="atomRelationCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="attributeCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cocCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="code" type="{http://webservice.uts.umls.nlm.nih.gov/}sourceAtomClusterDTO" minOccurs="0"/&gt;
 *         &lt;element name="codeRelationCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="concept" type="{http://webservice.uts.umls.nlm.nih.gov/}conceptDTO" minOccurs="0"/&gt;
 *         &lt;element name="conceptRelationCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cooccurrenceCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cvMemberCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="definitionCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="relationCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sourceConcept" type="{http://webservice.uts.umls.nlm.nih.gov/}sourceAtomClusterDTO" minOccurs="0"/&gt;
 *         &lt;element name="sourceConceptRelationCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sourceDescriptor" type="{http://webservice.uts.umls.nlm.nih.gov/}sourceAtomClusterDTO" minOccurs="0"/&gt;
 *         &lt;element name="sourceDescriptorRelationCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="subsetMemberCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="termString" type="{http://webservice.uts.umls.nlm.nih.gov/}termStringDTO" minOccurs="0"/&gt;
 *         &lt;element name="termType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="treePositionCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atomDTO", propOrder = {
    "atomRelationCount",
    "attributeCount",
    "cocCount",
    "code",
    "codeRelationCount",
    "concept",
    "conceptRelationCount",
    "cooccurrenceCount",
    "cvMemberCount",
    "definitionCount",
    "relationCount",
    "sourceConcept",
    "sourceConceptRelationCount",
    "sourceDescriptor",
    "sourceDescriptorRelationCount",
    "subsetMemberCount",
    "termString",
    "termType",
    "treePositionCount"
})
public class AtomDTO
    extends SourceDataDTO
{

    protected int atomRelationCount;
    protected int attributeCount;
    protected int cocCount;
    protected SourceAtomClusterDTO code;
    protected int codeRelationCount;
    protected ConceptDTO concept;
    protected int conceptRelationCount;
    protected int cooccurrenceCount;
    protected int cvMemberCount;
    protected int definitionCount;
    protected int relationCount;
    protected SourceAtomClusterDTO sourceConcept;
    protected int sourceConceptRelationCount;
    protected SourceAtomClusterDTO sourceDescriptor;
    protected int sourceDescriptorRelationCount;
    protected int subsetMemberCount;
    protected TermStringDTO termString;
    protected String termType;
    protected int treePositionCount;

    /**
     * Obtiene el valor de la propiedad atomRelationCount.
     * 
     */
    public int getAtomRelationCount() {
        return atomRelationCount;
    }

    /**
     * Define el valor de la propiedad atomRelationCount.
     * 
     */
    public void setAtomRelationCount(int value) {
        this.atomRelationCount = value;
    }

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
     * Obtiene el valor de la propiedad cocCount.
     * 
     */
    public int getCocCount() {
        return cocCount;
    }

    /**
     * Define el valor de la propiedad cocCount.
     * 
     */
    public void setCocCount(int value) {
        this.cocCount = value;
    }

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link SourceAtomClusterDTO }
     *     
     */
    public SourceAtomClusterDTO getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceAtomClusterDTO }
     *     
     */
    public void setCode(SourceAtomClusterDTO value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad codeRelationCount.
     * 
     */
    public int getCodeRelationCount() {
        return codeRelationCount;
    }

    /**
     * Define el valor de la propiedad codeRelationCount.
     * 
     */
    public void setCodeRelationCount(int value) {
        this.codeRelationCount = value;
    }

    /**
     * Obtiene el valor de la propiedad concept.
     * 
     * @return
     *     possible object is
     *     {@link ConceptDTO }
     *     
     */
    public ConceptDTO getConcept() {
        return concept;
    }

    /**
     * Define el valor de la propiedad concept.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptDTO }
     *     
     */
    public void setConcept(ConceptDTO value) {
        this.concept = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptRelationCount.
     * 
     */
    public int getConceptRelationCount() {
        return conceptRelationCount;
    }

    /**
     * Define el valor de la propiedad conceptRelationCount.
     * 
     */
    public void setConceptRelationCount(int value) {
        this.conceptRelationCount = value;
    }

    /**
     * Obtiene el valor de la propiedad cooccurrenceCount.
     * 
     */
    public int getCooccurrenceCount() {
        return cooccurrenceCount;
    }

    /**
     * Define el valor de la propiedad cooccurrenceCount.
     * 
     */
    public void setCooccurrenceCount(int value) {
        this.cooccurrenceCount = value;
    }

    /**
     * Obtiene el valor de la propiedad cvMemberCount.
     * 
     */
    public int getCvMemberCount() {
        return cvMemberCount;
    }

    /**
     * Define el valor de la propiedad cvMemberCount.
     * 
     */
    public void setCvMemberCount(int value) {
        this.cvMemberCount = value;
    }

    /**
     * Obtiene el valor de la propiedad definitionCount.
     * 
     */
    public int getDefinitionCount() {
        return definitionCount;
    }

    /**
     * Define el valor de la propiedad definitionCount.
     * 
     */
    public void setDefinitionCount(int value) {
        this.definitionCount = value;
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
     * Obtiene el valor de la propiedad sourceConcept.
     * 
     * @return
     *     possible object is
     *     {@link SourceAtomClusterDTO }
     *     
     */
    public SourceAtomClusterDTO getSourceConcept() {
        return sourceConcept;
    }

    /**
     * Define el valor de la propiedad sourceConcept.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceAtomClusterDTO }
     *     
     */
    public void setSourceConcept(SourceAtomClusterDTO value) {
        this.sourceConcept = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceConceptRelationCount.
     * 
     */
    public int getSourceConceptRelationCount() {
        return sourceConceptRelationCount;
    }

    /**
     * Define el valor de la propiedad sourceConceptRelationCount.
     * 
     */
    public void setSourceConceptRelationCount(int value) {
        this.sourceConceptRelationCount = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceDescriptor.
     * 
     * @return
     *     possible object is
     *     {@link SourceAtomClusterDTO }
     *     
     */
    public SourceAtomClusterDTO getSourceDescriptor() {
        return sourceDescriptor;
    }

    /**
     * Define el valor de la propiedad sourceDescriptor.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceAtomClusterDTO }
     *     
     */
    public void setSourceDescriptor(SourceAtomClusterDTO value) {
        this.sourceDescriptor = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceDescriptorRelationCount.
     * 
     */
    public int getSourceDescriptorRelationCount() {
        return sourceDescriptorRelationCount;
    }

    /**
     * Define el valor de la propiedad sourceDescriptorRelationCount.
     * 
     */
    public void setSourceDescriptorRelationCount(int value) {
        this.sourceDescriptorRelationCount = value;
    }

    /**
     * Obtiene el valor de la propiedad subsetMemberCount.
     * 
     */
    public int getSubsetMemberCount() {
        return subsetMemberCount;
    }

    /**
     * Define el valor de la propiedad subsetMemberCount.
     * 
     */
    public void setSubsetMemberCount(int value) {
        this.subsetMemberCount = value;
    }

    /**
     * Obtiene el valor de la propiedad termString.
     * 
     * @return
     *     possible object is
     *     {@link TermStringDTO }
     *     
     */
    public TermStringDTO getTermString() {
        return termString;
    }

    /**
     * Define el valor de la propiedad termString.
     * 
     * @param value
     *     allowed object is
     *     {@link TermStringDTO }
     *     
     */
    public void setTermString(TermStringDTO value) {
        this.termString = value;
    }

    /**
     * Obtiene el valor de la propiedad termType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermType() {
        return termType;
    }

    /**
     * Define el valor de la propiedad termType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermType(String value) {
        this.termType = value;
    }

    /**
     * Obtiene el valor de la propiedad treePositionCount.
     * 
     */
    public int getTreePositionCount() {
        return treePositionCount;
    }

    /**
     * Define el valor de la propiedad treePositionCount.
     * 
     */
    public void setTreePositionCount(int value) {
        this.treePositionCount = value;
    }

}
