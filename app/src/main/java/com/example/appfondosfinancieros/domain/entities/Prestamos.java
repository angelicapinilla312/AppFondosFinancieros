package com.example.appfondosfinancieros.domain.entities;

public class Prestamos {
    private String nameParticipant;
    private String documentParticipant;
    private double loanAmount;
    private double duesAmount;

    public Prestamos() {
    }

    public Prestamos(String nameParticipant, String documentParticipant, double loanAmount, double duesAmount) {
        this.nameParticipant = nameParticipant;
        this.documentParticipant = documentParticipant;
        this.loanAmount = loanAmount;
        this.duesAmount = duesAmount;
    }

    public String getNameParticipant() {
        return nameParticipant;
    }

    public void setNameParticipant(String nameParticipant) {
        this.nameParticipant = nameParticipant;
    }

    public String getDocumentParticipant() {
        return documentParticipant;
    }

    public void setDocumentParticipant(String documentParticipant) {
        this.documentParticipant = documentParticipant;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getDuesAmount() {
        return duesAmount;
    }

    public void setDuesAmount(double duesAmount) {
        this.duesAmount = duesAmount;
    }

    @Override
    public String toString() {
        return "Prestamos{" +
                "nameParticipant='" + nameParticipant + '\'' +
                ", documentParticipant='" + documentParticipant + '\'' +
                ", loanAmount=" + loanAmount +
                ", duesAmount=" + duesAmount +
                '}';
    }
}