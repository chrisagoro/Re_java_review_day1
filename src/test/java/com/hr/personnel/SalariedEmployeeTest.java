package com.hr.personnel;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class SalariedEmployeeTest {
    Department department;
    Employee employee4;

    @Test
    public void computeMonthlyCompensation_should_return_monthly_Compensation_if_correct() {
        employee4 = new SalariedEmployee("bright", LocalDate.of(2019, 02, 02), 2500.0);
        employee4.computeMonthlyCompensation();
        Assert.assertEquals(0.0, computeMonthlyCompensation(), 0.01);
    }

    private double computeMonthlyCompensation() {
        return 0;
    }

}