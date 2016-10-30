
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sourceAtomClusterDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sourceAtomClusterDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}atomClusterDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="atomCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="atomRelationCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="attributeCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codeRelationCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="definitionCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="literal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="obsolete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="rootSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceConceptRelationCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sourceDescriptorRelationCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sourceOriginated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sourceUi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subsetMemberCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="treePositionCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cVMemberCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceAtomClusterDTO", propOrder = {
    "atomCount",
    "atomRelationCount",
    "attributeCount",
    "codeRelationCount",
    "definitionCount",
    "literal",
    "obsolete",
    "rootSource",
    "sourceConceptRelationCount",
    "sourceDescriptorRelationCount",
    "sourceOriginated",
    "sourceUi",
    "subType",
    "subsetMemberCount",
    "treePositionCount",
    "cvMemberCount"
})
public class SourceAtomClusterDTO
    extends AtomClusterDTO
{

    protected int atomCount;
    protected int atomRelationCount;
    protected int attributeCount;
    protected int codeRelationCount;
    protected int definitionCount;
    protected boolean literal;
    protected boolean obsolete;
    protected String rootSource;
    protected int sourceConceptRelationCount;
    protected int sourceDescriptorRelationCount;
    protected boolean sourceOriginated;
    protected String sourceUi;
    protected String subType;
    protected int subsetMemberCount;
    protected int treePositionCount;
    @XmlElement(name = "cVMemberCount")
    protected int cvMemberCount;

    /**
     * Obtiene el valor de la propiedad atomCount.
     * 
     */
    public int getAtomCount() {
        return atomCount;
    }

    /**
     * Define el valor de la propiedad atomCount.
     * 
     */
    public void setAtomCount(int value) {
        this.atomCount = value;
    }

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

    /**
     * Obtiene el valor de la propiedad cvMemberCount.
     * 
     */
    public int getCVMemberCount() {
        return cvMemberCount;
    }

    /**
     * Define el valor de la propiedad cvMemberCount.
     * 
     */
    public void setCVMemberCount(int value) {
        this.cvMemberCount = value;
    }

}
