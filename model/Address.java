package com.example.restservice.model;

public class Address {
    private int streetNumber;
    private String street;
    private String city;
    private String province;
    private String country;

    public Address(int streetNumber, String street, String city, String province, String country) {
        this.streetNumber = streetNumber;
        this.street = street;
        this.city = city;
        this.province = province;
        this.country = country;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
