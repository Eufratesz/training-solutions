package aaa.week03;

/*
Írj egy Operation osztályt, mely konstruktorban kap egy összeadást, pl. 68+12! A getResult() metódus visszaadja a
művelet eredményét. Egy belső leftOperand és rightOperand attribútumba dolgozz!
 */

public class Operation {


    public int getResult(String osszeadas){
        int plusSign = osszeadas.indexOf("+");
        int leftOperand = Integer.parseInt(osszeadas.substring(0, plusSign).trim());
        int rightOperand = Integer.parseInt(osszeadas.substring(plusSign+1).trim());
        return leftOperand + rightOperand;
    }

    public static void main(String[] args) {
        Operation operation = new Operation();
        System.out.println(operation.getResult("68+12"));

        Operation operation2 = new Operation();
        System.out.println(operation2.getResult("124+5"));
    }
}
