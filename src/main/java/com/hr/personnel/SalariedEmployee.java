package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{

    double monthlySalary;
    double SALARIED_TAX_RATE = 0.30;

    public SalariedEmployee(String name, LocalDate localDate, double monthlySalary) {
        super(name, localDate);
        this.monthlySalary = monthlySalary;
    }
    public String getEmployeeInfo(){
        return getName() + monthlySalary;
    }

    public double getMonthlySalary(){
        return monthlySalary;
    }

    @Override
    public double computeMonthlyCompensation() {
        return monthlySalary;
    }

    @Override
    public double computeMonthlyTaxToPay(){
        double monthlyTaxToPay = computeMonthlyCompensation() * SALARIED_TAX_RATE;
        return monthlyTaxToPay;
    }
}