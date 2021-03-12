package extrapractice.stringtype;

public class StringTypeMain {

    public static void main(String[] args) {
        String prefix;
        prefix = "Hello";

        String name;
        name = "John Doe";

        String message = prefix + name;
        System.out.println(message);

        message = message + 444;
        System.out.println(message);

        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");
        System.out.println(b);
        System.out.println(c);

        System.out.println(" ".length());
        System.out.println(" "+" ".length());

        System.out.println("Abcde".length());
        System.out.println("Abcde".substring(0,1) +"," + "Abcde".substring(2,3));
        System.out.println("Abcde".substring(0,2));


    }
}
