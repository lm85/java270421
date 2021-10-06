public class Main {

    public static void main(String[] args) {

        Email email = new Email("Novak");

        String surname = "Novak";

        email.getLastInc(surname);// vrátí Novak

        String surname2 = "Novak";
        System.out.println(
        email.getLastInc(surname2));// vrátí Novak2




    }
}
