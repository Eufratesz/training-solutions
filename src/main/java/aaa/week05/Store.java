package aaa.week05;

/*
Készíts egy Store osztályt, melyben van egy Product-okat tároló  lista. Legyen benne egy addProduct(Product) metódus!
Bónusz: Legyen benne egy getNumberOfExpired() metódus ami visszaadja a lejárt termékek számát! Használd a
LocalDate.now() és az isBefore() metódusokat!
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products = new ArrayList<>();

    public List<Product> addProduct(Product newProduct) {
        products.add(newProduct);
        return products;
    }

    public int getNumberOfExpired() {
        int count = 0;
        for (Product product : products) {
            if (product.getExpiryDate().isBefore(LocalDate.now())) {
                count++;
            }
        }

        return count;
    }

    public boolean addFreshProduct(Product newProduct) {
        for (Product p : products) {
            if (newProduct.isFresh() && !p.getName().equals(newProduct.getName())) {
                products.add(newProduct);
                return true;
            }
        }
        return false;
    }



}
