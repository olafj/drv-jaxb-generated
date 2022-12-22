
package de.rudern.schemas.service.ergebnisse._2017;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für tBootErgebnis complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tBootErgebnis"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.rudern.de/service/ergebnisse/2017/}tBoot"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Ergebnis" type="{http://schemas.rudern.de/service/ergebnisse/2017/}tErgebnis" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBootErgebnis", propOrder = {
    "ergebnis"
})
public class TBootErgebnis
    extends TBoot
{

    @XmlElement(name = "Ergebnis")
    protected TErgebnis ergebnis;

    /**
     * Ruft den Wert der ergebnis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TErgebnis }
     *     
     */
    public TErgebnis getErgebnis() {
        return ergebnis;
    }

    /**
     * Legt den Wert der ergebnis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TErgebnis }
     *     
     */
    public void setErgebnis(TErgebnis value) {
        this.ergebnis = value;
    }

}
