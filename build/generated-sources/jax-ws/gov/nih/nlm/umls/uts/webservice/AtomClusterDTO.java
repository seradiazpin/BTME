
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para atomClusterDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="atomClusterDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}metathesaurusDataDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defaultPreferredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atomClusterDTO", propOrder = {
    "defaultPreferredName"
})
@XmlSeeAlso({
    SourceAtomClusterDTO.class,
    ConceptDTO.class,
    TermStringDTO.class,
    TermDTO.class
})
public class AtomClusterDTO
    extends MetathesaurusDataDTO
{

    protected String defaultPreferredName;

    /**
     * Obtiene el valor de la propiedad defaultPreferredName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPreferredName() {
        return defaultPreferredName;
    }

    /**
     * Define el valor de la propiedad defaultPreferredName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPreferredName(String value) {
        this.defaultPreferredName = value;
    }

}
