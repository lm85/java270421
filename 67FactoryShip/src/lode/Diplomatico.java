package lode;

public class Diplomatico extends Ship{

    public Diplomatico(String name) {
        super("Diplomatico:"+name);
        this.hp=2;
        this.maxHp=2;
    }
    public Diplomatico(String name,Flotile flotile) {
        super("Diplomatico:"+name,flotile);
        this.hp=2;
        this.maxHp=2;
    }

}
