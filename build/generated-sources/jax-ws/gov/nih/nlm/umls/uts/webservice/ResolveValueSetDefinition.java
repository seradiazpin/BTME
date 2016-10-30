
package gov.nih.nlm.umls.uts.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resolveValueSetDefinition complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resolveValueSetDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entries" type="{http://webservice.uts.umls.nlm.nih.gov/}valueSetDefinitionDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "resolveValueSetDefinition", propOrder = {
    "ticket",
    "entries",
    "psf"
})
public class ResolveValueSetDefinition {

    protected String ticket;
    protected List<ValueSetDefinitionDTO> entries;
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
     * Gets the value of the entries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSetDefinitionDTO }
     * 
     * 
     */
    public List<ValueSetDefinitionDTO> getEntries() {
        if (entries == null) {
            entries = new ArrayList<ValueSetDefinitionDTO>();
        }
        return this.entries;
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
