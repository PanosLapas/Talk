
package org.scify.newsumserver.server.newsumfreeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTopicTitlesByIDs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTopicTitlesByIDs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sTopicIDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTopicTitlesByIDs", propOrder = {
    "sTopicIDs"
})
public class GetTopicTitlesByIDs {

    protected String sTopicIDs;

    /**
     * Gets the value of the sTopicIDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTopicIDs() {
        return sTopicIDs;
    }

    /**
     * Sets the value of the sTopicIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTopicIDs(String value) {
        this.sTopicIDs = value;
    }

}
