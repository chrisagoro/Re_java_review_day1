package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private int hoursWorkedPerMonth;
    private double hourlyRate;
    double HOUR_TAX_RATE = 0.25;


    public HourlyEmployee(String name, LocalDate localDate, int hoursWorkedPerMonth, double hourlyRate) {
        super(name, localDate);
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getEmployeeInfo() {
        return getName() + " " + hourlyRate + " " + hoursWorkedPerMonth;
    }

    @Override
    public double computeMonthlyCompensation() {
        double monthlyCompensation = hoursWorkedPerMonth * hourlyRate;
        return monthlyCompensation;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return 0;
    }

}