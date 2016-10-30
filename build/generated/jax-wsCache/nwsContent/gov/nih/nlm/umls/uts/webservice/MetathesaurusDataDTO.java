
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para metathesaurusDataDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="metathesaurusDataDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}dataDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="suppressible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ui" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metathesaurusDataDTO", propOrder = {
    "suppressible",
    "ui"
})
@XmlSeeAlso({
    ContentViewDTO.class,
    AtomClusterDTO.class,
    ContentViewMemberDTO.class,
    SourceDataDTO.class
})
public class MetathesaurusDataDTO
    extends DataDTO
{

    protected boolean suppressible;
    protected String ui;

    /**
     * Obtiene el valor de la propiedad suppressible.
     * 
     */
    public boolean isSuppressible() {
        return suppressible;
    }

    /**
     * Define el valor de la propiedad suppressible.
     * 
     */
    public void setSuppressible(boolean value) {
        this.suppressible = value;
    }

    /**
     * Obtiene el valor de la propiedad ui.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUi() {
        return ui;
    }

    /**
     * Define el valor de la propiedad ui.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUi(String value) {
        this.ui = value;
    }

}
