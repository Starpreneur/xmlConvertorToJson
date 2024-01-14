package com.example.xmlConvertorToJson.models;

import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Property {
    @XmlAttribute(name = "HotelCode")
    private String hotelCode;

    @XmlAttribute(name = "HotelName")
    private String hotelName;

    @XmlAttribute(name = "CurrencyCode")
    private String currencyCode;

    @XmlElement(name = "TPA_Extensions")
    private TPA_Extensions tpa_extensions;

    public String getHotelCode() {
        return hotelCode;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public TPA_Extensions getTpa_extensions() {
        return tpa_extensions;
    }

    public void setHotelCode(String hotelCode) {
        this.hotelCode = hotelCode;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setTpa_extensions(TPA_Extensions tpa_extensions) {
        this.tpa_extensions = tpa_extensions;
    }

    public Property(String hotelCode, String hotelName, String currencyCode, TPA_Extensions tpa_extensions) {
        this.hotelCode = hotelCode;
        this.hotelName = hotelName;
        this.currencyCode = currencyCode;
        this.tpa_extensions = tpa_extensions;
    }

}
