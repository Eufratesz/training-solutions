package aaa.week02d03;
/*
Írj egy Product oszályt String name és String code attribútumokkal! Legyen egy konstruktora a két attribútummal!
Legyen egy areTheyEqual() metódusa, mely kap egy másik Product példányt, és eldönti, hogy azonos-e az adott példánnyal.
 Két termék akkor egyezik, ha a nevük megegyezik.
Bónusz: szigorúbb egyelőség a feltételre: a két termék kódjának hosszának különbsége maximum egy karakter lehet.

 */

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

    public boolean areTheyEqual(Product anotherProduct){
        return name.equals(anotherProduct.getName());
    }

    public boolean haveSimilarCodes(Product anotherProduct){
        return Math.abs(code.length()-anotherProduct.getCode().length())<=1;
    }

    public static void main(String[] args) {
        Product product = new Product("alma", "1111");
        Product secondProduct = new Product("alma", "1112");
        Product thirdProduct = new Product("alja", "1111");
        Product fourthProduct = new Product("alja", "11111");
        Product fifthProduct = new Product("alja", "11");

        System.out.println(product.areTheyEqual(secondProduct));
        System.out.println(product.areTheyEqual(thirdProduct));
        System.out.println(product.areTheyEqual(fourthProduct));
        System.out.println(product.areTheyEqual(fifthProduct));
        System.out.println(product.haveSimilarCodes(secondProduct));
        System.out.println(product.haveSimilarCodes(thirdProduct));
        System.out.println(product.haveSimilarCodes(fourthProduct));
        System.out.println(product.haveSimilarCodes(fifthProduct));

    }
}
