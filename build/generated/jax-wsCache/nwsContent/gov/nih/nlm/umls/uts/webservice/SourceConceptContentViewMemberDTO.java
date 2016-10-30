
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sourceConceptContentViewMemberDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sourceConceptContentViewMemberDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}contentViewMemberDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceConcept" type="{http://webservice.uts.umls.nlm.nih.gov/}sourceAtomClusterDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceConceptContentViewMemberDTO", propOrder = {
    "sourceConcept"
})
public class SourceConceptContentViewMemberDTO
    extends ContentViewMemberDTO
{

    protected SourceAtomClusterDTO sourceConcept;

    /**
     * Obtiene el valor de la propiedad sourceConcept.
     * 
     * @return
     *     possible object is
     *     {@link SourceAtomClusterDTO }
     *     
     */
    public SourceAtomClusterDTO getSourceConcept() {
        return sourceConcept;
    }

    /**
     * Define el valor de la propiedad sourceConcept.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceAtomClusterDTO }
     *     
     */
    public void setSourceConcept(SourceAtomClusterDTO value) {
        this.sourceConcept = value;
    }

}
