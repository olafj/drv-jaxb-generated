
package de.rudern.schemas.service.meldungen._2010;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java-Klasse für anonymous complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="obleute"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="obmann" type="{http://schemas.rudern.de/service/meldungen/2010/}tObmann" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="meldungen"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="rennen" type="{http://schemas.rudern.de/service/meldungen/2010/}tRennen" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="vereine"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="verein" type="{http://schemas.rudern.de/service/meldungen/2010/}tVerein" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
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
@XmlType(name = "", propOrder = {
    "obleute",
    "meldungen",
    "vereine"
})
@XmlRootElement(name = "regatta-meldungen")
public class RegattaMeldungen {

    @XmlElement(required = true)
    protected RegattaMeldungen.Obleute obleute;
    @XmlElement(required = true)
    protected RegattaMeldungen.Meldungen meldungen;
    @XmlElement(required = true)
    protected RegattaMeldungen.Vereine vereine;
    @XmlAttribute(name = "stand")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stand;

    /**
     * Ruft den Wert der obleute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RegattaMeldungen.Obleute }
     *     
     */
    public RegattaMeldungen.Obleute getObleute() {
        return obleute;
    }

    /**
     * Legt den Wert der obleute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RegattaMeldungen.Obleute }
     *     
     */
    public void setObleute(RegattaMeldungen.Obleute value) {
        this.obleute = value;
    }

    /**
     * Ruft den Wert der meldungen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RegattaMeldungen.Meldungen }
     *     
     */
    public RegattaMeldungen.Meldungen getMeldungen() {
        return meldungen;
    }

    /**
     * Legt den Wert der meldungen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RegattaMeldungen.Meldungen }
     *     
     */
    public void setMeldungen(RegattaMeldungen.Meldungen value) {
        this.meldungen = value;
    }

    /**
     * Ruft den Wert der vereine-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RegattaMeldungen.Vereine }
     *     
     */
    public RegattaMeldungen.Vereine getVereine() {
        return vereine;
    }

    /**
     * Legt den Wert der vereine-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RegattaMeldungen.Vereine }
     *     
     */
    public void setVereine(RegattaMeldungen.Vereine value) {
        this.vereine = value;
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


    /**
     * &lt;p&gt;Java-Klasse für anonymous complex type.
     * 
     * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="rennen" type="{http://schemas.rudern.de/service/meldungen/2010/}tRennen" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rennen"
    })
    public static class Meldungen {

        protected List<TRennen> rennen;

        /**
         * Gets the value of the rennen property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the rennen property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getRennen().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link TRennen }
         * 
         * 
         */
        public List<TRennen> getRennen() {
            if (rennen == null) {
                rennen = new ArrayList<TRennen>();
            }
            return this.rennen;
        }

    }


    /**
     * &lt;p&gt;Java-Klasse für anonymous complex type.
     * 
     * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="obmann" type="{http://schemas.rudern.de/service/meldungen/2010/}tObmann" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "obmann"
    })
    public static class Obleute {

        protected List<TObmann> obmann;

        /**
         * Gets the value of the obmann property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the obmann property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getObmann().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link TObmann }
         * 
         * 
         */
        public List<TObmann> getObmann() {
            if (obmann == null) {
                obmann = new ArrayList<TObmann>();
            }
            return this.obmann;
        }

    }


    /**
     * &lt;p&gt;Java-Klasse für anonymous complex type.
     * 
     * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="verein" type="{http://schemas.rudern.de/service/meldungen/2010/}tVerein" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "verein"
    })
    public static class Vereine {

        protected List<TVerein> verein;

        /**
         * Gets the value of the verein property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the verein property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getVerein().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link TVerein }
         * 
         * 
         */
        public List<TVerein> getVerein() {
            if (verein == null) {
                verein = new ArrayList<TVerein>();
            }
            return this.verein;
        }

    }

}
