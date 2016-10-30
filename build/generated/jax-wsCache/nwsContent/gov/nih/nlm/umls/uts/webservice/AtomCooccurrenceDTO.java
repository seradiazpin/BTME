
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para atomCooccurrenceDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="atomCooccurrenceDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}dataDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="relatedAtom" type="{http://webservice.uts.umls.nlm.nih.gov/}atomDTO" minOccurs="0"/&gt;
 *         &lt;element name="subheadingCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atomCooccurrenceDTO", propOrder = {
    "frequency",
    "relatedAtom",
    "subheadingCount",
    "type"
})
public class AtomCooccurrenceDTO
    extends DataDTO
{

    protected long frequency;
    protected AtomDTO relatedAtom;
    protected int subheadingCount;
    protected String type;

    /**
     * Obtiene el valor de la propiedad frequency.
     * 
     */
    public long getFrequency() {
        return frequency;
    }

    /**
     * Define el valor de la propiedad frequency.
     * 
     */
    public void setFrequency(long value) {
        this.frequency = value;
    }

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

    /**
     * Obtiene el valor de la propiedad subheadingCount.
     * 
     */
    public int getSubheadingCount() {
        return subheadingCount;
    }

    /**
     * Define el valor de la propiedad subheadingCount.
     * 
     */
    public void setSubheadingCount(int value) {
        this.subheadingCount = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
