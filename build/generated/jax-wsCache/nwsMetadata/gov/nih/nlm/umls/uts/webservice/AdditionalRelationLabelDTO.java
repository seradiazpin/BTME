
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para additionalRelationLabelDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="additionalRelationLabelDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}validDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inverse" type="{http://webservice.uts.umls.nlm.nih.gov/}additionalRelationLabelDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionalRelationLabelDTO", propOrder = {
    "inverse"
})
public class AdditionalRelationLabelDTO
    extends ValidDTO
{

    protected AdditionalRelationLabelDTO inverse;

    /**
     * Obtiene el valor de la propiedad inverse.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalRelationLabelDTO }
     *     
     */
    public AdditionalRelationLabelDTO getInverse() {
        return inverse;
    }

    /**
     * Define el valor de la propiedad inverse.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalRelationLabelDTO }
     *     
     */
    public void setInverse(AdditionalRelationLabelDTO value) {
        this.inverse = value;
    }

}
