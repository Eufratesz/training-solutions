package training;

public class Oktato {
    String name;
    int yearOfBirth;


    public static void main(String[] args) {
        Oktato oktato = new Oktato();
        oktato.name = "Kiss István";
        oktato.yearOfBirth = 1980;
        System.out.println("Neve: " + oktato.name);
        System.out.println("Születési éve: " + oktato.yearOfBirth);
        System.out.println(2020 - oktato.yearOfBirth + " éves");
        System.out.println();

        Oktato masikOktato = new Oktato();
        masikOktato.name = "Nagy József";
        masikOktato.yearOfBirth = 1981;
        System.out.println("Neve: " + masikOktato.name);
        System.out.println("Születési éve: " +masikOktato.yearOfBirth);
        System.out.println(2020 - masikOktato.yearOfBirth + " éves");

    }
}
