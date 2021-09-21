import java.util.ArrayList;

public class Meetings {

    private ArrayList<Meeting> meetings = new ArrayList<>();
    private final Customer customer;

    public Meetings(Customer customer) {
        this.customer=customer;
        this.customer.setMeetings(this);
    }

    public void addMeetting(Meeting meeting) {

        this.meetings.add(meeting);

    }

    public void removeMeetting(int index) {

        this.meetings.remove(index);

    }

    public Customer getCustomer() {
        return customer;
    }

    //TODO: přetížit i dle data
    public Meeting searchMeeting(String record) throws CloneNotSupportedException {

        for (Meeting m: this.meetings) {

            if (m.getRecord().toLowerCase().contains(record)) {
                return (Meeting)  m.clone();

            }
        }

        return null;
    }

}
