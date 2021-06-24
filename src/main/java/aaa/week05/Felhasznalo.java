package aaa.week05;

/*
Készíts egy osztályt User néven, melynek van egy firstName (String), egy lastName (String) és egy email (String) mezője!
 Legyen ellenőrzés a User konstruktorában, mely hibát jelez, ha nincs @ és . (pont) az e-mail cimben! Készíts egy
 metódust is getFullName() névvel, mely visszaadja a firstName és a lastName változókat összefűzve. Legyen közöttük
 egy whitespace (" ").
 */

public class Felhasznalo {

    private String firstName;
    private String lastName;
    private String email;

    public Felhasznalo(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        if (!email.contains("@") && !email.contains(".")) {
            throw new IllegalArgumentException("invalid email!");
        }
    }

    public String getFullName(String firstName, String lastName){
       return firstName + " " + lastName;
    }

//    public String getFullName(String firstName, String lastName) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(firstName).append(" ").append(lastName).toString();
//    }
    }

