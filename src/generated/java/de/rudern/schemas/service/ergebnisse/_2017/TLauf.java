
package de.rudern.schemas.service.ergebnisse._2017;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für tLauf complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tLauf"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.rudern.de/service/ergebnisse/2017/}tExtensible"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Boot" type="{http://schemas.rudern.de/service/ergebnisse/2017/}tBootErgebnis" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Schiedsrichter" type="{http://schemas.rudern.de/service/ergebnisse/2017/}tWettkampfrichter" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Typ" use="required"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *             &amp;lt;enumeration value="B"/&amp;gt;
 *             &amp;lt;enumeration value="V"/&amp;gt;
 *             &amp;lt;enumeration value="Q"/&amp;gt;
 *             &amp;lt;enumeration value="H"/&amp;gt;
 *             &amp;lt;enumeration value="S"/&amp;gt;
 *             &amp;lt;enumeration value="F"/&amp;gt;
 *             &amp;lt;enumeration value="A"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;attribute name="Nummer" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" /&amp;gt;
 *       &amp;lt;attribute name="Bezeichnung" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="Leistungsgruppe"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
 *             &amp;lt;minInclusive value="1"/&amp;gt;
 *             &amp;lt;maxInclusive value="3"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;attribute name="Altersklasse"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *             &amp;lt;minLength value="1"/&amp;gt;
 *             &amp;lt;maxLength value="1"/&amp;gt;
 *             &amp;lt;pattern value="[A-Z]"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLauf", propOrder = {
    "boot",
    "schiedsrichter"
})
public class TLauf
    extends TExtensible
{

    @XmlElement(name = "Boot")
    protected List<TBootErgebnis> boot;
    @XmlElement(name = "Schiedsrichter")
    protected List<TWettkampfrichter> schiedsrichter;
    @XmlAttribute(name = "Typ", required = true)
    protected String typ;
    @XmlAttribute(name = "Nummer", required = true)
    @XmlSchemaType(name = "unsignedByte")
    protected short nummer;
    @XmlAttribute(name = "Bezeichnung")
    protected String bezeichnung;
    @XmlAttribute(name = "Leistungsgruppe")
    protected Integer leistungsgruppe;
    @XmlAttribute(name = "Altersklasse")
    protected String altersklasse;

    /**
     * Gets the value of the boot property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the boot property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getBoot().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TBootErgebnis }
     * 
     * 
     */
    public List<TBootErgebnis> getBoot() {
        if (boot == null) {
            boot = new ArrayList<TBootErgebnis>();
        }
        return this.boot;
    }

    /**
     * Gets the value of the schiedsrichter property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the schiedsrichter property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSchiedsrichter().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TWettkampfrichter }
     * 
     * 
     */
    public List<TWettkampfrichter> getSchiedsrichter() {
        if (schiedsrichter == null) {
            schiedsrichter = new ArrayList<TWettkampfrichter>();
        }
        return this.schiedsrichter;
    }

    /**
     * Ruft den Wert der typ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Legt den Wert der typ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Ruft den Wert der nummer-Eigenschaft ab.
     * 
     */
    public short getNummer() {
        return nummer;
    }

    /**
     * Legt den Wert der nummer-Eigenschaft fest.
     * 
     */
    public void setNummer(short value) {
        this.nummer = value;
    }

    /**
     * Ruft den Wert der bezeichnung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Legt den Wert der bezeichnung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Ruft den Wert der leistungsgruppe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLeistungsgruppe() {
        return leistungsgruppe;
    }

    /**
     * Legt den Wert der leistungsgruppe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeistungsgruppe(Integer value) {
        this.leistungsgruppe = value;
    }

    /**
     * Ruft den Wert der altersklasse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltersklasse() {
        return altersklasse;
    }

    /**
     * Legt den Wert der altersklasse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltersklasse(String value) {
        this.altersklasse = value;
    }

}
