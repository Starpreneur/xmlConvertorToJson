package com.example.xmlConvertorToJson.models;

import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Pagination {

    @XmlAttribute(name = "TotalAmount")
    private String totalAmount;

    @XmlAttribute(name = "PageCount")
    private String pageCount;

    @XmlAttribute(name = "Page")
    private String page;

    @XmlAttribute(name = "PageSize")
    private String pageSize;

    public String getTotalAmount() {
        return totalAmount;
    }

    public String getPageCount() {
        return pageCount;
    }

    public String getPage() {
        return page;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public Pagination(String totalAmount, String pageCount, String page, String pageSize) {
        this.totalAmount = totalAmount;
        this.pageCount = pageCount;
        this.page = page;
        this.pageSize = pageSize;
    }
}
