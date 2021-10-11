import java.lang.reflect.Array;
import java.util.*;

public class Emails {

  /*  private Set<String> emailsList = new HashSet<String>();//TODO: předělat do mapy
    private ArrayList<Email> emails = new ArrayList<Email>();//TODO: předělat do mapy
*/
    private Map<String, Email> emails = new TreeMap<>();

    private String company;

    public Emails(String company) {
        this.company=company;

    }


    public void addName(String surname) {

        Email name = searchLast(surname);

        if (name==null) {//new a add
            Email e =new Email(surname);
            this.emails.put(surname,e);



        }else {//jen add


            this.emails.get(surname).inc();

        }


    }

    private Email searchLast(String surname) {//např. Novak3

        return this.emails.get(surname);


    }

    public void importNames(String[][] surnames) {

        for (int i=0;i<surnames.length;i++) {

            //System.out.println(surnames[i][0]);
            this.addName(surnames[i][0]);

        }


    }

    @Override
    public String toString() {
        return "Emails{" +
                "emailsList=" + emails+
                '}';
    }



}
