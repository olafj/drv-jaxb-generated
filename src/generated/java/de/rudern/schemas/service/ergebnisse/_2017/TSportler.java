
package de.rudern.schemas.service.ergebnisse._2017;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java-Klasse für tSportler complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tSportler"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.rudern.de/service/ergebnisse/2017/}tExtensible"&amp;gt;
 *       &amp;lt;sequence minOccurs="0"&amp;gt;
 *         &amp;lt;element name="Nachname" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="Vorname" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="Jahrgang" type="{http://www.w3.org/2001/XMLSchema}gYear"/&amp;gt;
 *         &amp;lt;element name="VereinsName" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;simpleContent&amp;gt;
 *               &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;string"&amp;gt;
 *                 &amp;lt;attribute name="Kuerzel" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *               &amp;lt;/extension&amp;gt;
 *             &amp;lt;/simpleContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Position" use="required"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
 *             &amp;lt;minInclusive value="1"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;attribute name="istSteuermann" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&amp;gt;
 *       &amp;lt;attribute name="AktivenID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&amp;gt;
 *       &amp;lt;attribute name="VereinsID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSportler", propOrder = {
    "nachname",
    "vorname",
    "jahrgang",
    "vereinsName"
})
public class TSportler
    extends TExtensible
{

    @XmlElement(name = "Nachname")
    protected String nachname;
    @XmlElement(name = "Vorname")
    protected String vorname;
    @XmlElement(name = "Jahrgang")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar jahrgang;
    @XmlElement(name = "VereinsName")
    protected TSportler.VereinsName vereinsName;
    @XmlAttribute(name = "Position", required = true)
    protected int position;
    @XmlAttribute(name = "istSteuermann")
    protected Boolean istSteuermann;
    @XmlAttribute(name = "AktivenID")
    @XmlSchemaType(name = "anySimpleType")
    protected String aktivenID;
    @XmlAttribute(name = "VereinsID")
    @XmlSchemaType(name = "anySimpleType")
    protected String vereinsID;

    /**
     * Ruft den Wert der nachname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * Legt den Wert der nachname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNachname(String value) {
        this.nachname = value;
    }

    /**
     * Ruft den Wert der vorname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Legt den Wert der vorname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorname(String value) {
        this.vorname = value;
    }

    /**
     * Ruft den Wert der jahrgang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJahrgang() {
        return jahrgang;
    }

    /**
     * Legt den Wert der jahrgang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJahrgang(XMLGregorianCalendar value) {
        this.jahrgang = value;
    }

    /**
     * Ruft den Wert der vereinsName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TSportler.VereinsName }
     *     
     */
    public TSportler.VereinsName getVereinsName() {
        return vereinsName;
    }

    /**
     * Legt den Wert der vereinsName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TSportler.VereinsName }
     *     
     */
    public void setVereinsName(TSportler.VereinsName value) {
        this.vereinsName = value;
    }

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     */
    public int getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     */
    public void setPosition(int value) {
        this.position = value;
    }

    /**
     * Ruft den Wert der istSteuermann-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIstSteuermann() {
        if (istSteuermann == null) {
            return false;
        } else {
            return istSteuermann;
        }
    }

    /**
     * Legt den Wert der istSteuermann-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstSteuermann(Boolean value) {
        this.istSteuermann = value;
    }

    /**
     * Ruft den Wert der aktivenID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAktivenID() {
        return aktivenID;
    }

    /**
     * Legt den Wert der aktivenID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAktivenID(String value) {
        this.aktivenID = value;
    }

    /**
     * Ruft den Wert der vereinsID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVereinsID() {
        return vereinsID;
    }

    /**
     * Legt den Wert der vereinsID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVereinsID(String value) {
        this.vereinsID = value;
    }


    /**
     * Name des Vereins, ggf. optionale Kurzschreibweise
     * 
     * &lt;p&gt;Java-Klasse für anonymous complex type.
     * 
     * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;simpleContent&amp;gt;
     *     &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;string"&amp;gt;
     *       &amp;lt;attribute name="Kuerzel" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
     *     &amp;lt;/extension&amp;gt;
     *   &amp;lt;/simpleContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class VereinsName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Kuerzel")
        protected String kuerzel;

        /**
         * Ruft den Wert der value-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Ruft den Wert der kuerzel-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKuerzel() {
            return kuerzel;
        }

        /**
         * Legt den Wert der kuerzel-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKuerzel(String value) {
            this.kuerzel = value;
        }

    }

}
