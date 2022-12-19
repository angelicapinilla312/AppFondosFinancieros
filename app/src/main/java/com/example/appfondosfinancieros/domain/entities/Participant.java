package com.example.appfondosfinancieros.domain.entities;

import java.io.Serializable;
import java.util.Date;

public class Participant implements Serializable {

    private String document;
    private String name;
    private String lastName;
    private String phoneNumber;
    private String address;


    public Participant() {
    }

    public Participant(String name, String lastName, String document, String phoneNumber, String address) {
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "document='" + document + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address = '"+ address +'\''+
                '}';
    }
}
