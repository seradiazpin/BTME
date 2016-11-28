
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para termDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="termDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}atomClusterDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="atomCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="luinormForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="normForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="termStringCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "termDTO", propOrder = {
    "atomCount",
    "language",
    "luinormForm",
    "normForm",
    "termStringCount"
})
public class TermDTO
    extends AtomClusterDTO
{

    protected int atomCount;
    protected String language;
    protected String luinormForm;
    protected String normForm;
    protected int termStringCount;

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
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad luinormForm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLuinormForm() {
        return luinormForm;
    }

    /**
     * Define el valor de la propiedad luinormForm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLuinormForm(String value) {
        this.luinormForm = value;
    }

    /**
     * Obtiene el valor de la propiedad normForm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormForm() {
        return normForm;
    }

    /**
     * Define el valor de la propiedad normForm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormForm(String value) {
        this.normForm = value;
    }

    /**
     * Obtiene el valor de la propiedad termStringCount.
     * 
     */
    public int getTermStringCount() {
        return termStringCount;
    }

    /**
     * Define el valor de la propiedad termStringCount.
     * 
     */
    public void setTermStringCount(int value) {
        this.termStringCount = value;
    }

}
