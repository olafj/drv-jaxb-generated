
package de.rudern.schemas.service.ausschreibung._2010;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Java-Klasse für tAngaben complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tAngaben"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="titel" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="subTitel" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="ort" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="veranstalter" type="{http://schemas.rudern.de/service/ausschreibung/2010/}tVeranstalter" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="startDatum" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
 *         &amp;lt;element name="endDatum" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
 *         &amp;lt;element name="meldeschluss" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="homepage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="bestimmungen" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="bestimmung" maxOccurs="7" minOccurs="0"&amp;gt;
 *                     &amp;lt;complexType&amp;gt;
 *                       &amp;lt;complexContent&amp;gt;
 *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                           &amp;lt;sequence&amp;gt;
 *                             &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                           &amp;lt;/sequence&amp;gt;
 *                           &amp;lt;attribute name="nr" use="required"&amp;gt;
 *                             &amp;lt;simpleType&amp;gt;
 *                               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
 *                                 &amp;lt;minInclusive value="1"/&amp;gt;
 *                                 &amp;lt;maxInclusive value="7"/&amp;gt;
 *                               &amp;lt;/restriction&amp;gt;
 *                             &amp;lt;/simpleType&amp;gt;
 *                           &amp;lt;/attribute&amp;gt;
 *                           &amp;lt;attribute name="inhalt" use="required"&amp;gt;
 *                             &amp;lt;simpleType&amp;gt;
 *                               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                                 &amp;lt;enumeration value="application/xhtml+xml"/&amp;gt;
 *                                 &amp;lt;enumeration value="text/plain"/&amp;gt;
 *                               &amp;lt;/restriction&amp;gt;
 *                             &amp;lt;/simpleType&amp;gt;
 *                           &amp;lt;/attribute&amp;gt;
 *                         &amp;lt;/restriction&amp;gt;
 *                       &amp;lt;/complexContent&amp;gt;
 *                     &amp;lt;/complexType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAngaben", propOrder = {
    "titel",
    "subTitel",
    "ort",
    "veranstalter",
    "startDatum",
    "endDatum",
    "meldeschluss",
    "homepage",
    "email",
    "bestimmungen"
})
public class TAngaben {

    @XmlElement(required = true)
    protected String titel;
    @XmlElement(required = true)
    protected String subTitel;
    @XmlElement(required = true)
    protected String ort;
    protected TVeranstalter veranstalter;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDatum;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDatum;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar meldeschluss;
    protected String homepage;
    protected String email;
    protected TAngaben.Bestimmungen bestimmungen;

    /**
     * Ruft den Wert der titel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Legt den Wert der titel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Ruft den Wert der subTitel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTitel() {
        return subTitel;
    }

    /**
     * Legt den Wert der subTitel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTitel(String value) {
        this.subTitel = value;
    }

    /**
     * Ruft den Wert der ort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Legt den Wert der ort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrt(String value) {
        this.ort = value;
    }

    /**
     * Ruft den Wert der veranstalter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TVeranstalter }
     *     
     */
    public TVeranstalter getVeranstalter() {
        return veranstalter;
    }

    /**
     * Legt den Wert der veranstalter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TVeranstalter }
     *     
     */
    public void setVeranstalter(TVeranstalter value) {
        this.veranstalter = value;
    }

    /**
     * Ruft den Wert der startDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDatum() {
        return startDatum;
    }

    /**
     * Legt den Wert der startDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDatum(XMLGregorianCalendar value) {
        this.startDatum = value;
    }

    /**
     * Ruft den Wert der endDatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDatum() {
        return endDatum;
    }

    /**
     * Legt den Wert der endDatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDatum(XMLGregorianCalendar value) {
        this.endDatum = value;
    }

    /**
     * Ruft den Wert der meldeschluss-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeldeschluss() {
        return meldeschluss;
    }

    /**
     * Legt den Wert der meldeschluss-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeldeschluss(XMLGregorianCalendar value) {
        this.meldeschluss = value;
    }

    /**
     * Ruft den Wert der homepage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomepage() {
        return homepage;
    }

    /**
     * Legt den Wert der homepage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomepage(String value) {
        this.homepage = value;
    }

    /**
     * Ruft den Wert der email-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Legt den Wert der email-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Ruft den Wert der bestimmungen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TAngaben.Bestimmungen }
     *     
     */
    public TAngaben.Bestimmungen getBestimmungen() {
        return bestimmungen;
    }

    /**
     * Legt den Wert der bestimmungen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TAngaben.Bestimmungen }
     *     
     */
    public void setBestimmungen(TAngaben.Bestimmungen value) {
        this.bestimmungen = value;
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
     *         &amp;lt;element name="bestimmung" maxOccurs="7" minOccurs="0"&amp;gt;
     *           &amp;lt;complexType&amp;gt;
     *             &amp;lt;complexContent&amp;gt;
     *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                 &amp;lt;sequence&amp;gt;
     *                   &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *                 &amp;lt;/sequence&amp;gt;
     *                 &amp;lt;attribute name="nr" use="required"&amp;gt;
     *                   &amp;lt;simpleType&amp;gt;
     *                     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
     *                       &amp;lt;minInclusive value="1"/&amp;gt;
     *                       &amp;lt;maxInclusive value="7"/&amp;gt;
     *                     &amp;lt;/restriction&amp;gt;
     *                   &amp;lt;/simpleType&amp;gt;
     *                 &amp;lt;/attribute&amp;gt;
     *                 &amp;lt;attribute name="inhalt" use="required"&amp;gt;
     *                   &amp;lt;simpleType&amp;gt;
     *                     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *                       &amp;lt;enumeration value="application/xhtml+xml"/&amp;gt;
     *                       &amp;lt;enumeration value="text/plain"/&amp;gt;
     *                     &amp;lt;/restriction&amp;gt;
     *                   &amp;lt;/simpleType&amp;gt;
     *                 &amp;lt;/attribute&amp;gt;
     *               &amp;lt;/restriction&amp;gt;
     *             &amp;lt;/complexContent&amp;gt;
     *           &amp;lt;/complexType&amp;gt;
     *         &amp;lt;/element&amp;gt;
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
        "bestimmung"
    })
    public static class Bestimmungen {

        protected List<TAngaben.Bestimmungen.Bestimmung> bestimmung;

        /**
         * Gets the value of the bestimmung property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the bestimmung property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getBestimmung().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link TAngaben.Bestimmungen.Bestimmung }
         * 
         * 
         */
        public List<TAngaben.Bestimmungen.Bestimmung> getBestimmung() {
            if (bestimmung == null) {
                bestimmung = new ArrayList<TAngaben.Bestimmungen.Bestimmung>();
            }
            return this.bestimmung;
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
         *         &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
         *       &amp;lt;/sequence&amp;gt;
         *       &amp;lt;attribute name="nr" use="required"&amp;gt;
         *         &amp;lt;simpleType&amp;gt;
         *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
         *             &amp;lt;minInclusive value="1"/&amp;gt;
         *             &amp;lt;maxInclusive value="7"/&amp;gt;
         *           &amp;lt;/restriction&amp;gt;
         *         &amp;lt;/simpleType&amp;gt;
         *       &amp;lt;/attribute&amp;gt;
         *       &amp;lt;attribute name="inhalt" use="required"&amp;gt;
         *         &amp;lt;simpleType&amp;gt;
         *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
         *             &amp;lt;enumeration value="application/xhtml+xml"/&amp;gt;
         *             &amp;lt;enumeration value="text/plain"/&amp;gt;
         *           &amp;lt;/restriction&amp;gt;
         *         &amp;lt;/simpleType&amp;gt;
         *       &amp;lt;/attribute&amp;gt;
         *     &amp;lt;/restriction&amp;gt;
         *   &amp;lt;/complexContent&amp;gt;
         * &amp;lt;/complexType&amp;gt;
         * &lt;/pre&gt;
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "any"
        })
        public static class Bestimmung {

            @XmlAnyElement(lax = true)
            protected List<Object> any;
            @XmlAttribute(name = "nr", required = true)
            protected int nr;
            @XmlAttribute(name = "inhalt", required = true)
            protected String inhalt;

            /**
             * Gets the value of the any property.
             * 
             * &lt;p&gt;
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the any property.
             * 
             * &lt;p&gt;
             * For example, to add a new item, do as follows:
             * &lt;pre&gt;
             *    getAny().add(newItem);
             * &lt;/pre&gt;
             * 
             * 
             * &lt;p&gt;
             * Objects of the following type(s) are allowed in the list
             * {@link Element }
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
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
             * Ruft den Wert der inhalt-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInhalt() {
                return inhalt;
            }

            /**
             * Legt den Wert der inhalt-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInhalt(String value) {
                this.inhalt = value;
            }

        }

    }

}
