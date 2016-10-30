
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para semanticNetworkRelationLabelRelationDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="semanticNetworkRelationLabelRelationDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="classType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defined" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="handle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inherited" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="relatedSNRelationLabel" type="{http://webservice.uts.umls.nlm.nih.gov/}semanticNetworkRelationLabelDTO" minOccurs="0"/&gt;
 *         &lt;element name="relationLabel" type="{http://webservice.uts.umls.nlm.nih.gov/}semanticNetworkRelationLabelDTO" minOccurs="0"/&gt;
 *         &lt;element name="snRelationLabel" type="{http://webservice.uts.umls.nlm.nih.gov/}semanticNetworkRelationLabelDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "semanticNetworkRelationLabelRelationDTO", propOrder = {
    "blocked",
    "classType",
    "defined",
    "handle",
    "inherited",
    "relatedSNRelationLabel",
    "relationLabel",
    "snRelationLabel"
})
public class SemanticNetworkRelationLabelRelationDTO {

    protected boolean blocked;
    protected String classType;
    protected boolean defined;
    protected String handle;
    protected boolean inherited;
    protected SemanticNetworkRelationLabelDTO relatedSNRelationLabel;
    protected SemanticNetworkRelationLabelDTO relationLabel;
    protected SemanticNetworkRelationLabelDTO snRelationLabel;

    /**
     * Obtiene el valor de la propiedad blocked.
     * 
     */
    public boolean isBlocked() {
        return blocked;
    }

    /**
     * Define el valor de la propiedad blocked.
     * 
     */
    public void setBlocked(boolean value) {
        this.blocked = value;
    }

    /**
     * Obtiene el valor de la propiedad classType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassType() {
        return classType;
    }

    /**
     * Define el valor de la propiedad classType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassType(String value) {
        this.classType = value;
    }

    /**
     * Obtiene el valor de la propiedad defined.
     * 
     */
    public boolean isDefined() {
        return defined;
    }

    /**
     * Define el valor de la propiedad defined.
     * 
     */
    public void setDefined(boolean value) {
        this.defined = value;
    }

    /**
     * Obtiene el valor de la propiedad handle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandle() {
        return handle;
    }

    /**
     * Define el valor de la propiedad handle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandle(String value) {
        this.handle = value;
    }

    /**
     * Obtiene el valor de la propiedad inherited.
     * 
     */
    public boolean isInherited() {
        return inherited;
    }

    /**
     * Define el valor de la propiedad inherited.
     * 
     */
    public void setInherited(boolean value) {
        this.inherited = value;
    }

    /**
     * Obtiene el valor de la propiedad relatedSNRelationLabel.
     * 
     * @return
     *     possible object is
     *     {@link SemanticNetworkRelationLabelDTO }
     *     
     */
    public SemanticNetworkRelationLabelDTO getRelatedSNRelationLabel() {
        return relatedSNRelationLabel;
    }

    /**
     * Define el valor de la propiedad relatedSNRelationLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link SemanticNetworkRelationLabelDTO }
     *     
     */
    public void setRelatedSNRelationLabel(SemanticNetworkRelationLabelDTO value) {
        this.relatedSNRelationLabel = value;
    }

    /**
     * Obtiene el valor de la propiedad relationLabel.
     * 
     * @return
     *     possible object is
     *     {@link SemanticNetworkRelationLabelDTO }
     *     
     */
    public SemanticNetworkRelationLabelDTO getRelationLabel() {
        return relationLabel;
    }

    /**
     * Define el valor de la propiedad relationLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link SemanticNetworkRelationLabelDTO }
     *     
     */
    public void setRelationLabel(SemanticNetworkRelationLabelDTO value) {
        this.relationLabel = value;
    }

    /**
     * Obtiene el valor de la propiedad snRelationLabel.
     * 
     * @return
     *     possible object is
     *     {@link SemanticNetworkRelationLabelDTO }
     *     
     */
    public SemanticNetworkRelationLabelDTO getSnRelationLabel() {
        return snRelationLabel;
    }

    /**
     * Define el valor de la propiedad snRelationLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link SemanticNetworkRelationLabelDTO }
     *     
     */
    public void setSnRelationLabel(SemanticNetworkRelationLabelDTO value) {
        this.snRelationLabel = value;
    }

}
