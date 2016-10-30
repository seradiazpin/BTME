
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para termMergeDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="termMergeDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}changeRecordDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newTermUi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "termMergeDTO", propOrder = {
    "newTermUi"
})
public class TermMergeDTO
    extends ChangeRecordDTO
{

    protected String newTermUi;

    /**
     * Obtiene el valor de la propiedad newTermUi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewTermUi() {
        return newTermUi;
    }

    /**
     * Define el valor de la propiedad newTermUi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewTermUi(String value) {
        this.newTermUi = value;
    }

}
