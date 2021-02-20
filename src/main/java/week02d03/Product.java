package week02d03;

public class Product {

    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean haveSameName(Product p){
        return p.getName().equals(name);
    }

    public boolean areTheyEqual(Product p){
        int difference = code.length() - p.code.length();            //a kódjuk hossza max csak 1-gyel térhet el.
        boolean sameLength = difference >= -1 &&difference <= 1;
        boolean sameName = p.getName().equals(name);                    //a nevük egyezzen meg.
        return sameLength && sameName;
        }


    public static void main(String[] args) {
        Product product = new Product("alma", "122344");
        Product anotherProduct = new Product("körte", "987655");
        Product thirdProduct = new Product("alma", "12234456");
        Product fourthProduct = new Product("alma", "122344");

        System.out.println("Product és anotherProduct neve megegyezik? " + product.haveSameName(anotherProduct));
        System.out.println("Product és thirdProduct neve megegyezik? " + product.haveSameName(thirdProduct));
        System.out.println("Product és fourthProduct neve megegyezik? " + product.haveSameName(fourthProduct));

        System.out.println("Product és anotherProduct egyenlő? " + product.areTheyEqual(anotherProduct));
        System.out.println("Product és thirdProduct egyenlő? " +product.areTheyEqual(thirdProduct));
        System.out.println("Product és fourthProduct egyenlő? " +product.areTheyEqual(fourthProduct));


    }
}
