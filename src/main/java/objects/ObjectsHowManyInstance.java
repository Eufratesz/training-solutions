package objects;

public class ObjectsHowManyInstance {

    public static void main(String[] args) {

        ObjectsHowManyInstance objectsHowManyInstance = new ObjectsHowManyInstance();

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book5;
        book5 = new Book();
        book6 = null;

   /*

a kiíratás nem tökéletes:(
        System.out.println("book 1: " + objectsHowManyInstance.toString().);
        System.out.println("book 2: " + book2);
        System.out.println("book 3: " + book3);
        System.out.println("book 4: " + book4);
        System.out.println("book 5: " + book5);
        System.out.println("book 6: " + book6);
        System.out.println("book 7: " + book7);
    }

    */

    }
}
