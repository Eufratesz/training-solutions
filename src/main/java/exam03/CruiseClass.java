package exam03;

public enum CruiseClass {

    LUXURY (3.1), FIRST ( 1.8), SECOND (1.0);

    double value;

    CruiseClass(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
