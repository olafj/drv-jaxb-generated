
package de.rudern.schemas.service.ergebnisse._2017;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &amp;lt;element name="Rennen" type="{http://schemas.rudern.de/service/ergebnisse/2017/}tRennen" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Wettkampfrichter" type="{http://schemas.rudern.de/service/ergebnisse/2017/}tRegattaWKR" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
    "rennen",
    "wettkampfrichter"
})
@XmlRootElement(name = "Ergebnisse")
public class Ergebnisse {

    @XmlElement(name = "Rennen")
    protected List<TRennen> rennen;
    @XmlElement(name = "Wettkampfrichter")
    protected List<TRegattaWKR> wettkampfrichter;

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

    /**
     * Gets the value of the wettkampfrichter property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the wettkampfrichter property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getWettkampfrichter().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TRegattaWKR }
     * 
     * 
     */
    public List<TRegattaWKR> getWettkampfrichter() {
        if (wettkampfrichter == null) {
            wettkampfrichter = new ArrayList<TRegattaWKR>();
        }
        return this.wettkampfrichter;
    }

}
