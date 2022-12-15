package com.example.appfondosfinancieros.domain.entities;

import java.io.Serializable;
import java.util.Date;

public class Participant implements Serializable {

    private String document;
    private String name;
    private String lastName;
    private String docType;
    private Date birthDate;
    private String phoneNumber;
    private String urlImage;
    private int userId;
    private String fundCode;

    public Participant() {
    }

    public Participant(String document, String name, String lastName,
                       String docType, Date birthDate, String phoneNumber,
                       String urlImage, int userId, String fundCode) {
        this.document = document;
        this.name = name;
        this.lastName = lastName;
        this.docType = docType;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.urlImage = urlImage;
        this.userId = userId;
        this.fundCode = fundCode;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "document='" + document + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", docType='" + docType + '\'' +
                ", birthDate=" + birthDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", urlImage='" + urlImage + '\'' +
                ", userId=" + userId +
                ", fundCode='" + fundCode + '\'' +
                '}';
    }
}
