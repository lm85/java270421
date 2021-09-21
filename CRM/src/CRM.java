import java.util.ArrayList;

public class CRM {
    private ArrayList<Customers>  customers;
    private  ArrayList<Meetings> meetings;

    public CRM() {

        this.customers  = new ArrayList<Customers>();
        this.meetings  = new ArrayList<Meetings>();
    }

    public void addNewCustomer(Customer customer) {
             this.meetings.add(new Meetings(customer));


    }

    //TODO: search, removeCustomer, export,(de)seralizace, DB

}
