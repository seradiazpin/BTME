
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para semanticTypeRelationDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="semanticTypeRelationDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="classType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defined" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="handle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inherited" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="relatedSemanticType" type="{http://webservice.uts.umls.nlm.nih.gov/}semanticTypeDTO" minOccurs="0"/&gt;
 *         &lt;element name="relationLabel" type="{http://webservice.uts.umls.nlm.nih.gov/}semanticNetworkRelationLabelDTO" minOccurs="0"/&gt;
 *         &lt;element name="semanticType" type="{http://webservice.uts.umls.nlm.nih.gov/}semanticTypeDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "semanticTypeRelationDTO", propOrder = {
    "blocked",
    "classType",
    "defined",
    "handle",
    "inherited",
    "relatedSemanticType",
    "relationLabel",
    "semanticType"
})
public class SemanticTypeRelationDTO {

    protected boolean blocked;
    protected String classType;
    protected boolean defined;
    protected String handle;
    protected boolean inherited;
    protected SemanticTypeDTO relatedSemanticType;
    protected SemanticNetworkRelationLabelDTO relationLabel;
    protected SemanticTypeDTO semanticType;

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
     * Obtiene el valor de la propiedad relatedSemanticType.
     * 
     * @return
     *     possible object is
     *     {@link SemanticTypeDTO }
     *     
     */
    public SemanticTypeDTO getRelatedSemanticType() {
        return relatedSemanticType;
    }

    /**
     * Define el valor de la propiedad relatedSemanticType.
     * 
     * @param value
     *     allowed object is
     *     {@link SemanticTypeDTO }
     *     
     */
    public void setRelatedSemanticType(SemanticTypeDTO value) {
        this.relatedSemanticType = value;
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
     * Obtiene el valor de la propiedad semanticType.
     * 
     * @return
     *     possible object is
     *     {@link SemanticTypeDTO }
     *     
     */
    public SemanticTypeDTO getSemanticType() {
        return semanticType;
    }

    /**
     * Define el valor de la propiedad semanticType.
     * 
     * @param value
     *     allowed object is
     *     {@link SemanticTypeDTO }
     *     
     */
    public void setSemanticType(SemanticTypeDTO value) {
        this.semanticType = value;
    }

}
