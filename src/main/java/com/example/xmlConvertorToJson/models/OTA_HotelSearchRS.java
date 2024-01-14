package com.example.xmlConvertorToJson.models;


import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;



@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OTA_HotelSearchRS")
public class OTA_HotelSearchRS {
    @XmlElement(name = "TPA_Extensions")
    private TPA_Extensions tpaExtensions;

    @XmlElement(name = "Properties")
    private Properties properties;

    @XmlAttribute(name = "TimeStamp")
    private String timeStamp;

    @XmlAttribute(name = "Target")
    private String target;

    @XmlAttribute(name = "Version")
    private String version;

    public TPA_Extensions getTpaExtensions() {
        return tpaExtensions;
    }

    public Properties getProperties() {
        return properties;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getTarget() {
        return target;
    }

    public String getVersion() {
        return version;
    }

    public void setTpaExtensions(TPA_Extensions tpaExtensions) {
        this.tpaExtensions = tpaExtensions;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OTA_HotelSearchRS(TPA_Extensions tpaExtensions, Properties properties, String timeStamp, String target, String version) {
        this.tpaExtensions = tpaExtensions;
        this.properties = properties;
        this.timeStamp = timeStamp;
        this.target = target;
        this.version = version;
    }
}
