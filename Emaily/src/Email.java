import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Locale;

public class Email {

    private String name;//Novak
    private int inc; //3 = Novak, Novak2, Novak3

    public Email(String name) {
        this.name = this.cleaner(name);
        this.inc=1;

    }

    private String cleaner (String s) {// https://stackoverflow.com/questions/15190656/easy-way-to-remove-accents-from-a-unicode-string


        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        s= s.toLowerCase(Locale.ROOT);


        return s;

    }


    @Override
    public boolean equals(Object o) {

        Email e = (Email) o;//TODO ošetřit

        return this.name.equals(e.name);


    }

    public String getLastInc() {

        if (this.inc==1) {

            return name;
        }
        else {this.inc++;
            return name+Integer.valueOf(this.inc);
        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = cleaner(name);
    }

    public int getInc() {
        return inc;
    }

    public void setInc(int inc) {
        this.inc = inc;
    }

    public void inc() {
        this.inc++;
    }


    public ArrayList<String> genEmails() {
        ArrayList<String> emails = new ArrayList<String>();

        emails.add(this.name);
        for (int i=2;i<=this.inc;i++) {

            emails.add(this.name+i);

        }
        return emails;
    }


    @Override
    public String toString() {//TODO - všechny varianty

        StringBuilder s =  new StringBuilder();

        s.append(this.name+",");

        for (int i=2;i<=this.inc;i++) {

            s.append(this.name+i+",");

        }

        return "Email{" +
                "emails='" + s +

                '}';
    }
}
