//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.23 at 09:10:05 AM UTC 
//


package ovl.schema.gccs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for windareaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="windareaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}MIL_ID" minOccurs="0"/>
 *         &lt;element ref="{}NAME" minOccurs="0"/>
 *         &lt;element ref="{}DESCRIPTION" minOccurs="0"/>
 *         &lt;element ref="{}REMARKS" minOccurs="0"/>
 *         &lt;element ref="{}MAX_SCALE" minOccurs="0"/>
 *         &lt;element ref="{}MIN_SCALE" minOccurs="0"/>
 *         &lt;element ref="{}SCALE_ACTIVATED" minOccurs="0"/>
 *         &lt;element ref="{}LABEL_TYPE" minOccurs="0"/>
 *         &lt;element ref="{}VISIBILITY" minOccurs="0"/>
 *         &lt;element ref="{}PRIORITY" minOccurs="0"/>
 *         &lt;element ref="{}BLINK" minOccurs="0"/>
 *         &lt;element ref="{}URL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}LINE_COLOR" minOccurs="0"/>
 *         &lt;element name="LINE_GEOM" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element ref="{}TEXT" minOccurs="0"/>
 *         &lt;element ref="{}TEXTCOLOR" minOccurs="0"/>
 *         &lt;element ref="{}CENTER" minOccurs="0"/>
 *         &lt;element ref="{}POSITION" maxOccurs="unbounded"/>
 *         &lt;element name="INNER_AREA_POINT" type="{}LatLong" minOccurs="0"/>
 *         &lt;element name="SECOND_AREA_POINT" type="{}LatLong" minOccurs="0"/>
 *         &lt;element name="OUTER_AREA_POINT" type="{}LatLong" minOccurs="0"/>
 *         &lt;element name="LABEL_POINT" type="{}LatLong" minOccurs="0"/>
 *         &lt;element name="INNER_AREA_COLOR">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "windareaType", propOrder = {
    "milid",
    "name",
    "description",
    "remarks",
    "maxscale",
    "minscale",
    "scaleactivated",
    "labeltype",
    "visibility",
    "priority",
    "blink",
    "url",
    "linecolor",
    "linegeom",
    "text",
    "textcolor",
    "center",
    "position",
    "innerareapoint",
    "secondareapoint",
    "outerareapoint",
    "labelpoint",
    "innerareacolor"
})
public class WindareaType {

    @XmlElement(name = "MIL_ID")
    protected String milid;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "REMARKS")
    protected String remarks;
    @XmlElement(name = "MAX_SCALE", defaultValue = "1")
    protected Integer maxscale;
    @XmlElement(name = "MIN_SCALE", defaultValue = "2147483647")
    protected Integer minscale;
    @XmlElement(name = "SCALE_ACTIVATED", defaultValue = "false")
    protected Boolean scaleactivated;
    @XmlElement(name = "LABEL_TYPE", defaultValue = "None")
    protected String labeltype;
    @XmlElement(name = "VISIBILITY", defaultValue = "true")
    protected Boolean visibility;
    @XmlElement(name = "PRIORITY", defaultValue = "50")
    protected Integer priority;
    @XmlElement(name = "BLINK", defaultValue = "false")
    protected Boolean blink;
    @XmlElement(name = "URL")
    protected List<String> url;
    @XmlElement(name = "LINE_COLOR", defaultValue = "255 255 0")
    protected String linecolor;
    @XmlElement(name = "LINE_GEOM")
    protected Object linegeom;
    @XmlElement(name = "TEXT")
    protected String text;
    @XmlElement(name = "TEXTCOLOR", defaultValue = "255 255 0")
    protected String textcolor;
    @XmlList
    @XmlElement(name = "CENTER")
    protected List<BigDecimal> center;
    @XmlElementRef(name = "POSITION", type = JAXBElement.class)
    protected List<JAXBElement<List<BigDecimal>>> position;
    @XmlList
    @XmlElement(name = "INNER_AREA_POINT")
    protected List<BigDecimal> innerareapoint;
    @XmlList
    @XmlElement(name = "SECOND_AREA_POINT")
    protected List<BigDecimal> secondareapoint;
    @XmlList
    @XmlElement(name = "OUTER_AREA_POINT")
    protected List<BigDecimal> outerareapoint;
    @XmlList
    @XmlElement(name = "LABEL_POINT")
    protected List<BigDecimal> labelpoint;
    @XmlElement(name = "INNER_AREA_COLOR", required = true)
    protected String innerareacolor;

    /**
     * Gets the value of the milid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMILID() {
        return milid;
    }

    /**
     * Sets the value of the milid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMILID(String value) {
        this.milid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARKS() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARKS(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the maxscale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMAXSCALE() {
        return maxscale;
    }

    /**
     * Sets the value of the maxscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMAXSCALE(Integer value) {
        this.maxscale = value;
    }

    /**
     * Gets the value of the minscale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMINSCALE() {
        return minscale;
    }

    /**
     * Sets the value of the minscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMINSCALE(Integer value) {
        this.minscale = value;
    }

    /**
     * Gets the value of the scaleactivated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSCALEACTIVATED() {
        return scaleactivated;
    }

    /**
     * Sets the value of the scaleactivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSCALEACTIVATED(Boolean value) {
        this.scaleactivated = value;
    }

    /**
     * Gets the value of the labeltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLABELTYPE() {
        return labeltype;
    }

    /**
     * Sets the value of the labeltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLABELTYPE(String value) {
        this.labeltype = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVISIBILITY() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVISIBILITY(Boolean value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPRIORITY() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPRIORITY(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the blink property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBLINK() {
        return blink;
    }

    /**
     * Sets the value of the blink property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBLINK(Boolean value) {
        this.blink = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getURL() {
        if (url == null) {
            url = new ArrayList<String>();
        }
        return this.url;
    }

    /**
     * Gets the value of the linecolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINECOLOR() {
        return linecolor;
    }

    /**
     * Sets the value of the linecolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINECOLOR(String value) {
        this.linecolor = value;
    }

    /**
     * Gets the value of the linegeom property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLINEGEOM() {
        return linegeom;
    }

    /**
     * Sets the value of the linegeom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLINEGEOM(Object value) {
        this.linegeom = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEXT() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEXT(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the textcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEXTCOLOR() {
        return textcolor;
    }

    /**
     * Sets the value of the textcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEXTCOLOR(String value) {
        this.textcolor = value;
    }

    /**
     * Gets the value of the center property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the center property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCENTER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getCENTER() {
        if (center == null) {
            center = new ArrayList<BigDecimal>();
        }
        return this.center;
    }

    /**
     * Gets the value of the position property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the position property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOSITION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link BigDecimal }{@code >}{@code >}
     * 
     * 
     */
    public List<JAXBElement<List<BigDecimal>>> getPOSITION() {
        if (position == null) {
            position = new ArrayList<JAXBElement<List<BigDecimal>>>();
        }
        return this.position;
    }

    /**
     * Gets the value of the innerareapoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the innerareapoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINNERAREAPOINT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getINNERAREAPOINT() {
        if (innerareapoint == null) {
            innerareapoint = new ArrayList<BigDecimal>();
        }
        return this.innerareapoint;
    }

    /**
     * Gets the value of the secondareapoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondareapoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSECONDAREAPOINT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getSECONDAREAPOINT() {
        if (secondareapoint == null) {
            secondareapoint = new ArrayList<BigDecimal>();
        }
        return this.secondareapoint;
    }

    /**
     * Gets the value of the outerareapoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outerareapoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOUTERAREAPOINT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getOUTERAREAPOINT() {
        if (outerareapoint == null) {
            outerareapoint = new ArrayList<BigDecimal>();
        }
        return this.outerareapoint;
    }

    /**
     * Gets the value of the labelpoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labelpoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLABELPOINT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getLABELPOINT() {
        if (labelpoint == null) {
            labelpoint = new ArrayList<BigDecimal>();
        }
        return this.labelpoint;
    }

    /**
     * Gets the value of the innerareacolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINNERAREACOLOR() {
        return innerareacolor;
    }

    /**
     * Sets the value of the innerareacolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINNERAREACOLOR(String value) {
        this.innerareacolor = value;
    }

}