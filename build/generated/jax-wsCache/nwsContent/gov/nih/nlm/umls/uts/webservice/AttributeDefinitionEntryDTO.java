
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para attributeDefinitionEntryDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="attributeDefinitionEntryDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}valueSetDefinitionDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="atn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attributeDefinitionEntryDTO", propOrder = {
    "atn",
    "matchText",
    "matchType"
})
public class AttributeDefinitionEntryDTO
    extends ValueSetDefinitionDTO
{

    protected String atn;
    protected String matchText;
    protected String matchType;

    /**
     * Obtiene el valor de la propiedad atn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtn() {
        return atn;
    }

    /**
     * Define el valor de la propiedad atn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtn(String value) {
        this.atn = value;
    }

    /**
     * Obtiene el valor de la propiedad matchText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchText() {
        return matchText;
    }

    /**
     * Define el valor de la propiedad matchText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchText(String value) {
        this.matchText = value;
    }

    /**
     * Obtiene el valor de la propiedad matchType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchType() {
        return matchType;
    }

    /**
     * Define el valor de la propiedad matchType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchType(String value) {
        this.matchType = value;
    }

}
