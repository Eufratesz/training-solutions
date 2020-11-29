package week05d04;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<Product> products = new ArrayList<>();

    public Store(List<Product> products) {              // a 2. teszt miatt kellett létrehozni konsturktorral.
        this.products = products;
    }

    public boolean addProduct(Product product) {
        if (!isValid(product)) {
            return false;
        }
        products.add(product);
        return true;
    }

    public int getNumberOfExpired() {
        int count = 0;
        for(Product p : products) {
            if(p.isExpired()) {
                count++;
            }
        }
        return count;
    }

    private boolean isValid(Product product) {                  //tartalmazza-e a lista, nem járt-e le?
        if(containsByName(product) || product.isExpired()) {
            return false;
        }
        return true;
    }

    private boolean containsByName(Product product) {       //többször használható metódus: tartalmazza-e a lista.
        for(Product p: products) {
            if(p.getName().equals(product.getName())) {
                return true;
            }
        }
        return false;
    }

}
