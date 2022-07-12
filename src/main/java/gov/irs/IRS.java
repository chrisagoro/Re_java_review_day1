package gov.irs;

import com.hr.personnel.Department;

import com.hr.personnel.Employee;

public class IRS {
    private String location;

    public int getCurrentIndex;
    private TaxPayer[] taxPayers = new TaxPayer[100];
    private int currentIndex = 0;

    public IRS(String location, TaxPayer[] taxPayers) {

    }

    public void register(TaxPayer taxPayer){
        taxPayers[currentIndex++] = taxPayer;
    }

    public double computeTotalMonthlyTaxToCollect(){
        double sum = 0.0;
        for (int i = 0; i < currentIndex; i++){
            //for every tax payer, maintained in the array, we want to get monthly tax to pay
            //and we want to add the value to the sum. Then return sum
            double monthlyTaxToPay = taxPayers[i].computeMonthlyTaxToPay();
            sum += monthlyTaxToPay;
        }
        return sum;
    }

}