package week03d05;

public class Operation {

    private int leftOperand;
    private int rightOperand;

    public Operation(String expression) {
        //leftOperand = Integer.parseInt(muvelet.substring(0, muvelet.indexOf("+")));
       // rightOperand = Integer.parseInt(muvelet.substring(muvelet.indexOf("+") +1));

        String left = expression.substring(0, expression.indexOf("+")).trim();
        leftOperand = Integer.parseInt(left);

        String right = expression.substring(expression.indexOf("+") +1);
        right = right.trim();                   //így is lehet trimmelni
        rightOperand = Integer.parseInt(right);

    }

    public int getResult(){
        return rightOperand + leftOperand;
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public static void main(String[] args) {
        Operation operation = new Operation("68+12");
        System.out.println(operation.getLeftOperand());
        System.out.println(operation.getRightOperand());

    }
}
