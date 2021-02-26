package exam03;

import java.text.Collator;
import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger>passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger passenger) {
        if(passengers.size()>= boat.getMaxPassengers()){
            throw new IllegalArgumentException("no more seat in boat");
        }
        if(passengers.size()< boat.getMaxPassengers()){
            passengers.add(passenger);
        }
    }

    public double getPriceForPassenger(Passenger passenger) {
        double price = basicPrice * passenger.getCruiseClass().getValue();
        return price;
    }

    public Passenger findPassengerByName(String name) {
        Passenger found = null;
        for(Passenger passenger : passengers){
            if(passenger.getName().equals(name)){
                found = passenger;
                return found;
            }
        }
        throw new IllegalArgumentException("not found:" + name);
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> orderedNames = new ArrayList<>();
        for (Passenger passenger : passengers) {
            orderedNames.add(passenger.getName());
            Collections.sort(orderedNames, Collator.getInstance(new Locale("hu", "HU")));

        }
        return orderedNames;
    }

    public double sumAllBookingsCharged(){
        Cruise cruise = new Cruise(boat, sailing, basicPrice);
        double sum =0.0;
        for(Passenger passenger : passengers) {
            sum += getPriceForPassenger(passenger);
        }
        return sum;
    }

    public Map<CruiseClass, Integer> countPassengerByClass(){
        Map<CruiseClass, Integer>count = new HashMap<>();
        for (Passenger passenger : passengers) {
            if(!count.containsKey(passenger.getCruiseClass())) {
                count.put(passenger.getCruiseClass(), 1);

            }else{
                count.put(passenger.getCruiseClass(), count.get(passenger.getCruiseClass())+1);
            }
        }
        return count;
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
}
