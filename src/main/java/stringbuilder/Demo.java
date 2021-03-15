package stringbuilder;

public class Demo {

    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("John");
        for (int i = 0; i< 3; i++){
            sb.append(" Doe");
        }
        String s = sb.toString();
        System.out.println(s);  //üres String

       // StringBuilder sb = new StringBuilder(15);

        sb.insert(1, "xxx");
        System.out.println(sb);                         //Jxxxohn Doe Doe Doe

        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.delete(1, 3);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
