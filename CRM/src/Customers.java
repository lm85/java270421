import java.util.ArrayList;

public class Customers {
    private ArrayList<Customer> Customers = new ArrayList<>();

    public Customers() {
    }

    public void addCustomer(Customer customer) {

        //TODO: řešit duplicity
        this.Customers.add(customer);

    }

    public void removeCustomer(Customer customer) {

        this.Customers.remove(customer);

    }

    public void removeCustomer(int index) {

        this.Customers.remove(index);

    }

    public Customer getCustomer(int index) throws CloneNotSupportedException {

        //return this.Customers.get(index);

        return (Customer) this.Customers.get(index).clone();



    }

    public Customer searchCustomer(String name) throws CloneNotSupportedException {

        for (Customer c: this.Customers) {

            if (c.getName().equals(name)) {
                return (Customer)  c.clone();

            }
        }



    }



}
