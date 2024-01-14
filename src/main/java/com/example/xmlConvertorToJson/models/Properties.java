package com.example.xmlConvertorToJson.models;


import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Properties {


    @XmlElement(name = "Property")
    List<Property> Properties ;

    public List<Property> getProperties() {
        return Properties;
    }

    public void setProperties(List<Property> properties) {
        Properties = properties;
    }

    public Properties(List<Property> properties) {
        Properties = properties;
    }
}
