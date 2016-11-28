
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para atomContentViewMemberDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="atomContentViewMemberDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}contentViewMemberDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="atom" type="{http://webservice.uts.umls.nlm.nih.gov/}atomDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atomContentViewMemberDTO", propOrder = {
    "atom"
})
public class AtomContentViewMemberDTO
    extends ContentViewMemberDTO
{

    protected AtomDTO atom;

    /**
     * Obtiene el valor de la propiedad atom.
     * 
     * @return
     *     possible object is
     *     {@link AtomDTO }
     *     
     */
    public AtomDTO getAtom() {
        return atom;
    }

    /**
     * Define el valor de la propiedad atom.
     * 
     * @param value
     *     allowed object is
     *     {@link AtomDTO }
     *     
     */
    public void setAtom(AtomDTO value) {
        this.atom = value;
    }

}
