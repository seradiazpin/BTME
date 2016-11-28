
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para termStringDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="termStringDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}atomClusterDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="atomCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="term" type="{http://webservice.uts.umls.nlm.nih.gov/}termDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "termStringDTO", propOrder = {
    "atomCount",
    "name",
    "term"
})
public class TermStringDTO
    extends AtomClusterDTO
{

    protected int atomCount;
    protected String name;
    protected TermDTO term;

    /**
     * Obtiene el valor de la propiedad atomCount.
     * 
     */
    public int getAtomCount() {
        return atomCount;
    }

    /**
     * Define el valor de la propiedad atomCount.
     * 
     */
    public void setAtomCount(int value) {
        this.atomCount = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad term.
     * 
     * @return
     *     possible object is
     *     {@link TermDTO }
     *     
     */
    public TermDTO getTerm() {
        return term;
    }

    /**
     * Define el valor de la propiedad term.
     * 
     * @param value
     *     allowed object is
     *     {@link TermDTO }
     *     
     */
    public void setTerm(TermDTO value) {
        this.term = value;
    }

}
