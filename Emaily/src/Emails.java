import java.lang.reflect.Array;
import java.util.*;

public class Emails {

    private Set<String> emailsList = new HashSet<String>();//TODO: předělat do mapy
    private ArrayList<Email> emails = new ArrayList<Email>();//TODO: předělat do mapy
    private String company;

    public Emails(String company) {
        this.company=company;

    }


    public void addName(String surname) {

        Email name = searchLast(surname);

        if (name==null) {//new a add
            Email e =new Email(surname);
            this.emails.add(e);
            this.emailsList.add(e.getLastInc());


        }else {//jen add


            this.emailsList.add(name.getLastInc());
            this.emails.add(name);

        }


    }

    private Email searchLast(String surname) {//např. Novak3

        for (Email e:this.emails) {
            if (e.getName().equals(surname))
                return e;
        }

        return null;
    }

    public void import(ArrayList<String> surnames) {


    }

}
