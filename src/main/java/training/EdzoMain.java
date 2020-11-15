package training;
// Gyakorlásképpen újra megoldom. Trainer helyett Edzo
public class EdzoMain {

    public static void main(String[] args) {
        Edzo edzo = new Edzo();
        edzo.setName("Takács János");
        edzo.setYearOfBirth(1970);
        System.out.println(edzo.getName());
        System.out.println(edzo.getNameAndYearOfBirth());

        Edzo masikEdzo = new Edzo();
        masikEdzo.setName("Kovács János");
        masikEdzo.setYearOfBirth(1971);
        System.out.println(masikEdzo.getName() + ", " + masikEdzo.getYearOfBirth());

        System.out.println(masikEdzo.getName());
        System.out.println(masikEdzo.getNameAndYearOfBirth());
        System.out.println(edzo.getNameAndYearOfBirth());

        masikEdzo.changeName("Szakács János");
        System.out.println(masikEdzo.getName());
        System.out.println(masikEdzo.getNameAndYearOfBirth());

        masikEdzo.setName("Kovács János");
        System.out.println(masikEdzo.getName());
    }
}
