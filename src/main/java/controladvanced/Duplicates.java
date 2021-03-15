package controladvanced;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {

    public List<Integer> findDuplicates(List<Integer> numbers) {
        List<Integer> found = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (numbers.get(i) == (numbers.get(j))) {
                    found.add(numbers.get(i));
                }
            }
        }
        return found;
    }
}
