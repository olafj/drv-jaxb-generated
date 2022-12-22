
package de.rudern.schemas.service.ergebnisse._2017;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für tBoot complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="tBoot"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://schemas.rudern.de/service/ergebnisse/2017/}tExtensible"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Sportler" type="{http://schemas.rudern.de/service/ergebnisse/2017/}tSportler" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="Startnummer" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&amp;gt;
 *       &amp;lt;attribute name="MeldungsID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&amp;gt;
 *       &amp;lt;anyAttribute processContents='lax' namespace='##other'/&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBoot", propOrder = {
    "sportler"
})
@XmlSeeAlso({
    TAbmeldung.class,
    TBootErgebnis.class
})
public class TBoot
    extends TExtensible
{

    @XmlElement(name = "Sportler")
    protected List<TSportler> sportler;
    @XmlAttribute(name = "Startnummer", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long startnummer;
    @XmlAttribute(name = "MeldungsID")
    @XmlSchemaType(name = "unsignedInt")
    protected Long meldungsID;

    /**
     * Gets the value of the sportler property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the sportler property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSportler().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TSportler }
     * 
     * 
     */
    public List<TSportler> getSportler() {
        if (sportler == null) {
            sportler = new ArrayList<TSportler>();
        }
        return this.sportler;
    }

    /**
     * Ruft den Wert der startnummer-Eigenschaft ab.
     * 
     */
    public long getStartnummer() {
        return startnummer;
    }

    /**
     * Legt den Wert der startnummer-Eigenschaft fest.
     * 
     */
    public void setStartnummer(long value) {
        this.startnummer = value;
    }

    /**
     * Ruft den Wert der meldungsID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMeldungsID() {
        return meldungsID;
    }

    /**
     * Legt den Wert der meldungsID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeldungsID(Long value) {
        this.meldungsID = value;
    }

}
