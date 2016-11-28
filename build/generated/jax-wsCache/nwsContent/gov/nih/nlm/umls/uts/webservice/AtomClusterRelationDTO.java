
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para atomClusterRelationDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="atomClusterRelationDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}relationDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relatedAtomCluster" type="{http://webservice.uts.umls.nlm.nih.gov/}atomClusterDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atomClusterRelationDTO", propOrder = {
    "relatedAtomCluster"
})
public class AtomClusterRelationDTO
    extends RelationDTO
{

    protected AtomClusterDTO relatedAtomCluster;

    /**
     * Obtiene el valor de la propiedad relatedAtomCluster.
     * 
     * @return
     *     possible object is
     *     {@link AtomClusterDTO }
     *     
     */
    public AtomClusterDTO getRelatedAtomCluster() {
        return relatedAtomCluster;
    }

    /**
     * Define el valor de la propiedad relatedAtomCluster.
     * 
     * @param value
     *     allowed object is
     *     {@link AtomClusterDTO }
     *     
     */
    public void setRelatedAtomCluster(AtomClusterDTO value) {
        this.relatedAtomCluster = value;
    }

}
