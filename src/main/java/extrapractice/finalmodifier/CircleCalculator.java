package extrapractice.finalmodifier;

public class CircleCalculator {

    public static final double PI = 3.14;

    public double calculatePerimeter(double r){
        return 2* r* PI;
    }

    public double calculateArea(double r){
        return r*r* PI;
    }

    public static void main(String[] args) {
        CircleCalculator circleCalculator = new CircleCalculator();
        System.out.println(circleCalculator.calculatePerimeter(3));
        System.out.println(circleCalculator.calculateArea(3));
    }
}
