
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getSemanticNetworkRelationLabelRelation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getSemanticNetworkRelationLabelRelation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="semanticTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="semanticRelationLabelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relatedSemanticTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSemanticNetworkRelationLabelRelation", propOrder = {
    "ticket",
    "version",
    "semanticTypeId",
    "semanticRelationLabelId",
    "relatedSemanticTypeId"
})
public class GetSemanticNetworkRelationLabelRelation {

    protected String ticket;
    protected String version;
    protected String semanticTypeId;
    protected String semanticRelationLabelId;
    protected String relatedSemanticTypeId;

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
     * Obtiene el valor de la propiedad semanticTypeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemanticTypeId() {
        return semanticTypeId;
    }

    /**
     * Define el valor de la propiedad semanticTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemanticTypeId(String value) {
        this.semanticTypeId = value;
    }

    /**
     * Obtiene el valor de la propiedad semanticRelationLabelId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemanticRelationLabelId() {
        return semanticRelationLabelId;
    }

    /**
     * Define el valor de la propiedad semanticRelationLabelId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemanticRelationLabelId(String value) {
        this.semanticRelationLabelId = value;
    }

    /**
     * Obtiene el valor de la propiedad relatedSemanticTypeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedSemanticTypeId() {
        return relatedSemanticTypeId;
    }

    /**
     * Define el valor de la propiedad relatedSemanticTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedSemanticTypeId(String value) {
        this.relatedSemanticTypeId = value;
    }

}
