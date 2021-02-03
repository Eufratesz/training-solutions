package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {

    public Salesperson findSalespersonWithBestResults(List<Salesperson>salespersonList) {
        Salesperson bestSalesperson = null;
        for(Salesperson salesperson : salespersonList){
            if(bestSalesperson == null
                    || (salesperson.getDifferenceAmontOverTarget()  > 0 && salesperson.getDifferenceAmontOverTarget() > bestSalesperson.getDifferenceAmontOverTarget())) {
                bestSalesperson = salesperson;
            }
        }
        return bestSalesperson;
    }
}

