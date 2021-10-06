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

        String name = searchLast(surname);

        if (name==null) {//new a add




        }else {//jen add

            this.emailsList.add(name);

        }


    }

    private String searchLast(String surname) {//např. Novak3

        for (Email e:this.emails) {
            if (e.getName().equals(surname))
                return e.getLastInc(surname);
        }

        return null;
    }



}
