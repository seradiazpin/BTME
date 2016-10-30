
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para relationDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="relationDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}sourceDataDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalRelationLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="assertedDirection" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="attributeCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cvMemberCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fromSType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relatedCUI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relationCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="relationLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subsetMemberCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="toSType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relationDTO", propOrder = {
    "additionalRelationLabel",
    "assertedDirection",
    "attributeCount",
    "cvMemberCount",
    "fromSType",
    "groupId",
    "relatedCUI",
    "relationCount",
    "relationLabel",
    "subsetMemberCount",
    "toSType"
})
@XmlSeeAlso({
    AtomClusterRelationDTO.class,
    AtomRelationDTO.class,
    ConceptRelationDTO.class
})
public class RelationDTO
    extends SourceDataDTO
{

    protected String additionalRelationLabel;
    protected boolean assertedDirection;
    protected int attributeCount;
    protected int cvMemberCount;
    protected String fromSType;
    protected String groupId;
    protected String relatedCUI;
    protected int relationCount;
    protected String relationLabel;
    protected int subsetMemberCount;
    protected String toSType;

    /**
     * Obtiene el valor de la propiedad additionalRelationLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalRelationLabel() {
        return additionalRelationLabel;
    }

    /**
     * Define el valor de la propiedad additionalRelationLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalRelationLabel(String value) {
        this.additionalRelationLabel = value;
    }

    /**
     * Obtiene el valor de la propiedad assertedDirection.
     * 
     */
    public boolean isAssertedDirection() {
        return assertedDirection;
    }

    /**
     * Define el valor de la propiedad assertedDirection.
     * 
     */
    public void setAssertedDirection(boolean value) {
        this.assertedDirection = value;
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
     * Obtiene el valor de la propiedad fromSType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromSType() {
        return fromSType;
    }

    /**
     * Define el valor de la propiedad fromSType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromSType(String value) {
        this.fromSType = value;
    }

    /**
     * Obtiene el valor de la propiedad groupId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Define el valor de la propiedad groupId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Obtiene el valor de la propiedad relatedCUI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedCUI() {
        return relatedCUI;
    }

    /**
     * Define el valor de la propiedad relatedCUI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedCUI(String value) {
        this.relatedCUI = value;
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
     * Obtiene el valor de la propiedad relationLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationLabel() {
        return relationLabel;
    }

    /**
     * Define el valor de la propiedad relationLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationLabel(String value) {
        this.relationLabel = value;
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
     * Obtiene el valor de la propiedad toSType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToSType() {
        return toSType;
    }

    /**
     * Define el valor de la propiedad toSType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToSType(String value) {
        this.toSType = value;
    }

}
