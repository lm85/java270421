package lode;

public class Cruiser extends Ship implements Atackable{
    protected int damage=2;

    public Cruiser(String name) {
        super(name);
        super.hp=3;
        this.maxHp=3;
    }
    public Cruiser(String name,Flotile flotile) {
        super(name,flotile);
        super.hp=3;
        this.maxHp=3;



    }

   /* Cruiser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    public void dealDamage(Ship ship) {

        if (ship==this) return;

        ship.decreeseHp(this);
    }

    public int getDamage() {

        return this.damage;
    }


}
