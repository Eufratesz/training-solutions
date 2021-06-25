package aaa.week06;

/*
Készíts egy Store
osztályt benne egy Product listával, amit konstruktorban kap meg. Legyen egy getProductByCategoryName(Category),
ami visszaadja valamilyen adatszerkezetben, hogy a paraméterül kapott kategóriából hány darab van a listában!
 */

import java.util.*;

public class Store {

    List<Product> products;

    public Store(List<Product> products) {
        if(products == null){
            throw new IllegalArgumentException("The list is null!");
        }
        this.products = products;
    }



    public String getProductByCategoryName(Category category){
        int count = 0;
        String result = null;
        for(Product product : products) {
            if(category.equals(product.getCategory())){
                count++;
                result = product + " :"+ count;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Store{" +
                "products=" + products +
                '}';
    }

    //Ugyanez mappel:
    public Map<Category, Integer> getProductsByCategoryName(Category category) {
        Map<Category, Integer> countOfCategory = new HashMap<>();
        for(Product p : products){
            if(countOfCategory.containsKey(p.getCategory())){
                countOfCategory.put(p.getCategory(), countOfCategory.get(p.getCategory()) +1);
            }
            else{
                countOfCategory.put(p.getCategory(), 1);
                System.out.println(countOfCategory);
            }
        }
    return countOfCategory;

    }

    public static void main(String[] args) {
        Store store = new Store(Arrays.asList(new Product("milk", Category.DAIRY, 200), new Product("cream", Category.DAIRY, 500)));
        System.out.println(store.getProductsByCategoryName(Category.DAIRY));
        System.out.println(store.getProductByCategoryName(Category.DAIRY));
    }

}
