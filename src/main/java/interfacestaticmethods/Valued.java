package interfacestaticmethods;

import java.util.List;

public interface Valued {

    double getValue();

    static double sum(List<Valued>items){
        double sum = 0;
        for(Valued item: items){
            sum += item.getValue();
        }
        return sum;
    }

}
