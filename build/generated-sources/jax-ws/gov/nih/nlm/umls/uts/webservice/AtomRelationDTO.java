
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para atomRelationDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="atomRelationDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}relationDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relatedAtom" type="{http://webservice.uts.umls.nlm.nih.gov/}atomDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atomRelationDTO", propOrder = {
    "relatedAtom"
})
public class AtomRelationDTO
    extends RelationDTO
{

    protected AtomDTO relatedAtom;

    /**
     * Obtiene el valor de la propiedad relatedAtom.
     * 
     * @return
     *     possible object is
     *     {@link AtomDTO }
     *     
     */
    public AtomDTO getRelatedAtom() {
        return relatedAtom;
    }

    /**
     * Define el valor de la propiedad relatedAtom.
     * 
     * @param value
     *     allowed object is
     *     {@link AtomDTO }
     *     
     */
    public void setRelatedAtom(AtomDTO value) {
        this.relatedAtom = value;
    }

}
