package com.example.appfondosfinancieros.domain.entities;

import java.io.Serializable;
import java.sql.Date;

public class Fund implements Serializable{

    private String fundCode;
    private String name;
    private double amountSaved;
    private double savingsBasis;
    private Date creationDate;
    private Date periodicity_contributions;
    private int minAmountContributions;
    private double interes;
    private int maxDues;
    private String codeSuscription;
    private int idTermsConditions;

    public Fund() {
    }

    public Fund(String fundCode, String name, double amountSaved, double savingsBasis,
                Date creationDate, Date periodicity_contributions, int minAmountContributions,
                double interes, int maxDues, String codeSuscription, int idTermsConditions) {
        this.fundCode = fundCode;
        this.name = name;
        this.amountSaved = amountSaved;
        this.savingsBasis = savingsBasis;
        this.creationDate = creationDate;
        this.periodicity_contributions = periodicity_contributions;
        this.minAmountContributions = minAmountContributions;
        this.interes = interes;
        this.maxDues = maxDues;
        this.codeSuscription = codeSuscription;
        this.idTermsConditions = idTermsConditions;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmountSaved() {
        return amountSaved;
    }

    public void setAmountSaved(double amountSaved) {
        this.amountSaved = amountSaved;
    }

    public double getSavingsBasis() {
        return savingsBasis;
    }

    public void setSavingsBasis(double savingsBasis) {
        this.savingsBasis = savingsBasis;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getPeriodicity_contributions() {
        return periodicity_contributions;
    }

    public void setPeriodicity_contributions(Date periodicity_contributions) {
        this.periodicity_contributions = periodicity_contributions;
    }

    public int getMinAmountContributions() {
        return minAmountContributions;
    }

    public void setMinAmountContributions(int minAmountContributions) {
        this.minAmountContributions = minAmountContributions;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getMaxDues() {
        return maxDues;
    }

    public void setMaxDues(int maxDues) {
        this.maxDues = maxDues;
    }

    public String getCodeSuscription() {
        return codeSuscription;
    }

    public void setCodeSuscription(String codeSuscription) {
        this.codeSuscription = codeSuscription;
    }

    public int getIdTermsConditions() {
        return idTermsConditions;
    }

    public void setIdTermsConditions(int idTermsConditions) {
        this.idTermsConditions = idTermsConditions;
    }

    @Override
    public String toString() {
        return "Fund{" +
                "fundCode='" + fundCode + '\'' +
                ", name='" + name + '\'' +
                ", amountSaved=" + amountSaved +
                ", savingsBasis=" + savingsBasis +
                ", creationDate=" + creationDate +
                ", periodicity_contributions=" + periodicity_contributions +
                ", minAmountContributions=" + minAmountContributions +
                ", interes=" + interes +
                ", maxDues=" + maxDues +
                ", codeSuscription='" + codeSuscription + '\'' +
                ", idTermsConditions=" + idTermsConditions +
                '}';
    }
}
