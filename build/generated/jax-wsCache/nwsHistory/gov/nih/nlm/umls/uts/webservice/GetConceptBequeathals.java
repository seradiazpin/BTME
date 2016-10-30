
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getConceptBequeathals complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getConceptBequeathals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newerVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conceptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="olderVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConceptBequeathals", propOrder = {
    "ticket",
    "newerVersion",
    "conceptId",
    "olderVersion"
})
public class GetConceptBequeathals {

    protected String ticket;
    protected String newerVersion;
    protected String conceptId;
    protected String olderVersion;

    /**
     * Obtiene el valor de la propiedad ticket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * Define el valor de la propiedad ticket.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicket(String value) {
        this.ticket = value;
    }

    /**
     * Obtiene el valor de la propiedad newerVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewerVersion() {
        return newerVersion;
    }

    /**
     * Define el valor de la propiedad newerVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewerVersion(String value) {
        this.newerVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptId() {
        return conceptId;
    }

    /**
     * Define el valor de la propiedad conceptId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptId(String value) {
        this.conceptId = value;
    }

    /**
     * Obtiene el valor de la propiedad olderVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOlderVersion() {
        return olderVersion;
    }

    /**
     * Define el valor de la propiedad olderVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOlderVersion(String value) {
        this.olderVersion = value;
    }

}
