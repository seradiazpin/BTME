
package gov.nih.nlm.umls.uts.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rootSourceDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rootSourceDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}validDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acquisitionContact" type="{http://webservice.uts.umls.nlm.nih.gov/}contactInformationDTO" minOccurs="0"/&gt;
 *         &lt;element name="contentContact" type="{http://webservice.uts.umls.nlm.nih.gov/}contactInformationDTO" minOccurs="0"/&gt;
 *         &lt;element name="contextType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hierarchicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://webservice.uts.umls.nlm.nih.gov/}languageDTO" minOccurs="0"/&gt;
 *         &lt;element name="licenseContact" type="{http://webservice.uts.umls.nlm.nih.gov/}contactInformationDTO" minOccurs="0"/&gt;
 *         &lt;element name="preferredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restrictionLevel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="synonymousNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rootSourceDTO", propOrder = {
    "acquisitionContact",
    "contentContact",
    "contextType",
    "family",
    "hierarchicalName",
    "language",
    "licenseContact",
    "preferredName",
    "restrictionLevel",
    "shortName",
    "synonymousNames"
})
public class RootSourceDTO
    extends ValidDTO
{

    protected ContactInformationDTO acquisitionContact;
    protected ContactInformationDTO contentContact;
    protected String contextType;
    protected String family;
    protected String hierarchicalName;
    protected LanguageDTO language;
    protected ContactInformationDTO licenseContact;
    protected String preferredName;
    protected int restrictionLevel;
    protected String shortName;
    @XmlElement(nillable = true)
    protected List<String> synonymousNames;

    /**
     * Obtiene el valor de la propiedad acquisitionContact.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationDTO }
     *     
     */
    public ContactInformationDTO getAcquisitionContact() {
        return acquisitionContact;
    }

    /**
     * Define el valor de la propiedad acquisitionContact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationDTO }
     *     
     */
    public void setAcquisitionContact(ContactInformationDTO value) {
        this.acquisitionContact = value;
    }

    /**
     * Obtiene el valor de la propiedad contentContact.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationDTO }
     *     
     */
    public ContactInformationDTO getContentContact() {
        return contentContact;
    }

    /**
     * Define el valor de la propiedad contentContact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationDTO }
     *     
     */
    public void setContentContact(ContactInformationDTO value) {
        this.contentContact = value;
    }

    /**
     * Obtiene el valor de la propiedad contextType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextType() {
        return contextType;
    }

    /**
     * Define el valor de la propiedad contextType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextType(String value) {
        this.contextType = value;
    }

    /**
     * Obtiene el valor de la propiedad family.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamily() {
        return family;
    }

    /**
     * Define el valor de la propiedad family.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamily(String value) {
        this.family = value;
    }

    /**
     * Obtiene el valor de la propiedad hierarchicalName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchicalName() {
        return hierarchicalName;
    }

    /**
     * Define el valor de la propiedad hierarchicalName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchicalName(String value) {
        this.hierarchicalName = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link LanguageDTO }
     *     
     */
    public LanguageDTO getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageDTO }
     *     
     */
    public void setLanguage(LanguageDTO value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad licenseContact.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationDTO }
     *     
     */
    public ContactInformationDTO getLicenseContact() {
        return licenseContact;
    }

    /**
     * Define el valor de la propiedad licenseContact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationDTO }
     *     
     */
    public void setLicenseContact(ContactInformationDTO value) {
        this.licenseContact = value;
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
     * Obtiene el valor de la propiedad restrictionLevel.
     * 
     */
    public int getRestrictionLevel() {
        return restrictionLevel;
    }

    /**
     * Define el valor de la propiedad restrictionLevel.
     * 
     */
    public void setRestrictionLevel(int value) {
        this.restrictionLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad shortName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Define el valor de la propiedad shortName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
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

}
