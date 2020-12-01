package methodstructure;

public class BodyMass {

    public static double LOWER_LIMIT = 18.5;    //ezt én kihagytam, a számokkal dolgoztam
    public static double UPPER_LIMIT = 25.0;

    private double weight;
    private double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    double bodyMassIndex() {
        return getWeight() / (getHeight() * getHeight());       //jó így getterekkel is?

    }


    public BmiCategory body() {
        double bmi = bodyMassIndex();
        if (bmi < 18.5)
            return BmiCategory.UNDERWEIGHT;
        if (bmi > 25.0)
            return BmiCategory.OVERWEIGHT;

        return BmiCategory.NORMAL;
            }


    public boolean isThinnerThan(BodyMass other) {              //ezt túlbonyolítottam először.
        return bodyMassIndex() < other.bodyMassIndex();
        }
    }

