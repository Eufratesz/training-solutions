package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {


    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers;


    public Cruise(Boat boat, LocalDate sailing, double basicPrice, List<Passenger> passengers) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
        this.passengers = passengers;
    }

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public boolean bookPassenger(Passenger passenger) {
        for (int i = 0; i < passengers.size(); i++) {
            if (i < boat.getMaxPassengers()) {
                passengers.add(passenger);
            }
        }
        return true;
    }


    public double getPriceForPassenger(Passenger passenger) {
        double price = passenger.getCruiseClass().getValue();
        return price;

    }

    public Passenger findPassengerByName(String name) {

        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.contains(name)) {
                Passenger foundPassenger =passengers.get(i);
                return foundPassenger;
            }
        }
        return ;
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> namesOrdered = new ArrayList<>();
        for(Passenger p: passengers)
            namesOrdered = Collections.sort(passengers);
        return namesOrdered;

    }

    public double sumAllBookingsCharged() {
        double sum=0;
        double price = getPriceForPassenger();
        for (int price  ) {
            sum += price;
        }
        return sum;

    }

    Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer>booking = new HashMap<>();
        for()
    }

        public Boat getBoat () {
            return boat;
        }

        public LocalDate getSailing () {
            return sailing;
        }

        public double getBasicPrice () {
            return basicPrice;
        }

        public List<Passenger> getPassengers () {
            return passengers;
        }
    }
}
