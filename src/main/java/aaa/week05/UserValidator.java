package aaa.week05;

/*
A UserValidator osztályba írj egy validate(List<User>) metódust, mely leellenőrzi a paraméterben átadott felhasználókat!
 (A User egy String name és egy int age attribútumot tartalmazzon!) Ha a lista null, dobjon kivételt! Ha a felhasználó
  null, dobjon kivételt! Ha A felhasználó neve null, vagy üres, dobjon kivételt! Ha az életkor kisebb, mint 0,
  vagy nagyobb, mint 120, dobjon kivételt!
 */

import java.util.List;

public class UserValidator {



    public void validate(List<User> users) {

        if (users == null) {
            throw new IllegalArgumentException("The list of users is null!");
        }

        for (User user : users) {
            if (user.getName() == null || user.getName().isEmpty()) {
                throw new IllegalArgumentException("No user name");
            }
            if (user.getAge() < 0 || user.getAge() > 120) {
                throw new IllegalArgumentException("Incorrect age!");
            }
        }
    }
}
