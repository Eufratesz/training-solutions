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






    }
}
