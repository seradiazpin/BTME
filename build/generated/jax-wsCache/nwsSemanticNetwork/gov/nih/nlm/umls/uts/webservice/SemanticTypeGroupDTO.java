
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para semanticTypeGroupDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="semanticTypeGroupDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}validDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="semanticTypeCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "semanticTypeGroupDTO", propOrder = {
    "semanticTypeCount"
})
public class SemanticTypeGroupDTO
    extends ValidDTO
{

    protected int semanticTypeCount;

    /**
     * Obtiene el valor de la propiedad semanticTypeCount.
     * 
     */
    public int getSemanticTypeCount() {
        return semanticTypeCount;
    }

    /**
     * Define el valor de la propiedad semanticTypeCount.
     * 
     */
    public void setSemanticTypeCount(int value) {
        this.semanticTypeCount = value;
    }

}
