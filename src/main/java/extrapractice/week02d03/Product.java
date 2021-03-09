package extrapractice.week02d03;

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

    public boolean haveSameName(Product p) {
        return p.getName().equals(name);

    }



    public boolean areTheyEqual(Product p) {
        boolean codeDifference = Math.abs(code.length() - p.code.length()) <=1;
        boolean nameEqual = p.getName().equals(name);
        return codeDifference && nameEqual;
    }

    public static void main(String[] args) {
        Product firstProduct = new Product("alma", "132");
        Product secondProduct = new Product("Körte", "133");
        Product thirdProduct = new Product("alma", "144");
        Product fourthProduct = new Product("alma", "144");

        System.out.println(firstProduct.haveSameName(thirdProduct));


        System.out.println(firstProduct.areTheyEqual(secondProduct));
        System.out.println(firstProduct.areTheyEqual(thirdProduct));

        System.out.println(thirdProduct.areTheyEqual(fourthProduct));
    }
}
