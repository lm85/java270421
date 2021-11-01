package vlakna1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author virtuoso
 */
public class Zasobnik {

    String retezec = null; // proměnná na uložení předávaného řetězce
    boolean vlozenRetezec = false; // přepínač, který signalizuje,
// zda je něco uloženo v řetězci

    public synchronized boolean vlozenRetezec() {
        return vlozenRetezec;
    }

    public synchronized void setVlozenRetezec(boolean b) {
        vlozenRetezec = b;
    }

    public synchronized void ulozDoZasobniku(String s) {
        while (vlozenRetezec()) {
            try {
               this.wait();
            } catch (InterruptedException e) {
                System.out.println("Ulozeni - InterruptedException");
            }
        }
        retezec = s;
        setVlozenRetezec(true);
        System.out.println("Vloženo");
        this.notifyAll();
    }

    public synchronized String vyberZeZasobniku() {
        String vracenyRetezec = null;
        while (!vlozenRetezec()) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                System.out.println("Vyber - InterruptedException");
                this.retezec = null;
                break;
            }
        }
        vracenyRetezec = this.retezec;
        setVlozenRetezec(false);
        this.notifyAll();
        System.out.println("Vybráno");
        return vracenyRetezec;
    }
}
