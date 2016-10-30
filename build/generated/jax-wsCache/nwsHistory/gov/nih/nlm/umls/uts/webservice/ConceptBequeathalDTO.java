
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para conceptBequeathalDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="conceptBequeathalDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}conceptDeathDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relatedConceptUi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conceptBequeathalDTO", propOrder = {
    "additionalLabel",
    "label",
    "relatedConceptUi"
})
public class ConceptBequeathalDTO
    extends ConceptDeathDTO
{

    protected String additionalLabel;
    protected String label;
    protected String relatedConceptUi;

    /**
     * Obtiene el valor de la propiedad additionalLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalLabel() {
        return additionalLabel;
    }

    /**
     * Define el valor de la propiedad additionalLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalLabel(String value) {
        this.additionalLabel = value;
    }

    /**
     * Obtiene el valor de la propiedad label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Define el valor de la propiedad label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Obtiene el valor de la propiedad relatedConceptUi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedConceptUi() {
        return relatedConceptUi;
    }

    /**
     * Define el valor de la propiedad relatedConceptUi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedConceptUi(String value) {
        this.relatedConceptUi = value;
    }

}
