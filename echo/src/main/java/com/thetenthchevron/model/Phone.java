package com.thetenthchevron.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String areaCode;

    private String threeDigitPrefix;

    private String lineNumber;

    private String type; //Mobile, Home, Work, Fax

    private Date created;

    private Date lastModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getThreeDigitPrefix() {
        return threeDigitPrefix;
    }

    public void setThreeDigitPrefix(String threeDigitPrefix) {
        this.threeDigitPrefix = threeDigitPrefix;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
}
