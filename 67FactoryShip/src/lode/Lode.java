package lode;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Lode {


    public static void main(String[] args) {
       Sea sea = new Sea(2);
          (new Simulator(sea)).play();

        try {
            Flotile cppp = new Flotile("CCCP");
            System.out.println("---");
        } catch (Exception ex) {
            Logger.getLogger(Lode.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Flotile cr = new Flotile("ČR", 12);
            System.out.println("---");
        } catch (Exception ex) {
            Logger.getLogger(Lode.class.getName()).log(Level.SEVERE, null, ex);
        }



        Diplomatico santa_maria = new Diplomatico("Santa Maria");

        //santa_maria.getHp();
        Cruiser kriznik = new Cruiser("Potěnkin");
        //kriznik.getHp();

        kriznik.dealDamage(santa_maria);


        Cruiser kriznik2 = new Cruiser("Potěnkin II");

        kriznik.dealDamage(kriznik2);

        System.out.println(kriznik2.getHp());
        /************/
        Dock dock1 = new Dock();

        System.out.println("santa_maria: "+santa_maria.getHp());
        kriznik.dealDamage(santa_maria);
        System.out.println("santa_maria: "+santa_maria.getHp());

        dock1.loadShip(santa_maria);
        dock1.repairShip();
        dock1.unLoadShip();

        System.out.println("santa_maria: "+santa_maria.getHp());

            try {
            Flotile cccp = new Flotile("cccp",10);
            } catch (Exception ex) {
            Logger.getLogger(Lode.class.getName()).log(Level.SEVERE, null, ex);
            }

    }

}