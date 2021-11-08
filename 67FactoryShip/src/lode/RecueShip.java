package lode;

public class RecueShip extends Ship {

    private Ship ship;

    public RecueShip(String name,Flotile flotile) {
        super("RecueShip:" + name,flotile);
        this.maxHp=1;

    }

    public void loadShip(Ship ship) {

        this.ship = ship;
    }

    public void takeShiptoDock(Dock dock) {

        dock.loadShip(this.ship);
        this.ship=null;
    }

    public void takeShipfromDock(Dock dock) {

        dock.unLoadShip();
    }


}
