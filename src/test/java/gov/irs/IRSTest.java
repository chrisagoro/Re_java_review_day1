package gov.irs;

import com.hr.corp.Corporation;
import com.hr.personnel.SalariedEmployee;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class IRSTest {

    @Test
    public void register() {
    }

    @Test
    public void computeTotalMonthlyTaxToCollect() {
        IRS irs = new IRS("USA", new TaxPayer[100]);
        new SalariedEmployee("kane", LocalDate.of(2020,1, 3), 1000.0);
        irs.register(kane);
        Corporation myCompany = new Corporation("myCompany", 1000);
        irs.register(myCompany);
    }
}