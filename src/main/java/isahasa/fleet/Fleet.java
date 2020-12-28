package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private List<Ship>ships = new ArrayList<>();

    private int waitingPeople;
    private int waitingCargo;

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }

    public void addShip(Ship newShip) {
        ships.add(newShip);
    }

    public void loadShip(int numberOfPeople, int cargoWeight) {
        int remainingPeople = numberOfPeople;
        int remainingCargo = cargoWeight;


        for(Ship ship : ships) {
            if (ship instanceof CanCarryPassengers) {
                if(remainingPeople != 0) {
                    remainingPeople = ((CanCarryPassengers) ship).loadPassenger(remainingPeople);
                }
            }
            if (ship instanceof CanCarryGoods) {
                if (remainingCargo != 0) {
                    remainingCargo = ((CanCarryGoods) ship).loadCargo(remainingCargo);
                }
            }

        }
        waitingPeople = remainingPeople;
        waitingCargo = remainingCargo;
    }
}
