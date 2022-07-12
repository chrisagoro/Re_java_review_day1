package com.hr.corp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CorporationTest {

    @Test
    public void computeMonthlyTaxToPay() {
        Corporation myCompany = new Corporation("myCompany", 10_000);
        double monthlyTaxToPay = 0.0;
        Assert.assertEquals(0.0, monthlyTaxToPay, 0.01);
    }
}