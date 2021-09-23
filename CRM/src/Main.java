import java.util.Date;
import java.sql.Time;

public class Main {

    public static void main(String[] args) {

        /*
        1. person
        2. address
        3. customer
        4. meeting
        5. customers
        6. Meetings
        7. Vytvořit třídu CRM

         */

        Person p1 =  new Person("lm","Masič","lm@itstep","0609");
        System.out.println(p1);


        Address a1 = new Address("Pod mostem","2a","190 00","Díra");
        System.out.println(a1);
        a1.setCity("Řiť");
        System.out.println(a1);

        Customer c1 = new Customer("Zákazník",a1,p1, "pozn");
        Meetings meettings = new Meetings (c1);



        Meeting meeting = new Meeting(new Date(),new Time(19,06,6),a1);
        meettings.addMeetting(meeting);

        System.out.println(meettings);


//***************
        CRM  LM = new CRM();

        LM.addNewCustomer(c1);

        System.out.println(LM);


    }

}
