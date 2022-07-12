package com.hr.personnel;

import java.time.LocalDate;

import gov.irs.TaxPayer;

public abstract class Employee implements TaxPayer {
    private String name;
    private LocalDate localDate;

    public Employee(String name, LocalDate localDate) {
        this.name = name;
        this.localDate = localDate;
    }

    public String getEmployeeInfo(){
        return "name = " + name +
                "hireDate = " + localDate;
    }

    public String work(){
        return name + "worked";
    }

    public String getName() {
        return name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public abstract double computeMonthlyCompensation();

    public abstract double computeMonthlyTaxToPay();
}