
package de.rudern.schemas.service.meldungen._2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für tBootsPosition complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tBootsPosition"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="athlet" type="{http://schemas.rudern.de/service/meldungen/2010/}tAthlet" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="nr" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="st" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBootsPosition", propOrder = {
    "athlet"
})
public class TBootsPosition {

    protected TAthlet athlet;
    @XmlAttribute(name = "nr", required = true)
    protected int nr;
    @XmlAttribute(name = "st")
    protected Boolean st;

    /**
     * Ruft den Wert der athlet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TAthlet }
     *     
     */
    public TAthlet getAthlet() {
        return athlet;
    }

    /**
     * Legt den Wert der athlet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TAthlet }
     *     
     */
    public void setAthlet(TAthlet value) {
        this.athlet = value;
    }

    /**
     * Ruft den Wert der nr-Eigenschaft ab.
     * 
     */
    public int getNr() {
        return nr;
    }

    /**
     * Legt den Wert der nr-Eigenschaft fest.
     * 
     */
    public void setNr(int value) {
        this.nr = value;
    }

    /**
     * Ruft den Wert der st-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSt() {
        if (st == null) {
            return false;
        } else {
            return st;
        }
    }

    /**
     * Legt den Wert der st-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSt(Boolean value) {
        this.st = value;
    }

}
