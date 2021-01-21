package classstructuremethods;

public class KliensMain {

    public static void main(String[] args) {
        Kliens kliens = new Kliens();

        kliens.setName("Nagy Jolán");
        kliens.setYear(1970);
        kliens.setAddress("Budapest");

        System.out.println("Név: " + kliens.getName());
        System.out.println("Születési év: " + kliens.getYear());
        System.out.println("Lakcím: " + kliens.getAddress());
        System.out.println();
        kliens.migrate("Szeged");
        System.out.println("A címváltozás sikerült. Az új címe: "+ kliens.getAddress());
    }
}
