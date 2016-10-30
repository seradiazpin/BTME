
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para contentViewDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contentViewDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}metathesaurusDataDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="algorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="atomMemberCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="attributeCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cascade" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="conceptMemberCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="contentViewClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contributor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contributorDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="contributorURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contributorVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="generated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="includeObsolete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="maintainer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maintainerDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="maintainerURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maintainerVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="previousMeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relationMemberCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sourceConceptMemberCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="subCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contentViewDTO", propOrder = {
    "algorithm",
    "atomMemberCount",
    "attributeCount",
    "cascade",
    "category",
    "code",
    "conceptMemberCount",
    "contentViewClass",
    "contributor",
    "contributorDate",
    "contributorURL",
    "contributorVersion",
    "description",
    "generated",
    "includeObsolete",
    "maintainer",
    "maintainerDate",
    "maintainerURL",
    "maintainerVersion",
    "name",
    "previousMeta",
    "relationMemberCount",
    "sourceConceptMemberCount",
    "subCategory"
})
public class ContentViewDTO
    extends MetathesaurusDataDTO
{

    protected String algorithm;
    protected int atomMemberCount;
    protected int attributeCount;
    protected boolean cascade;
    protected String category;
    protected long code;
    protected int conceptMemberCount;
    protected String contentViewClass;
    protected String contributor;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contributorDate;
    protected String contributorURL;
    protected String contributorVersion;
    protected String description;
    protected boolean generated;
    protected boolean includeObsolete;
    protected String maintainer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maintainerDate;
    protected String maintainerURL;
    protected String maintainerVersion;
    protected String name;
    protected String previousMeta;
    protected int relationMemberCount;
    protected int sourceConceptMemberCount;
    protected String subCategory;

    /**
     * Obtiene el valor de la propiedad algorithm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Define el valor de la propiedad algorithm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
    }

    /**
     * Obtiene el valor de la propiedad atomMemberCount.
     * 
     */
    public int getAtomMemberCount() {
        return atomMemberCount;
    }

    /**
     * Define el valor de la propiedad atomMemberCount.
     * 
     */
    public void setAtomMemberCount(int value) {
        this.atomMemberCount = value;
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
     * Obtiene el valor de la propiedad cascade.
     * 
     */
    public boolean isCascade() {
        return cascade;
    }

    /**
     * Define el valor de la propiedad cascade.
     * 
     */
    public void setCascade(boolean value) {
        this.cascade = value;
    }

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad code.
     * 
     */
    public long getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     */
    public void setCode(long value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptMemberCount.
     * 
     */
    public int getConceptMemberCount() {
        return conceptMemberCount;
    }

    /**
     * Define el valor de la propiedad conceptMemberCount.
     * 
     */
    public void setConceptMemberCount(int value) {
        this.conceptMemberCount = value;
    }

    /**
     * Obtiene el valor de la propiedad contentViewClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentViewClass() {
        return contentViewClass;
    }

    /**
     * Define el valor de la propiedad contentViewClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentViewClass(String value) {
        this.contentViewClass = value;
    }

    /**
     * Obtiene el valor de la propiedad contributor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContributor() {
        return contributor;
    }

    /**
     * Define el valor de la propiedad contributor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributor(String value) {
        this.contributor = value;
    }

    /**
     * Obtiene el valor de la propiedad contributorDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContributorDate() {
        return contributorDate;
    }

    /**
     * Define el valor de la propiedad contributorDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContributorDate(XMLGregorianCalendar value) {
        this.contributorDate = value;
    }

    /**
     * Obtiene el valor de la propiedad contributorURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContributorURL() {
        return contributorURL;
    }

    /**
     * Define el valor de la propiedad contributorURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributorURL(String value) {
        this.contributorURL = value;
    }

    /**
     * Obtiene el valor de la propiedad contributorVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContributorVersion() {
        return contributorVersion;
    }

    /**
     * Define el valor de la propiedad contributorVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributorVersion(String value) {
        this.contributorVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad generated.
     * 
     */
    public boolean isGenerated() {
        return generated;
    }

    /**
     * Define el valor de la propiedad generated.
     * 
     */
    public void setGenerated(boolean value) {
        this.generated = value;
    }

    /**
     * Obtiene el valor de la propiedad includeObsolete.
     * 
     */
    public boolean isIncludeObsolete() {
        return includeObsolete;
    }

    /**
     * Define el valor de la propiedad includeObsolete.
     * 
     */
    public void setIncludeObsolete(boolean value) {
        this.includeObsolete = value;
    }

    /**
     * Obtiene el valor de la propiedad maintainer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintainer() {
        return maintainer;
    }

    /**
     * Define el valor de la propiedad maintainer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintainer(String value) {
        this.maintainer = value;
    }

    /**
     * Obtiene el valor de la propiedad maintainerDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaintainerDate() {
        return maintainerDate;
    }

    /**
     * Define el valor de la propiedad maintainerDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaintainerDate(XMLGregorianCalendar value) {
        this.maintainerDate = value;
    }

    /**
     * Obtiene el valor de la propiedad maintainerURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintainerURL() {
        return maintainerURL;
    }

    /**
     * Define el valor de la propiedad maintainerURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintainerURL(String value) {
        this.maintainerURL = value;
    }

    /**
     * Obtiene el valor de la propiedad maintainerVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintainerVersion() {
        return maintainerVersion;
    }

    /**
     * Define el valor de la propiedad maintainerVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintainerVersion(String value) {
        this.maintainerVersion = value;
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
     * Obtiene el valor de la propiedad previousMeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousMeta() {
        return previousMeta;
    }

    /**
     * Define el valor de la propiedad previousMeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousMeta(String value) {
        this.previousMeta = value;
    }

    /**
     * Obtiene el valor de la propiedad relationMemberCount.
     * 
     */
    public int getRelationMemberCount() {
        return relationMemberCount;
    }

    /**
     * Define el valor de la propiedad relationMemberCount.
     * 
     */
    public void setRelationMemberCount(int value) {
        this.relationMemberCount = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceConceptMemberCount.
     * 
     */
    public int getSourceConceptMemberCount() {
        return sourceConceptMemberCount;
    }

    /**
     * Define el valor de la propiedad sourceConceptMemberCount.
     * 
     */
    public void setSourceConceptMemberCount(int value) {
        this.sourceConceptMemberCount = value;
    }

    /**
     * Obtiene el valor de la propiedad subCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCategory() {
        return subCategory;
    }

    /**
     * Define el valor de la propiedad subCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCategory(String value) {
        this.subCategory = value;
    }

}
