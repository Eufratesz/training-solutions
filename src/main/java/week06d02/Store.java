package week06d02;

import java.util.List;

public class Store {

    public List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getProductByCategoryName(Category categoryName) {
        int count = 0;
        for (Product p : products) {
            if (p.getCategory().equals(categoryName)) {
                count++;
            }

        }
        return count;

    }
}
