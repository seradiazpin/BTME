
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para relationLabelDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="relationLabelDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}validDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inverse" type="{http://webservice.uts.umls.nlm.nih.gov/}relationLabelDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relationLabelDTO", propOrder = {
    "inverse"
})
public class RelationLabelDTO
    extends ValidDTO
{

    protected RelationLabelDTO inverse;

    /**
     * Obtiene el valor de la propiedad inverse.
     * 
     * @return
     *     possible object is
     *     {@link RelationLabelDTO }
     *     
     */
    public RelationLabelDTO getInverse() {
        return inverse;
    }

    /**
     * Define el valor de la propiedad inverse.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationLabelDTO }
     *     
     */
    public void setInverse(RelationLabelDTO value) {
        this.inverse = value;
    }

}
