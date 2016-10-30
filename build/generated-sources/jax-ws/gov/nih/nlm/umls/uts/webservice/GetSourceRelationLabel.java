
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getSourceRelationLabel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getSourceRelationLabel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rootSourceAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relationLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalRelationLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSourceRelationLabel", propOrder = {
    "ticket",
    "version",
    "rootSourceAbbreviation",
    "relationLabel",
    "additionalRelationLabel"
})
public class GetSourceRelationLabel {

    protected String ticket;
    protected String version;
    protected String rootSourceAbbreviation;
    protected String relationLabel;
    protected String additionalRelationLabel;

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
     * Obtiene el valor de la propiedad rootSourceAbbreviation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootSourceAbbreviation() {
        return rootSourceAbbreviation;
    }

    /**
     * Define el valor de la propiedad rootSourceAbbreviation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootSourceAbbreviation(String value) {
        this.rootSourceAbbreviation = value;
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

}
