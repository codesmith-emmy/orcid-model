//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.v3.rc2.record;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import io.swagger.annotations.ApiModel;


@XmlType(namespace = "http://www.orcid.org/ns/common")
@XmlEnum
@ApiModel(value = "RelationshipV3_0_rc2")
public enum Relationship implements Serializable {
    @XmlEnumValue("part-of")
    PART_OF("part-of"),
    @XmlEnumValue("self")
    SELF("self"),
    @XmlEnumValue("version-of")
    VERSION_OF("version-of");
    private final String value;

    Relationship(String v) {
        value = v;
    }

    public String value() {
        return value;
    }
    
    public static Relationship fromValue(String v) {
        for (Relationship c : Relationship.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
