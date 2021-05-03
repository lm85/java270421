package itstep;
import java.util.Arrays;
public class ServiceBook {
    private final int maxLen;
    private String[] serviceRecords;
    private int count;
    private Auto car;


    public ServiceBook(Auto car) {
        this.car = car;
        this.maxLen=10;
        this.car.setServiceBook(this);
        this.serviceRecords = new String[this.maxLen];
    }

    public ServiceBook(Auto car,int maxLen) {
        this.car = car;
        this.maxLen=maxLen;
        this.car.setServiceBook(this);
        this.serviceRecords = new String[this.maxLen];
    }
    @Override
    public String toString() {
        return "ServiceBook:" + Arrays.toString(serviceRecords) ;
    }
    public void addRecord(String record) {
        if (this.count < this.maxLen) {
            this.serviceRecords[this.count] = record;
            this.count++;
        }
    }

    public String[] getServiceRecords() {
        return serviceRecords;
    }
    public void setServiceRecords(String[] serviceRecords) {
        this.serviceRecords = serviceRecords;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public Auto getCar() {
        return car;
    }


}
