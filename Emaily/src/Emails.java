import java.util.*;

public class Emails {

    private Set<String> emails = new HashSet<String>();
    private String company;

    public Emails(String company) {
        this.company=company;

    }


    public void addName(String surname) {

        if (!this.emails.contains(surname)) {
            this.emails.add(surname);

        }else {

            searchLast(surname);

        }

    }

    private String searchLast(String surname) {//např. Novak3



    }

    private String iterName(String surname) {//např. z Novak3 Novak4



    }

}
