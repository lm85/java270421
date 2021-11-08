package lode;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Dock {

    private Ship ship;

    public Dock() {

    }

    public void loadShip(Ship ship) {
        this.ship = ship;

    }

    public void unLoadShip() {
        this.ship = null;

    }

    public void repairShip() {
        if (ship!=null) {
            try {
                ship.increeseHp(this);
            } catch (Exception ex) {
                Logger.getLogger(Dock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Ship getShip() {

        return this.ship;

    }

}
