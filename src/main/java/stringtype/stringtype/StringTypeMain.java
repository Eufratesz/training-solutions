package stringtype.stringtype;

public class StringTypeMain {
    public static void main(String[] args) {

        String prefix = "Hello";
        String name = "John Doe";

        String message  = prefix + name;

        message = message + 444;
        System.out.println(message);

        boolean b = message.equals("Hello John Doe");
        System.out.println(message.equals(b));

        boolean c = message.equals("Hello John Doe 444");
        System.out.println(c);


        String cake = "apple" + "pie";
        System.out.println(cake);
        System.out.println(cake.length());


        String string = "Abcde";
        System.out.println(string.length());
        System.out.println(string.charAt(0) + ", " + string.charAt(2)); //Ezt még nem ismertem, a többi ment.
        System.out.println(string.substring(0, 3));

    }
}
