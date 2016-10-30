
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para subsetMemberDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="subsetMemberDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}sourceDataDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributeCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="subsetHandle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subsetMemberDTO", propOrder = {
    "attributeCount",
    "subsetHandle"
})
@XmlSeeAlso({
    SourceConceptSubsetMemberDTO.class,
    AtomSubsetMemberDTO.class,
    RelationSubsetMemberDTO.class
})
public class SubsetMemberDTO
    extends SourceDataDTO
{

    protected int attributeCount;
    protected String subsetHandle;

    /**
     * Obtiene el valor de la propiedad attributeCount.
     * 
     */
    public int getAttributeCount() {
        return attributeCount;
    }

    /**
     * Define el valor de la propiedad attributeCount.
     * 
     */
    public void setAttributeCount(int value) {
        this.attributeCount = value;
    }

    /**
     * Obtiene el valor de la propiedad subsetHandle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsetHandle() {
        return subsetHandle;
    }

    /**
     * Define el valor de la propiedad subsetHandle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsetHandle(String value) {
        this.subsetHandle = value;
    }

}
