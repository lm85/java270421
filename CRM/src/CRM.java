import java.util.ArrayList;

public class CRM {
    private ArrayList<Customer>  customers;
    private  ArrayList<Meetings> meetings;

    public CRM() {

        this.customers  = new ArrayList<Customer>();
        this.meetings  = new ArrayList<Meetings>();
    }

    public void addNewCustomer(Customer customer) {
             this.meetings.add(new Meetings(customer));
            this.customers.add(customer);


    }

    //TODO: search, removeCustomer, export,(de)seralizace, DB

    @Override
    public String toString() {
        return "CRM{" +
                "customers=" + customers +
                ", meetings=" + meetings +
                '}';
    }
}
