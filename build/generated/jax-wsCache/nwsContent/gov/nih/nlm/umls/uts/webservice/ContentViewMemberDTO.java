
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para contentViewMemberDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contentViewMemberDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}metathesaurusDataDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributeCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="contentViewHandle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contentViewMemberDTO", propOrder = {
    "attributeCount",
    "contentViewHandle"
})
@XmlSeeAlso({
    AtomContentViewMemberDTO.class,
    ConceptContentViewMemberDTO.class,
    SourceConceptContentViewMemberDTO.class,
    RelationContentViewMemberDTO.class
})
public class ContentViewMemberDTO
    extends MetathesaurusDataDTO
{

    protected int attributeCount;
    protected String contentViewHandle;

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
     * Obtiene el valor de la propiedad contentViewHandle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentViewHandle() {
        return contentViewHandle;
    }

    /**
     * Define el valor de la propiedad contentViewHandle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentViewHandle(String value) {
        this.contentViewHandle = value;
    }

}
