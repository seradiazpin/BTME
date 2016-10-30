
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para completeValueSetDefinitionEntryDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="completeValueSetDefinitionEntryDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}valueSetDefinitionDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valueSet" type="{http://webservice.uts.umls.nlm.nih.gov/}valueSetDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "completeValueSetDefinitionEntryDTO", propOrder = {
    "valueSet"
})
public class CompleteValueSetDefinitionEntryDTO
    extends ValueSetDefinitionDTO
{

    protected ValueSetDTO valueSet;

    /**
     * Obtiene el valor de la propiedad valueSet.
     * 
     * @return
     *     possible object is
     *     {@link ValueSetDTO }
     *     
     */
    public ValueSetDTO getValueSet() {
        return valueSet;
    }

    /**
     * Define el valor de la propiedad valueSet.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueSetDTO }
     *     
     */
    public void setValueSet(ValueSetDTO value) {
        this.valueSet = value;
    }

}
