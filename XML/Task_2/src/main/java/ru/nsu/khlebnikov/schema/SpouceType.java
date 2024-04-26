//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package ru.nsu.khlebnikov.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spouce-type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="spouce-type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="wife" type="{}id-ref" minOccurs="0"/>
 *         <element name="husband" type="{}id-ref" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spouce-type", propOrder = {
    "wife",
    "husband"
})
public class SpouceType {

    protected IdRef wife;
    protected IdRef husband;

    /**
     * Gets the value of the wife property.
     * 
     * @return
     *     possible object is
     *     {@link IdRef }
     *     
     */
    public IdRef getWife() {
        return wife;
    }

    /**
     * Sets the value of the wife property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRef }
     *     
     */
    public void setWife(IdRef value) {
        this.wife = value;
    }

    /**
     * Gets the value of the husband property.
     * 
     * @return
     *     possible object is
     *     {@link IdRef }
     *     
     */
    public IdRef getHusband() {
        return husband;
    }

    /**
     * Sets the value of the husband property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRef }
     *     
     */
    public void setHusband(IdRef value) {
        this.husband = value;
    }

}