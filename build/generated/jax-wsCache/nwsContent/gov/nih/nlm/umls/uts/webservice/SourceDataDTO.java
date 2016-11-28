
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sourceDataDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sourceDataDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}metathesaurusDataDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="literal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="obsolete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="rootSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceOriginated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sourceUi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceDataDTO", propOrder = {
    "literal",
    "obsolete",
    "rootSource",
    "sourceOriginated",
    "sourceUi"
})
@XmlSeeAlso({
    ValueSetDTO.class,
    SubsetDTO.class,
    AtomDTO.class,
    AttributeDTO.class,
    TreePositionDTO.class,
    DefinitionDTO.class,
    MappingDTO.class,
    MapObjectDTO.class,
    RelationDTO.class,
    MapsetDTO.class,
    SubsetMemberDTO.class
})
public class SourceDataDTO
    extends MetathesaurusDataDTO
{

    protected boolean literal;
    protected boolean obsolete;
    protected String rootSource;
    protected boolean sourceOriginated;
    protected String sourceUi;

    /**
     * Obtiene el valor de la propiedad literal.
     * 
     */
    public boolean isLiteral() {
        return literal;
    }

    /**
     * Define el valor de la propiedad literal.
     * 
     */
    public void setLiteral(boolean value) {
        this.literal = value;
    }

    /**
     * Obtiene el valor de la propiedad obsolete.
     * 
     */
    public boolean isObsolete() {
        return obsolete;
    }

    /**
     * Define el valor de la propiedad obsolete.
     * 
     */
    public void setObsolete(boolean value) {
        this.obsolete = value;
    }

    /**
     * Obtiene el valor de la propiedad rootSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootSource() {
        return rootSource;
    }

    /**
     * Define el valor de la propiedad rootSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootSource(String value) {
        this.rootSource = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceOriginated.
     * 
     */
    public boolean isSourceOriginated() {
        return sourceOriginated;
    }

    /**
     * Define el valor de la propiedad sourceOriginated.
     * 
     */
    public void setSourceOriginated(boolean value) {
        this.sourceOriginated = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceUi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUi() {
        return sourceUi;
    }

    /**
     * Define el valor de la propiedad sourceUi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUi(String value) {
        this.sourceUi = value;
    }

}
