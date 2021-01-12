/*
Készítsd el a `Courier` osztályt.
 Ez fogja a futárt reprezentálni. Legyen egy rides listája ami fuvarokat tárol. Legyen egy addRide metódus,
 ami csak sorrendben enged hozzáadni elemeket a listához. Figyeljünk viszont arra, hogy nem feltétlenül minden
 nap dolgozott a futár, de ha már bekerült egy 3. napi fuvar, akkor ne kerülhessen be egy 2. napi. És arra is figyelj,
  űhogy a napon belül is sorrendben kerüljenek be az adatok. Ha a paraméterül kapott Ride nem felel meg a feltételeknek
  dobjunk `IllegalArgumentException`-t.
 Készíts egy metódust, ami visszad egy napot amikor a futár nem dolgozott. Ha több ilyen nap is van akkor a korábbit!
 */
package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        int a = rides.size();
        if (a == 0) {
            if (ride.getRide() == 1) {
                rides.add(ride);
            } else {
                throw new IllegalArgumentException("Incorrect ride");
            }

        }
        if ( a !=0){
            Ride previous = rides.get(a-1);
            if (previous.getDay() == ride.getDay() && previous.getRide()+1 == ride.getRide()) {
                rides.add(ride);
            }
            else if( previous.getDay() < ride.getDay() && ride.getRide() == 1){
                rides.add(ride);
            }else {
                throw new IllegalArgumentException("Incorrect ride");

            }

        }
    }

    public int noWork(){
        for ( int i = 1; i < 8; i++) {
            for( Ride item : rides) {
                if(i == item.getDay()) {
                    break;
                }
              return i;
            }

        }
        return -1;
    }
}
