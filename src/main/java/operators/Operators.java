package operators;

public class Operators {

    //Páros szám:
/*
    public boolean isEven(int n) {
        return n %2 ==0;
    }

 */
/*
    public boolean isEven(int n) {
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }

 */

    public boolean isEven(int n) {
        if (n % 2 != 0) {
            return false;
        } else {
            return true;
        }
    }

    //Léptető operátorok:
    /*
    public int multiplyByPowerOfTwo(int i, int j) {
        return (i << 1) * j;  // nem jól működik.
    }

     */

    public int multiplyByPowerOfTwoSolution(int number, int power) {
        return number << power;
    }
//Megoldókulcs alapján:
    public void cannotConvert() {
        int i = -1;
        String s = Integer.toBinaryString(i);
        System.out.println(s);
        int j = Integer.parseInt(s, 2);
        System.out.println(j);
    }

    public void convert(){
        int i = -1;
        String s = Integer.toBinaryString(i);
        System.out.println(s);
        int j = Long.valueOf(s, 2).intValue();
        System.out.println(j);
    }






    }
