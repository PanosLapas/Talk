
package org.scify.newsumserver.server.newsumfreeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTopicTitlesByID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTopicTitlesByID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sTopicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTopicTitlesByID", propOrder = {
    "sTopicID"
})
public class GetTopicTitlesByID {

    protected String sTopicID;

    /**
     * Gets the value of the sTopicID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTopicID() {
        return sTopicID;
    }

    /**
     * Sets the value of the sTopicID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTopicID(String value) {
        this.sTopicID = value;
    }

}
