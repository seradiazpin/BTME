
package gov.nih.nlm.umls.uts.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para sourceDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sourceDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}validDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assertsRelDirection" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="atomCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="charset" type="{http://webservice.uts.umls.nlm.nih.gov/}characterSetDTO" minOccurs="0"/&gt;
 *         &lt;element name="citation" type="{http://webservice.uts.umls.nlm.nih.gov/}sourceCitationDTO" minOccurs="0"/&gt;
 *         &lt;element name="conceptCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="insertMetaVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preferredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="removeMetaVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rootSource" type="{http://webservice.uts.umls.nlm.nih.gov/}rootSourceDTO" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="synonymousNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="versionsAgo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceDTO", propOrder = {
    "assertsRelDirection",
    "atomCount",
    "charset",
    "citation",
    "conceptCount",
    "endDate",
    "insertMetaVersion",
    "preferredName",
    "removeMetaVersion",
    "rootSource",
    "startDate",
    "synonymousNames",
    "version",
    "versionsAgo"
})
public class SourceDTO
    extends ValidDTO
{

    protected boolean assertsRelDirection;
    protected int atomCount;
    protected CharacterSetDTO charset;
    protected SourceCitationDTO citation;
    protected int conceptCount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String insertMetaVersion;
    protected String preferredName;
    protected String removeMetaVersion;
    protected RootSourceDTO rootSource;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(nillable = true)
    protected List<String> synonymousNames;
    protected String version;
    protected int versionsAgo;

    /**
     * Obtiene el valor de la propiedad assertsRelDirection.
     * 
     */
    public boolean isAssertsRelDirection() {
        return assertsRelDirection;
    }

    /**
     * Define el valor de la propiedad assertsRelDirection.
     * 
     */
    public void setAssertsRelDirection(boolean value) {
        this.assertsRelDirection = value;
    }

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
     * Obtiene el valor de la propiedad charset.
     * 
     * @return
     *     possible object is
     *     {@link CharacterSetDTO }
     *     
     */
    public CharacterSetDTO getCharset() {
        return charset;
    }

    /**
     * Define el valor de la propiedad charset.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterSetDTO }
     *     
     */
    public void setCharset(CharacterSetDTO value) {
        this.charset = value;
    }

    /**
     * Obtiene el valor de la propiedad citation.
     * 
     * @return
     *     possible object is
     *     {@link SourceCitationDTO }
     *     
     */
    public SourceCitationDTO getCitation() {
        return citation;
    }

    /**
     * Define el valor de la propiedad citation.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceCitationDTO }
     *     
     */
    public void setCitation(SourceCitationDTO value) {
        this.citation = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptCount.
     * 
     */
    public int getConceptCount() {
        return conceptCount;
    }

    /**
     * Define el valor de la propiedad conceptCount.
     * 
     */
    public void setConceptCount(int value) {
        this.conceptCount = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Obtiene el valor de la propiedad insertMetaVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsertMetaVersion() {
        return insertMetaVersion;
    }

    /**
     * Define el valor de la propiedad insertMetaVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsertMetaVersion(String value) {
        this.insertMetaVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad preferredName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredName() {
        return preferredName;
    }

    /**
     * Define el valor de la propiedad preferredName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredName(String value) {
        this.preferredName = value;
    }

    /**
     * Obtiene el valor de la propiedad removeMetaVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoveMetaVersion() {
        return removeMetaVersion;
    }

    /**
     * Define el valor de la propiedad removeMetaVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoveMetaVersion(String value) {
        this.removeMetaVersion = value;
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
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the synonymousNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synonymousNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynonymousNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSynonymousNames() {
        if (synonymousNames == null) {
            synonymousNames = new ArrayList<String>();
        }
        return this.synonymousNames;
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
