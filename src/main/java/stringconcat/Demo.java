package stringconcat;

public class Demo {

    public static void main(String[] args) {
        String s = "John";
//        s = s.concat(" Doe");
        s = s + " Doe";
        System.out.println(s);


        String t = 1 + 2 + "value";
        System.out.println(t);  //3value

        String a = "value" + 1 + 2;
        System.out.println(a);  //vaule12

        String b = 1 + "value" + 2;
        System.out.println(b);      //1vaule2


        int i = 8;
        String c = Integer.toString(8);


    }
}
