
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para relationDefinitionEntryDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="relationDefinitionEntryDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}valueSetDefinitionDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalRelationLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forwardDirection" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="leafOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="relationLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "relationDefinitionEntryDTO", propOrder = {
    "additionalRelationLabel",
    "forwardDirection",
    "leafOnly",
    "relationLabel",
    "transitive",
    "ui"
})
public class RelationDefinitionEntryDTO
    extends ValueSetDefinitionDTO
{

    protected String additionalRelationLabel;
    protected boolean forwardDirection;
    protected boolean leafOnly;
    protected String relationLabel;
    protected boolean transitive;
    protected String ui;

    /**
     * Obtiene el valor de la propiedad additionalRelationLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalRelationLabel() {
        return additionalRelationLabel;
    }

    /**
     * Define el valor de la propiedad additionalRelationLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalRelationLabel(String value) {
        this.additionalRelationLabel = value;
    }

    /**
     * Obtiene el valor de la propiedad forwardDirection.
     * 
     */
    public boolean isForwardDirection() {
        return forwardDirection;
    }

    /**
     * Define el valor de la propiedad forwardDirection.
     * 
     */
    public void setForwardDirection(boolean value) {
        this.forwardDirection = value;
    }

    /**
     * Obtiene el valor de la propiedad leafOnly.
     * 
     */
    public boolean isLeafOnly() {
        return leafOnly;
    }

    /**
     * Define el valor de la propiedad leafOnly.
     * 
     */
    public void setLeafOnly(boolean value) {
        this.leafOnly = value;
    }

    /**
     * Obtiene el valor de la propiedad relationLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationLabel() {
        return relationLabel;
    }

    /**
     * Define el valor de la propiedad relationLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationLabel(String value) {
        this.relationLabel = value;
    }

    /**
     * Obtiene el valor de la propiedad transitive.
     * 
     */
    public boolean isTransitive() {
        return transitive;
    }

    /**
     * Define el valor de la propiedad transitive.
     * 
     */
    public void setTransitive(boolean value) {
        this.transitive = value;
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
