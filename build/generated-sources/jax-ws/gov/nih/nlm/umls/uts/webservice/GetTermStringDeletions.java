
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getTermStringDeletions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getTermStringDeletions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="termStringId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTermStringDeletions", propOrder = {
    "ticket",
    "version",
    "termStringId",
    "fromVersion"
})
public class GetTermStringDeletions {

    protected String ticket;
    protected String version;
    protected String termStringId;
    protected String fromVersion;

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
     * Obtiene el valor de la propiedad termStringId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermStringId() {
        return termStringId;
    }

    /**
     * Define el valor de la propiedad termStringId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermStringId(String value) {
        this.termStringId = value;
    }

    /**
     * Obtiene el valor de la propiedad fromVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromVersion() {
        return fromVersion;
    }

    /**
     * Define el valor de la propiedad fromVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromVersion(String value) {
        this.fromVersion = value;
    }

}
