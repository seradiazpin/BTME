
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para relationContentViewMemberDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="relationContentViewMemberDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}contentViewMemberDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relation" type="{http://webservice.uts.umls.nlm.nih.gov/}relationDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relationContentViewMemberDTO", propOrder = {
    "relation"
})
public class RelationContentViewMemberDTO
    extends ContentViewMemberDTO
{

    protected RelationDTO relation;

    /**
     * Obtiene el valor de la propiedad relation.
     * 
     * @return
     *     possible object is
     *     {@link RelationDTO }
     *     
     */
    public RelationDTO getRelation() {
        return relation;
    }

    /**
     * Define el valor de la propiedad relation.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationDTO }
     *     
     */
    public void setRelation(RelationDTO value) {
        this.relation = value;
    }

}
