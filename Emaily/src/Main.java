



import java.util.ArrayList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
/*
        Email email = new Email("Novak");

        String surname = "Novak";

        String surname2 = "Novak";
        System.out.println(
                email.getLastInc());// vrátí Novak2


        email.getLastInc();// vrátí Novak

*/
        //ArrayList<ArrayList<String>> xxx = new ArrayList<ArrayList<String>>();

        String[][] xxx =
                {
            /*    {"Nováková", "Jana"},
                {"Novák", "Jan"},
                {"Svobodová", "Lucie"},
                {"Svoboda", "Tomáš"},
                {"Novotná","Marie"},
                {"Novotný","Josef"},
                {"Dvořáková","Pavla"},
                {"Dvořák","Martin"},
                {"Černá","Karolína"},
                {"Černý","Jaroslav"},
                {"Procházková","Eva"},*/
                {"Procházka","Miroslav"},
                        {"Kučerová","Hana"},
                        {"Kučerová","Hana"}



                        
    };

        Emails emails = new Emails("istep.org");

        emails.importNames(xxx);

        System.out.println(emails);




    }
}
