package week04d01;
/*
NameChanger osztály, privát attributuma fullName: String, mely egy ember teljes nevét reprezentálja. A fullName
attirbutum <vezetéknév><szóköz><keresztnév> formátumban épül fel. A konstruktor állítsa be a paraméterül kapott értékre
 az adattagot, de ha az érték null, vagy üres String, akkor dobjon IllegalArgumentExceptiont, a következő üzenettel:
 "Invalid Name: <paraméter értéke>".
 Legyen egy changeFirstName(String firstName) metódusa, ami megváltoztatja az objektum állapotát és kicseréli a
 keresztnevet a paraméterül kapott értékre.
 Készíts két tesztesetet, az egyikben ellenőrizd a konstruktor működését, míg a másikban a changeFirsName metódus
 működését.
 */

public class NameChanger {

    private String fullName;


    public NameChanger(String fullName) {

        if (fullName==null || fullName.trim().equals("") || fullName.isBlank()) {
            throw new IllegalArgumentException("Invalid Name: " + fullName);
        }

        this.fullName = fullName;

    }


    public String changeFirstName(String firstName) {
        String surname = fullName.substring(0, fullName.indexOf(" ") + 1);  //A szóközt is beleértve
        return surname + firstName;
    }
/*
    public void changeFirstName(String firstName){
        String[]splitted = fullName.split(" ");
        fullName = new StringBuilder(splitted[0]).append(" "+ firstName).toString();
    }

 */


    public String getFullName() {
        return fullName;
    }


}
