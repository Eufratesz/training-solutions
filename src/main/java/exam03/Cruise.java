
package exam03;


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

    public void bookPassenger(Passenger passenger) {
        if(boat.getMaxPassengers() <= passengers.size()){
            throw new IllegalArgumentException("Too many passengers.");
        }
        passengers.add(passenger);
    }

    public double getPriceForPassenger(Passenger passenger){
        if (passenger.getCruiseClass() == CruiseClass.LUXURY) {
            return basicPrice *3;
        }
        else if (passenger.getCruiseClass() == CruiseClass.FIRST) {
            return basicPrice *1.8;
        }
        else if (passenger.getCruiseClass() == CruiseClass.SECOND){
            return basicPrice;
        }
        else {
            throw new IllegalArgumentException("No price for class");
        }
    }

    public Passenger findPassengerByName(String name){

        for(Passenger passenger: passengers){
            if(passenger.getName().equals(name)){
                return passenger;

            }
        }
        throw new IllegalArgumentException("Cannot find the name: " + name);
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> orderedList = new ArrayList<>();

        for(Passenger passenger : passengers){
            orderedList.add(passenger.getName());

        }
        Collections.sort(orderedList, Collator.getInstance(new Locale("hu", "Hu")));
        return orderedList;
    }

    public double sumAllBookingsCharged(){
        double sum = 0.0;
        for(Passenger passenger : passengers) {
            sum+= getPriceForPassenger(passenger);
        }
        return sum;
    }

    public Map<CruiseClass, Integer> countPassengerByClass(){
        Map<CruiseClass, Integer> counts = new HashMap<>();
        for(Passenger passenger :passengers) {
            if(!counts.containsKey(passenger.getCruiseClass())) {
                counts.put(passenger.getCruiseClass(), 1);
            }
            else {
                counts.put(passenger.getCruiseClass(), counts.get(passenger.getCruiseClass())+1);

            }
        }
        return counts;
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
        return passengers;
    }
}

