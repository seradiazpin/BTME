
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mappingDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mappingDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}sourceDataDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="attributeCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mapFrom" type="{http://webservice.uts.umls.nlm.nih.gov/}mapObjectDTO" minOccurs="0"/&gt;
 *         &lt;element name="mapSetHandle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mapTo" type="{http://webservice.uts.umls.nlm.nih.gov/}mapObjectDTO" minOccurs="0"/&gt;
 *         &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subsetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "mappingDTO", propOrder = {
    "additionalLabel",
    "attributeCount",
    "label",
    "mapFrom",
    "mapSetHandle",
    "mapTo",
    "rank",
    "restriction",
    "rule",
    "subsetId",
    "type"
})
public class MappingDTO
    extends SourceDataDTO
{

    protected String additionalLabel;
    protected int attributeCount;
    protected String label;
    protected MapObjectDTO mapFrom;
    protected String mapSetHandle;
    protected MapObjectDTO mapTo;
    protected String rank;
    protected String restriction;
    protected String rule;
    protected String subsetId;
    protected String type;

    /**
     * Obtiene el valor de la propiedad additionalLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalLabel() {
        return additionalLabel;
    }

    /**
     * Define el valor de la propiedad additionalLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalLabel(String value) {
        this.additionalLabel = value;
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
     * Obtiene el valor de la propiedad label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Define el valor de la propiedad label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Obtiene el valor de la propiedad mapFrom.
     * 
     * @return
     *     possible object is
     *     {@link MapObjectDTO }
     *     
     */
    public MapObjectDTO getMapFrom() {
        return mapFrom;
    }

    /**
     * Define el valor de la propiedad mapFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link MapObjectDTO }
     *     
     */
    public void setMapFrom(MapObjectDTO value) {
        this.mapFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad mapSetHandle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapSetHandle() {
        return mapSetHandle;
    }

    /**
     * Define el valor de la propiedad mapSetHandle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapSetHandle(String value) {
        this.mapSetHandle = value;
    }

    /**
     * Obtiene el valor de la propiedad mapTo.
     * 
     * @return
     *     possible object is
     *     {@link MapObjectDTO }
     *     
     */
    public MapObjectDTO getMapTo() {
        return mapTo;
    }

    /**
     * Define el valor de la propiedad mapTo.
     * 
     * @param value
     *     allowed object is
     *     {@link MapObjectDTO }
     *     
     */
    public void setMapTo(MapObjectDTO value) {
        this.mapTo = value;
    }

    /**
     * Obtiene el valor de la propiedad rank.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRank() {
        return rank;
    }

    /**
     * Define el valor de la propiedad rank.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRank(String value) {
        this.rank = value;
    }

    /**
     * Obtiene el valor de la propiedad restriction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestriction() {
        return restriction;
    }

    /**
     * Define el valor de la propiedad restriction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestriction(String value) {
        this.restriction = value;
    }

    /**
     * Obtiene el valor de la propiedad rule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRule() {
        return rule;
    }

    /**
     * Define el valor de la propiedad rule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRule(String value) {
        this.rule = value;
    }

    /**
     * Obtiene el valor de la propiedad subsetId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsetId() {
        return subsetId;
    }

    /**
     * Define el valor de la propiedad subsetId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsetId(String value) {
        this.subsetId = value;
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
