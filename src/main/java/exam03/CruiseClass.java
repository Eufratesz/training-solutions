package exam03;

public enum CruiseClass {

LUXURY(3.0), FIRST(1.8), SECOND(1.0);

    public double multiplier;

    CruiseClass(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }
}
