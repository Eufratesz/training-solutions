package week05d05;

public class User {

    String firstName;
    String lastName;
    String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

        public boolean isValidEmail (String email){
            if (email.contains("@") && email.contains(".")) {
                return true;
            }
            return false;

        }



    public static void main(String[] args) {

    User user = new User("Jim", "Smith","johnsmith@gmail.com");

    public String getFullName() {           //nem tudom javítani:(
            System.out.println(user.firstName + "" + user.lastName);
        }



}
}
    /*
    Készíts egy osztályt week05d05.User néven, melynek van egy firstName (String),
    egy lastName (String) és egy email (String) mezője.
    Legyen ellenőrzés az User konstruktorában, mely hibát jelez, ha nincs @ és . (pont)
    az e-mail cimben! Készíts egy metódust is getFullName névvel, mely visszaadja a firstName
    és a lastName változókat összefűzve. Legyen közöttük egy whitespace (" ").
    Bónusz feladat: írjunk teszteket}
*/