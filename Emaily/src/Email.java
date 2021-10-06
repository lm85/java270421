public class Email {

    private String name;//Novak
    private int inc; //3 = Novak, Novak2, Novak3

    public Email(String name) {
        this.name = name;
        this.inc=0;

    }

    @Override
    public boolean equals(Object o) {

        Email e = (Email) o;//TODO ošetřit

        return this.name.equals(e.name);


    }

    public String getLastInc() {

        if (this.inc==0) {
            this.inc=1;
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
        this.name = name;
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


}
