package extrapractice.exam03;

import java.text.Collator;
import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers);
    }

    public void bookPassenger(Passenger passenger) {
        if (passengers.size() >= boat.getMaxPassengers()) {
            throw new IllegalArgumentException("No more seat");
        }
        passengers.add(passenger);
    }

    public double getPriceForPassenger(Passenger passenger) {
        return passenger.getCruiseClass().getMultiplier() * getBasicPrice();
    }

    public Passenger findPassengerByName(String name) {
        for (Passenger passenger : passengers) {
            if (passenger.getName().equals(name)) {
                return passenger;
            }
        }
        throw new IllegalArgumentException("Not found: " + name);
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> orderedPassengerList = new ArrayList<>();
        for (Passenger passenger : passengers) {
            orderedPassengerList.add(passenger.getName());
        }
        Collections.sort(orderedPassengerList, Collator.getInstance(new Locale("hu", "HU")));
        return orderedPassengerList;
    }

    public double sumAllBookingsCharged() {
        double sum = 0;
        for (Passenger passenger : passengers) {
            sum += getPriceForPassenger(passenger);
        }
        return sum;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> count = new HashMap<>();
        for (Passenger passenger : passengers) {
            if (!count.containsKey(passenger.getCruiseClass())) {
                count.put(passenger.getCruiseClass(), 1);
            } else {
                count.put(passenger.getCruiseClass(), count.get(passenger.getCruiseClass()) + 1);
            }
        }
        return count;
    }
}
