
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para subsetDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="subsetDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}sourceDataDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="atomMemberCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="attributeCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relationMemberCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sourceConceptMemberCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subsetDTO", propOrder = {
    "atomMemberCount",
    "attributeCount",
    "description",
    "name",
    "relationMemberCount",
    "sourceConceptMemberCount"
})
public class SubsetDTO
    extends SourceDataDTO
{

    protected int atomMemberCount;
    protected int attributeCount;
    protected String description;
    protected String name;
    protected int relationMemberCount;
    protected int sourceConceptMemberCount;

    /**
     * Obtiene el valor de la propiedad atomMemberCount.
     * 
     */
    public int getAtomMemberCount() {
        return atomMemberCount;
    }

    /**
     * Define el valor de la propiedad atomMemberCount.
     * 
     */
    public void setAtomMemberCount(int value) {
        this.atomMemberCount = value;
    }

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
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Obtiene el valor de la propiedad relationMemberCount.
     * 
     */
    public int getRelationMemberCount() {
        return relationMemberCount;
    }

    /**
     * Define el valor de la propiedad relationMemberCount.
     * 
     */
    public void setRelationMemberCount(int value) {
        this.relationMemberCount = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceConceptMemberCount.
     * 
     */
    public int getSourceConceptMemberCount() {
        return sourceConceptMemberCount;
    }

    /**
     * Define el valor de la propiedad sourceConceptMemberCount.
     * 
     */
    public void setSourceConceptMemberCount(int value) {
        this.sourceConceptMemberCount = value;
    }

}
