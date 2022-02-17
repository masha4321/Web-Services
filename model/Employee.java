package com.example.restservice.model;

public class Employee {
    private int empId;
    private String fName;
    private String lName;
    private Address address;
    private String jobTitle;
    private int phoneNumber;

    public Employee(int empId, String fName, String lName, Address address, String jobTitle, int phoneNumber) {
        this.empId = empId;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.jobTitle = jobTitle;
        this.phoneNumber = phoneNumber;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
