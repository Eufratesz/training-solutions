package aaa.week04;
/*
Készítsd el a NameChanger osztályt, melynek privát attribútuma legyen a String fullName, mely egy ember teljes nevét
reprezentálja! A fullName attribútum [vezetéknév][szóköz][keresztnév] formátumban épül fel. A konstruktor állítsa be
a paraméterül kapott értékre az adattagot, de ha az érték null, vagy üres String, akkor dobjon egy
IllegalAgrumentException kivételt a következő üzenettel: Invalid name:[paraméter értéke]!
Legyen egy changeFirstName(String firstName) metódusa, mely megváltoztatja az objektum állapotát és kicseréli a
keresztnevet a paraméterül kapott értékre!Készíts két tesztesetet, az egyikben ellenőrizd a konstruktor működését,
míg a másikban a changeFirstName metódus működését!

 */

import java.util.Scanner;

public class NameChanger {
    private String fullName;

    public NameChanger(String fullName) {
        if(fullName == null || fullName.trim().equals("")){
            throw new IllegalArgumentException("Invalid name: "  + fullName );
        }
        this.fullName = fullName;
    }



    public String changeFirstName(String firstName){
        int space = fullName.indexOf(" ");
        String surname = fullName.substring(0, space + 1); //+1, h a szóköz is hozzá tartozzon a vezetéknévhez.
        String newFullname = surname + firstName;
        return newFullname;
    }

    public String getFullName() {
        return fullName;
    }

// másik megoldás:
//    public void changeFirstName(String firstName) {
//    Scanner scanner = new Scanner(fullName);
//    String lastName = scanner.next();
//    String originalFirstname = scanner.next();
//    String newFullName = lastName + " " + firstName;
//    fullName = newFullName;
//    }




//    public static void main(String[] args) {
//        NameChanger nameChanger = new NameChanger("Kovács István");
//        nameChanger.changeFirstName("József");
//        System.out.println(nameChanger.fullName);
//    }


}
