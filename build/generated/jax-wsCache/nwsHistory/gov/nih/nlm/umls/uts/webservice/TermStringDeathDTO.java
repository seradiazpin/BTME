
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para termStringDeathDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="termStringDeathDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}changeRecordDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defaultPreferredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "termStringDeathDTO", propOrder = {
    "defaultPreferredName",
    "language"
})
public class TermStringDeathDTO
    extends ChangeRecordDTO
{

    protected String defaultPreferredName;
    protected String language;

    /**
     * Obtiene el valor de la propiedad defaultPreferredName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPreferredName() {
        return defaultPreferredName;
    }

    /**
     * Define el valor de la propiedad defaultPreferredName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPreferredName(String value) {
        this.defaultPreferredName = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
