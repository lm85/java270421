package itstep;

import java.util.Scanner;

public class Helper {
    private double min;
    private double max;
    private Scanner sc;

    Helper() {

        sc= new Scanner(System.in);

    }


    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }



    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }



    public double getDouble() {
    double x=0;

        do {
            try {
            System.out.println("Zadej double");
            x=Double.parseDouble(sc.nextLine());
            }
            catch (NumberFormatException e) {



            }
        }
        while( !(x>this.min&&x<this.max) );

    }


}
