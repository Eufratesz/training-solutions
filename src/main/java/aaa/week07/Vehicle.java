package aaa.week07;

public class Vehicle {

    private int numberOfGears;
    private TransmissionType transmissionType;

    public Vehicle(int numberOfGears, TransmissionType transmissionType) {
        this.numberOfGears = numberOfGears;
        this.transmissionType = transmissionType;
    }

    public final int getNumberOfGears() {
        return 5;
    }

    public TransmissionType getTransmissionType() {
        return TransmissionType.MANUAL;
    }
}
