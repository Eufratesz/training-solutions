package extrapractice.localvariables;

public class DistanceMain {

    public static void main(String[] args) {


        Distance distance = new Distance(20.6, false);
        System.out.println(distance.getDistanceInKm() + " " + distance.isExact());

        int i;
        i = (int)distance.getDistanceInKm();
        System.out.println(i);

        Distance anotherDistance = new Distance( 50.0, true);
        System.out.println(anotherDistance.getDistanceInKm() + " " + anotherDistance.isExact());
        int part = (int)anotherDistance.getDistanceInKm();
        System.out.println(part);



    }
}
