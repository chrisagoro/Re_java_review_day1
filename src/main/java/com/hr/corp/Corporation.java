package com.hr.corp;

import gov.irs.TaxPayer;

public class Corporation implements TaxPayer {
    private String name;
    private double monthlyIncome;

    public Corporation(String myCompany, int amount) {
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return monthlyIncome * CORP_TAX_RATE;
    }

}