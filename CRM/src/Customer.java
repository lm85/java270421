public class Customer implements Cloneable {

    private String name;
    private Address residence;
    private Person contactPerson;
    private String notes;
    private Meetings meetings;

    public Customer() {


    }
    public Customer(String name, Address residence, Person contactPerson, String notes) {
        this.name = name;
        this.residence = residence;
        this.contactPerson = contactPerson;
        this.notes = notes;
    }

    public void setMeetings (Meetings meetings) {

        if (meetings.getCustomer()==this)
            this.meetings=meetings;
        //TODO: else - exception
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getResidence() {
        return residence;
    }

    public void setResidence(Address residence) {
        this.residence = residence;
    }

    public Person getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(Person contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", residence=" + residence +
                ", contactPerson=" + contactPerson +
                ", notes='" + notes + '\'' +
                ", meetings=" + meetings +
                '}';
    }
}
