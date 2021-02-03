package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxSelector {

    public Salesperson findSalespersonWithMaxAmount(List<Salesperson> salespersonList) {
       Salesperson bestSalesperson = null;
       for (Salesperson s: salespersonList){
           if(bestSalesperson == null || s.getAmount() > bestSalesperson.getAmount()) {
               bestSalesperson = s;

            }
        }
        return bestSalesperson;


    }
}
