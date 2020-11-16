package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance (800.5, false);
        System.out.println(distance.getDistanceInKm() + ", " + distance.isExact());

        int egeszResz = (int)(distance.getDistanceInKm());
        System.out.println(egeszResz);





    }

}
