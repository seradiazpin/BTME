
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resolveVSDetailedAttributeDefinitionEntry complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resolveVSDetailedAttributeDefinitionEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entry" type="{http://webservice.uts.umls.nlm.nih.gov/}attributeDefinitionEntryDTO" minOccurs="0"/&gt;
 *         &lt;element name="psf" type="{http://webservice.uts.umls.nlm.nih.gov/}psf" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resolveVSDetailedAttributeDefinitionEntry", propOrder = {
    "ticket",
    "entry",
    "psf"
})
public class ResolveVSDetailedAttributeDefinitionEntry {

    protected String ticket;
    protected AttributeDefinitionEntryDTO entry;
    protected Psf psf;

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
     * Obtiene el valor de la propiedad entry.
     * 
     * @return
     *     possible object is
     *     {@link AttributeDefinitionEntryDTO }
     *     
     */
    public AttributeDefinitionEntryDTO getEntry() {
        return entry;
    }

    /**
     * Define el valor de la propiedad entry.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeDefinitionEntryDTO }
     *     
     */
    public void setEntry(AttributeDefinitionEntryDTO value) {
        this.entry = value;
    }

    /**
     * Obtiene el valor de la propiedad psf.
     * 
     * @return
     *     possible object is
     *     {@link Psf }
     *     
     */
    public Psf getPsf() {
        return psf;
    }

    /**
     * Define el valor de la propiedad psf.
     * 
     * @param value
     *     allowed object is
     *     {@link Psf }
     *     
     */
    public void setPsf(Psf value) {
        this.psf = value;
    }

}
