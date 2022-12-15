package com.example.appfondosfinancieros.domain.entities;

import java.io.Serializable;
import java.sql.Date;

public class Fund implements Serializable, Comparable{

    private String name;
    private double amountSaved;
    private double savingsBasis;
    private Date creationDate;
    private Date periodicity_contributions;
    private int minAmountContributions;
    private double interes;
    private int maxDues;
    private


    @Override
    public int compareTo(Object o) {

        return 0;
    }
}
