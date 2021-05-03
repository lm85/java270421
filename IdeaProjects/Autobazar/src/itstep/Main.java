package itstep;

public class Main {

    public static void main(String[] args) {
        Auto moje =new Auto("Škoda","fobia",11,9.5,250000);
        System.out.println(moje);

        ServiceBook sb1 = new ServiceBook(moje);



        moje.getServiceBook().addRecord("První záznam");
        System.out.println(moje);

        Autobazar Kriha = new Autobazar("Kříha",1);
        try {
            Kriha.addCar(moje);
        } catch (fullException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        try {
            Kriha.addCar(moje);
        }
        catch (fullException e) {

            System.err.println(e.getMessage());
        }
        catch (Exception e) {

            System.err.println(e.getMessage());
        }


    }
}
