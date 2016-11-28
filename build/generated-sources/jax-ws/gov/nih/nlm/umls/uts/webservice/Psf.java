
package gov.nih.nlm.umls.uts.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para psf complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="psf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includeObsolete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includeSuppressible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includedAdditionalRelationLabels" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="includedAttributeNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="includedLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="includedRelationLabels" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="includedSources" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="includedTermTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="includedWords" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pageLn" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pageNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="paging" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sortBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sortOrderAscending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "psf", propOrder = {
    "caseSensitive",
    "includeObsolete",
    "includeSuppressible",
    "includedAdditionalRelationLabels",
    "includedAttributeNames",
    "includedLanguage",
    "includedRelationLabels",
    "includedSources",
    "includedTermTypes",
    "includedWords",
    "pageLn",
    "pageNum",
    "paging",
    "sortBy",
    "sortOrderAscending"
})
public class Psf {

    protected Boolean caseSensitive;
    protected Boolean includeObsolete;
    protected Boolean includeSuppressible;
    @XmlElement(nillable = true)
    protected List<String> includedAdditionalRelationLabels;
    @XmlElement(nillable = true)
    protected List<String> includedAttributeNames;
    protected String includedLanguage;
    @XmlElement(nillable = true)
    protected List<String> includedRelationLabels;
    @XmlElement(nillable = true)
    protected List<String> includedSources;
    @XmlElement(nillable = true)
    protected List<String> includedTermTypes;
    @XmlElement(nillable = true)
    protected List<String> includedWords;
    protected int pageLn;
    protected int pageNum;
    protected int paging;
    protected String sortBy;
    protected Boolean sortOrderAscending;

    /**
     * Obtiene el valor de la propiedad caseSensitive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCaseSensitive() {
        return caseSensitive;
    }

    /**
     * Define el valor de la propiedad caseSensitive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaseSensitive(Boolean value) {
        this.caseSensitive = value;
    }

    /**
     * Obtiene el valor de la propiedad includeObsolete.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeObsolete() {
        return includeObsolete;
    }

    /**
     * Define el valor de la propiedad includeObsolete.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeObsolete(Boolean value) {
        this.includeObsolete = value;
    }

    /**
     * Obtiene el valor de la propiedad includeSuppressible.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSuppressible() {
        return includeSuppressible;
    }

    /**
     * Define el valor de la propiedad includeSuppressible.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSuppressible(Boolean value) {
        this.includeSuppressible = value;
    }

    /**
     * Gets the value of the includedAdditionalRelationLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedAdditionalRelationLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedAdditionalRelationLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludedAdditionalRelationLabels() {
        if (includedAdditionalRelationLabels == null) {
            includedAdditionalRelationLabels = new ArrayList<String>();
        }
        return this.includedAdditionalRelationLabels;
    }

    /**
     * Gets the value of the includedAttributeNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedAttributeNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedAttributeNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludedAttributeNames() {
        if (includedAttributeNames == null) {
            includedAttributeNames = new ArrayList<String>();
        }
        return this.includedAttributeNames;
    }

    /**
     * Obtiene el valor de la propiedad includedLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludedLanguage() {
        return includedLanguage;
    }

    /**
     * Define el valor de la propiedad includedLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludedLanguage(String value) {
        this.includedLanguage = value;
    }

    /**
     * Gets the value of the includedRelationLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedRelationLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedRelationLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludedRelationLabels() {
        if (includedRelationLabels == null) {
            includedRelationLabels = new ArrayList<String>();
        }
        return this.includedRelationLabels;
    }

    /**
     * Gets the value of the includedSources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedSources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludedSources() {
        if (includedSources == null) {
            includedSources = new ArrayList<String>();
        }
        return this.includedSources;
    }

    /**
     * Gets the value of the includedTermTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedTermTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedTermTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludedTermTypes() {
        if (includedTermTypes == null) {
            includedTermTypes = new ArrayList<String>();
        }
        return this.includedTermTypes;
    }

    /**
     * Gets the value of the includedWords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedWords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedWords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludedWords() {
        if (includedWords == null) {
            includedWords = new ArrayList<String>();
        }
        return this.includedWords;
    }

    /**
     * Obtiene el valor de la propiedad pageLn.
     * 
     */
    public int getPageLn() {
        return pageLn;
    }

    /**
     * Define el valor de la propiedad pageLn.
     * 
     */
    public void setPageLn(int value) {
        this.pageLn = value;
    }

    /**
     * Obtiene el valor de la propiedad pageNum.
     * 
     */
    public int getPageNum() {
        return pageNum;
    }

    /**
     * Define el valor de la propiedad pageNum.
     * 
     */
    public void setPageNum(int value) {
        this.pageNum = value;
    }

    /**
     * Obtiene el valor de la propiedad paging.
     * 
     */
    public int getPaging() {
        return paging;
    }

    /**
     * Define el valor de la propiedad paging.
     * 
     */
    public void setPaging(int value) {
        this.paging = value;
    }

    /**
     * Obtiene el valor de la propiedad sortBy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * Define el valor de la propiedad sortBy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortBy(String value) {
        this.sortBy = value;
    }

    /**
     * Obtiene el valor de la propiedad sortOrderAscending.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSortOrderAscending() {
        return sortOrderAscending;
    }

    /**
     * Define el valor de la propiedad sortOrderAscending.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSortOrderAscending(Boolean value) {
        this.sortOrderAscending = value;
    }

}
