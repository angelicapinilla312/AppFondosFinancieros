package com.example.appfondosfinancieros.domain.entities;

import java.io.Serializable;
import java.util.Date;

public class Participant implements Serializable {

    private String name;
    private String lastName;
    private String document;
    private String docType;
    private Date birthDate;
    private String phoneNumber;
    private String urlImage;

    public Participant() {
    }

    public Participant(String name, String lastName, String document, String docType, Date birthDate, String phoneNumber, String urlImage) {
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.docType = docType;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.urlImage = urlImage;
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

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", document='" + document + '\'' +
                ", docType='" + docType + '\'' +
                ", birthDate=" + birthDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", urlImage='" + urlImage + '\'' +
                '}';
    }
}
