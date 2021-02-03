package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {

public Salesperson findWorstSalesperson(List<Salesperson>salespersonList) {
    Salesperson worstSalesperson = null;
    for(Salesperson salesperson : salespersonList) {
        if(worstSalesperson == null ||
                (salesperson.getDifferenceAmontOverTarget() < 0 && salesperson.getDifferenceAmontOverTarget() < worstSalesperson.getDifferenceAmontOverTarget())){
            worstSalesperson = salesperson;
        }
    }
    return worstSalesperson;
}

}
