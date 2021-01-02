package training.finalmodifier;

public class Circle {

    public static final double PI = 3.14;

    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double calculatePerimeter(double r) {

        return 2*r*PI;
    }
}
