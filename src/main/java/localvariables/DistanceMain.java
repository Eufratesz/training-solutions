package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(120.55, true);
        System.out.println(distance.getDistanceInKm() + " " + distance.isExact());

//ezt meg kellett néznem a megoldókulcsban, de már értem.
        int distanceWholeNumber = (int)distance.getDistanceInKm();
                System.out.println(distanceWholeNumber);



    }

}
