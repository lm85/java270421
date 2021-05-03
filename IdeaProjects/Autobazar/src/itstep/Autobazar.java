package itstep;

public class Autobazar {
    private int pocet = 0;
    private final int maxPocet;
    private Auto[] auta;
  //  private ServiceBook[] serknihy;
    String nazev;
   // Color c;

    public Autobazar(String nazev) {

        this.nazev = nazev;
        this.maxPocet = 10;
        this.auta = new Auto[maxPocet];
      //  serknihy = new ServiceBook[maxPocet];
    }

    public Autobazar(String nazev, int pocet) {

        this.nazev = nazev;
        this.maxPocet = pocet;
        this.auta = new Auto[maxPocet];
      //  serknihy = new ServiceBook[maxPocet];

    }


    public void addCar(Auto car) throws fullException {

        if (pocet < maxPocet) {
            this.auta[pocet] = car;

         /*   if (car.serviceBook == null) {
                ServiceBook sb1 = new ServiceBook(car);

            }
            this.serknihy[pocet] = car.serviceBook;
*/
            this.pocet++;
        }else
        {

            throw new fullException("Máme plno");

        }

    }
}
