
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
 * <p>Clase Java para conceptDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="conceptDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}atomClusterDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="atomCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="attributeCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cvMemberCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dateAdded" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="definitionsCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="majorRevisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="relationCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="semanticTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conceptDTO", propOrder = {
    "atomCount",
    "attributeCount",
    "cvMemberCount",
    "dateAdded",
    "definitionsCount",
    "majorRevisionDate",
    "relationCount",
    "semanticTypes",
    "status"
})
public class ConceptDTO
    extends AtomClusterDTO
{

    protected int atomCount;
    protected int attributeCount;
    protected int cvMemberCount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAdded;
    protected int definitionsCount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar majorRevisionDate;
    protected int relationCount;
    @XmlElement(nillable = true)
    protected List<String> semanticTypes;
    protected String status;

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
     * Obtiene el valor de la propiedad dateAdded.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAdded() {
        return dateAdded;
    }

    /**
     * Define el valor de la propiedad dateAdded.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAdded(XMLGregorianCalendar value) {
        this.dateAdded = value;
    }

    /**
     * Obtiene el valor de la propiedad definitionsCount.
     * 
     */
    public int getDefinitionsCount() {
        return definitionsCount;
    }

    /**
     * Define el valor de la propiedad definitionsCount.
     * 
     */
    public void setDefinitionsCount(int value) {
        this.definitionsCount = value;
    }

    /**
     * Obtiene el valor de la propiedad majorRevisionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMajorRevisionDate() {
        return majorRevisionDate;
    }

    /**
     * Define el valor de la propiedad majorRevisionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMajorRevisionDate(XMLGregorianCalendar value) {
        this.majorRevisionDate = value;
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
     * Gets the value of the semanticTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the semanticTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSemanticTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSemanticTypes() {
        if (semanticTypes == null) {
            semanticTypes = new ArrayList<String>();
        }
        return this.semanticTypes;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
