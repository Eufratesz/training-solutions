package operators;

public class OperatorsMain {

    public static void main(String[] args) {
//Páros szám:
        Operators operators = new Operators();
        System.out.println(operators.isEven(8));
        System.out.println(operators.isEven(7));

//Léptető operátorok:
        System.out.println(Integer.toBinaryString(100));
        System.out.println(16);
        System.out.println(16 >> 1);  //8 (2-vel való osztás)
        System.out.println(16 << 1);  //32 (2-vel való szorzás)
        System.out.println(13);
        System.out.println(13 >> 1);  //6 (2-vel való osztás -1)
        System.out.println(13 << 1);  //26 (2-vel való szorzás)
/*
        System.out.println(operators.multiplyByPowerOfTwo(3, 2));       //12
        System.out.println(operators.multiplyByPowerOfTwo(5, 3));       //30
            hibás lett.

 */
        System.out.println(operators.multiplyByPowerOfTwoSolution(3, 2));  //12
        System.out.println(operators.multiplyByPowerOfTwoSolution(5, 3));  //40

        //Bónusz feladat:
        int i = -1;
        String s = Integer.toBinaryString(i);
        System.out.println(s);

      //  int j = Integer.parseInt(s, 2);   //NumberformatException
      //  System.out.println(j);

        System.out.println(Long.valueOf(s, 2).intValue());   //-1

        System.out.println(0333);           //219

//megoldókulcs alapján:
        operators.convert();
        operators.cannotConvert();


    }
}
