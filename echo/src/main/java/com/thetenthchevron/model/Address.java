package com.thetenthchevron.model;

import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Builder
@AllArgsConstructor
public class Address implements Serializable {

    //region PROPERTIES

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer houseNumber;

    private String addressLineOne;

    private String addressLineTwo;

    private String city;

    private String stateAbbreviation;

    private String zipCode;

    private Boolean residential; //Residential, Commercial

    //endregion

    //region CONSTRUCTORS

    public Address(){
        setHouseNumber(12345);
        setAddressLineOne("");
        setAddressLineTwo("");
        setCity("");
        setCity("");
        setStateAbbreviation("**");
        setZipCode("12345");
        setResidential(true);
    }

    //endregion

    //region GETTERS/SETTERS

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public void setAddressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    public void setStateAbbreviation(String stateAbbreviation) {
        this.stateAbbreviation = stateAbbreviation;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Boolean getResidential() {
        return residential;
    }

    public void setResidential(Boolean residential) {
        this.residential = residential;
    }

    //endregion
}
