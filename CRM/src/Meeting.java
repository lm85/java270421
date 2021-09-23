import java.sql.Time;
import java.util.Date;

public class Meeting implements Cloneable {

    private Date date;
    private Time time;
    private Address place;
    private String record;

    public Meeting(Date date, Time time, Address place) {
        this.date = date;
        this.time = time;
        this.place = place;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Address getPlace() {
        return place;
    }

    public void setPlace(Address place) {
        this.place = place;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "date=" + date +
                ", time=" + time +
                ", place=" + place +
                ", record='" + record + '\'' +
                '}';
    }
}

