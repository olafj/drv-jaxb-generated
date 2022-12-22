
package de.rudern.schemas.service.ergebnisse._2017;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * &lt;p&gt;Java-Klasse für tErgebnis complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tErgebnis"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.rudern.de/service/ergebnisse/2017/}tExtensible"&amp;gt;
 *       &amp;lt;attribute name="Rang" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&amp;gt;
 *       &amp;lt;attribute name="Zeit" type="{http://www.w3.org/2001/XMLSchema}duration" /&amp;gt;
 *       &amp;lt;attribute name="Delta" type="{http://www.w3.org/2001/XMLSchema}duration" /&amp;gt;
 *       &amp;lt;attribute name="Zeitkorrektur" type="{http://www.w3.org/2001/XMLSchema}duration" /&amp;gt;
 *       &amp;lt;attribute name="Bemerkung" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tErgebnis")
public class TErgebnis
    extends TExtensible
{

    @XmlAttribute(name = "Rang")
    @XmlSchemaType(name = "unsignedInt")
    protected Long rang;
    @XmlAttribute(name = "Zeit")
    protected Duration zeit;
    @XmlAttribute(name = "Delta")
    protected Duration delta;
    @XmlAttribute(name = "Zeitkorrektur")
    protected Duration zeitkorrektur;
    @XmlAttribute(name = "Bemerkung")
    protected String bemerkung;

    /**
     * Ruft den Wert der rang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRang() {
        return rang;
    }

    /**
     * Legt den Wert der rang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRang(Long value) {
        this.rang = value;
    }

    /**
     * Ruft den Wert der zeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getZeit() {
        return zeit;
    }

    /**
     * Legt den Wert der zeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setZeit(Duration value) {
        this.zeit = value;
    }

    /**
     * Ruft den Wert der delta-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDelta() {
        return delta;
    }

    /**
     * Legt den Wert der delta-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDelta(Duration value) {
        this.delta = value;
    }

    /**
     * Ruft den Wert der zeitkorrektur-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getZeitkorrektur() {
        return zeitkorrektur;
    }

    /**
     * Legt den Wert der zeitkorrektur-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setZeitkorrektur(Duration value) {
        this.zeitkorrektur = value;
    }

    /**
     * Ruft den Wert der bemerkung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Legt den Wert der bemerkung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBemerkung(String value) {
        this.bemerkung = value;
    }

}
