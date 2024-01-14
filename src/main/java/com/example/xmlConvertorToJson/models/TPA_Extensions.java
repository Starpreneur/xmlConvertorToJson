package com.example.xmlConvertorToJson.models;

import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class TPA_Extensions {

    @XmlElement(name = "Pagination")
    private Pagination pagination;

    @XmlAttribute(name  = "HotelStatus")
    private String hotelStatus;


    @XmlAttribute(name = "Created")
    private String created;

    @XmlAttribute(name = "LastChange")
    private String lastChange;

    @XmlAttribute(name = "ContentScore")
    private String contentScore;

    public Pagination getPagination() {
        return pagination;
    }

    public String getHotelStatus() {
        return hotelStatus;
    }

    public String getCreated() {
        return created;
    }

    public String getLastChange() {
        return lastChange;
    }

    public String getContentScore() {
        return contentScore;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public void setHotelStatus(String hotelStatus) {
        this.hotelStatus = hotelStatus;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setLastChange(String lastChange) {
        this.lastChange = lastChange;
    }

    public void setContentScore(String contentScore) {
        this.contentScore = contentScore;
    }

    public TPA_Extensions(Pagination pagination, String hotelStatus, String created, String lastChange, String contentScore) {
        this.pagination = pagination;
        this.hotelStatus = hotelStatus;
        this.created = created;
        this.lastChange = lastChange;
        this.contentScore = contentScore;
    }
}
