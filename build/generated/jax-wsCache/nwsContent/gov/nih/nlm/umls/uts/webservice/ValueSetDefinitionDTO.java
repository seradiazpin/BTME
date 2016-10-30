
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para valueSetDefinitionDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="valueSetDefinitionDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}dataDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceui" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueSetDefinitionDTO", propOrder = {
    "operator",
    "sourceui",
    "version"
})
@XmlSeeAlso({
    CompleteValueSetDefinitionEntryDTO.class,
    CompleteSourceDefinitionEntryDTO.class,
    RelationDefinitionEntryDTO.class,
    ExplicitListDefinitionEntryDTO.class,
    AttributeDefinitionEntryDTO.class,
    ExplicitListDetailedDefinitionEntryDTO.class
})
public class ValueSetDefinitionDTO
    extends DataDTO
{

    protected String operator;
    protected String sourceui;
    protected String version;

    /**
     * Obtiene el valor de la propiedad operator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Define el valor de la propiedad operator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceui.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceui() {
        return sourceui;
    }

    /**
     * Define el valor de la propiedad sourceui.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceui(String value) {
        this.sourceui = value;
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

}
