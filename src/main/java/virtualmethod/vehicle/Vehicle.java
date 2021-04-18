package virtualmethod.vehicle;

public class Vehicle {

    public static final int PERSON_AVERAGE_WEIGHT = 75;
    protected int vehicleWeight;

    public Vehicle(int vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public int getVehicleWeight() {
        return vehicleWeight;
    }

    public int getGrossLoad(){
       return vehicleWeight + PERSON_AVERAGE_WEIGHT;

    }
}
