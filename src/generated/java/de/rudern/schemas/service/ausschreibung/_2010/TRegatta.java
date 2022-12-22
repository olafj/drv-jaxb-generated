
package de.rudern.schemas.service.ausschreibung._2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java-Klasse für tRegatta complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tRegatta"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="angaben" type="{http://schemas.rudern.de/service/ausschreibung/2010/}tAngaben"/&amp;gt;
 *         &amp;lt;element name="rennfolge" type="{http://schemas.rudern.de/service/ausschreibung/2010/}tRennfolge"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="stand" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRegatta", propOrder = {
    "angaben",
    "rennfolge"
})
public class TRegatta {

    @XmlElement(required = true)
    protected TAngaben angaben;
    @XmlElement(required = true)
    protected TRennfolge rennfolge;
    @XmlAttribute(name = "stand")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stand;

    /**
     * Ruft den Wert der angaben-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TAngaben }
     *     
     */
    public TAngaben getAngaben() {
        return angaben;
    }

    /**
     * Legt den Wert der angaben-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TAngaben }
     *     
     */
    public void setAngaben(TAngaben value) {
        this.angaben = value;
    }

    /**
     * Ruft den Wert der rennfolge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TRennfolge }
     *     
     */
    public TRennfolge getRennfolge() {
        return rennfolge;
    }

    /**
     * Legt den Wert der rennfolge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TRennfolge }
     *     
     */
    public void setRennfolge(TRennfolge value) {
        this.rennfolge = value;
    }

    /**
     * Ruft den Wert der stand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStand() {
        return stand;
    }

    /**
     * Legt den Wert der stand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStand(XMLGregorianCalendar value) {
        this.stand = value;
    }

}
