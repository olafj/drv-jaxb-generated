
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
 * &lt;p&gt;Java-Klasse für tRennen complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tRennen"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.rudern.de/service/ergebnisse/2017/}tExtensible"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Lauf" type="{http://schemas.rudern.de/service/ergebnisse/2017/}tLauf" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Abmeldung" type="{http://schemas.rudern.de/service/ergebnisse/2017/}tAbmeldung" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Nummer" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="Distanz" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&amp;gt;
 *       &amp;lt;attribute name="istAusgefallen" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRennen", propOrder = {
    "lauf",
    "abmeldung"
})
public class TRennen
    extends TExtensible
{

    @XmlElement(name = "Lauf")
    protected List<TLauf> lauf;
    @XmlElement(name = "Abmeldung")
    protected List<TAbmeldung> abmeldung;
    @XmlAttribute(name = "Nummer", required = true)
    protected String nummer;
    @XmlAttribute(name = "Distanz", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long distanz;
    @XmlAttribute(name = "istAusgefallen")
    protected Boolean istAusgefallen;

    /**
     * Gets the value of the lauf property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the lauf property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getLauf().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TLauf }
     * 
     * 
     */
    public List<TLauf> getLauf() {
        if (lauf == null) {
            lauf = new ArrayList<TLauf>();
        }
        return this.lauf;
    }

    /**
     * Gets the value of the abmeldung property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the abmeldung property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAbmeldung().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TAbmeldung }
     * 
     * 
     */
    public List<TAbmeldung> getAbmeldung() {
        if (abmeldung == null) {
            abmeldung = new ArrayList<TAbmeldung>();
        }
        return this.abmeldung;
    }

    /**
     * Ruft den Wert der nummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummer() {
        return nummer;
    }

    /**
     * Legt den Wert der nummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummer(String value) {
        this.nummer = value;
    }

    /**
     * Ruft den Wert der distanz-Eigenschaft ab.
     * 
     */
    public long getDistanz() {
        return distanz;
    }

    /**
     * Legt den Wert der distanz-Eigenschaft fest.
     * 
     */
    public void setDistanz(long value) {
        this.distanz = value;
    }

    /**
     * Ruft den Wert der istAusgefallen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIstAusgefallen() {
        if (istAusgefallen == null) {
            return false;
        } else {
            return istAusgefallen;
        }
    }

    /**
     * Legt den Wert der istAusgefallen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstAusgefallen(Boolean value) {
        this.istAusgefallen = value;
    }

}
