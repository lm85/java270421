package lode;

public class Cannon implements Atackable, Hitable{
    int damage=2;
    protected int hp = 1;
    protected String name = "";
    protected int maxHp = 1;
    //protected Flotile flotile;

    public Cannon(String name)
    {
        this.name=name;

    }
    public void dealDamage(Ship ship) {
        ship.decreeseHp(this);
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void decreeseHp(Atackable atc) {

    }

}
