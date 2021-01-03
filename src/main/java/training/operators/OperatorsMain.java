package training.operators;

public class OperatorsMain {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(9));
        System.out.println(Integer.toBinaryString(9<< 1));
        System.out.println(Integer.toBinaryString(9>> 1));

        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE>>1));
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE>>>1));

        int i;
        int j;
        j = (i = 5);

        System.out.println(true || (1/0 == 0));
        System.out.println(true | (1/0 == 0));
        System.out.println(true | false);
    }
}
