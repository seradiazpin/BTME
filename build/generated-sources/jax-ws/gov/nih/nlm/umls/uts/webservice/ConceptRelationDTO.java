
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para conceptRelationDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="conceptRelationDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}relationDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relatedConcept" type="{http://webservice.uts.umls.nlm.nih.gov/}conceptDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conceptRelationDTO", propOrder = {
    "relatedConcept"
})
public class ConceptRelationDTO
    extends RelationDTO
{

    protected ConceptDTO relatedConcept;

    /**
     * Obtiene el valor de la propiedad relatedConcept.
     * 
     * @return
     *     possible object is
     *     {@link ConceptDTO }
     *     
     */
    public ConceptDTO getRelatedConcept() {
        return relatedConcept;
    }

    /**
     * Define el valor de la propiedad relatedConcept.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptDTO }
     *     
     */
    public void setRelatedConcept(ConceptDTO value) {
        this.relatedConcept = value;
    }

}
