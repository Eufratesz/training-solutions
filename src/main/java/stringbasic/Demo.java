package stringbasic;

public class Demo {

    public static void main(String[] args) {
        String s = "John Doe";
        s = s.toUpperCase();
        System.out.println(s);

        String u = "John Doe";
        String t = "John Doe";
        System.out.println(u == t);  //String poolban jön létre, újra felhasználja, tehát a referencia megegyezik.

        String v = new String("John Doe");
        String z = new String("John Doe");
        System.out.println(v == z); // a heapen jönnek létre, nem a poolból veszi
        System.out.println(v.equals(z));


        String a = new String("John Doe").intern();
        String b = new String("John Doe").intern();
        System.out.println(a == b); // a heapen jönnek létre, nem a poolból veszi
        System.out.println(v.equals(z));
    }
}

