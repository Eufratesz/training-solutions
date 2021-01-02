package finalmodifier;

public class Gentleman {

    private static final String MESSAGE_PREFIX = "Hello ";

    private String name;
/*
A megoldókulcsban nincs konstruktor
    public Gentleman(String name) {
        this.name = name;
    }

 */

    public String sayHello(String name) {
        return MESSAGE_PREFIX + name;
    }

    public static void main(String[] args) {


        System.out.println(new Gentleman().sayHello("Mr Smith"));
    }
}
