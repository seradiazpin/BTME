
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para conceptMergeDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="conceptMergeDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}changeRecordDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newConceptUi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conceptMergeDTO", propOrder = {
    "newConceptUi"
})
public class ConceptMergeDTO
    extends ChangeRecordDTO
{

    protected String newConceptUi;

    /**
     * Obtiene el valor de la propiedad newConceptUi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewConceptUi() {
        return newConceptUi;
    }

    /**
     * Define el valor de la propiedad newConceptUi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewConceptUi(String value) {
        this.newConceptUi = value;
    }

}
