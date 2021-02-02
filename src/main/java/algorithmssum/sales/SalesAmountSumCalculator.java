package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int calculateSalesAmountSum(List<Salesperson> salespersonList){
        int sum = 0;
        for(Salesperson s: salespersonList) {
            sum += s.getAmount();
        }
        return sum;
    }
}
