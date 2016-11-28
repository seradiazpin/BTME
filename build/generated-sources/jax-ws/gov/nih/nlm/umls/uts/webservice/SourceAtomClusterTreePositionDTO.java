
package gov.nih.nlm.umls.uts.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sourceAtomClusterTreePositionDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sourceAtomClusterTreePositionDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.uts.umls.nlm.nih.gov/}treePositionDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cluster" type="{http://webservice.uts.umls.nlm.nih.gov/}sourceAtomClusterDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceAtomClusterTreePositionDTO", propOrder = {
    "cluster"
})
public class SourceAtomClusterTreePositionDTO
    extends TreePositionDTO
{

    protected SourceAtomClusterDTO cluster;

    /**
     * Obtiene el valor de la propiedad cluster.
     * 
     * @return
     *     possible object is
     *     {@link SourceAtomClusterDTO }
     *     
     */
    public SourceAtomClusterDTO getCluster() {
        return cluster;
    }

    /**
     * Define el valor de la propiedad cluster.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceAtomClusterDTO }
     *     
     */
    public void setCluster(SourceAtomClusterDTO value) {
        this.cluster = value;
    }

}
