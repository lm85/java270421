package itstep;

public class Auto {
    private String znacka;
    private String model;
    private int najeto;
    private double spotreba;
    private double cena;
    public ServiceBook serviceBook;

    public Auto(String znacka, String model, int najeto, double spotreba, double cena) {

        this.znacka = znacka;
        this.model = model;
        this.najeto = najeto;
        this.spotreba = spotreba;
        this.cena = cena;
    }

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNajeto() {
        return najeto;
    }

    public void setNajeto(int najeto) {
        this.najeto = najeto;
    }

    public double getSpotreba() {
        return spotreba;
    }

    public void setSpotreba(double spotreba) {
        this.spotreba = spotreba;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public ServiceBook getServiceBook() {
        return serviceBook;
    }

    public void setServiceBook(ServiceBook serviceBook) {
        if (this.serviceBook==null)
            this.serviceBook = serviceBook;
    }

    @Override
    public String toString() {
        return "Auto [znacka=" + znacka + ", model=" + model + ", najeto=" + najeto + ", spotreba=" + spotreba
                + ", cena=" + cena /*+ ", serviceBook=" + serviceBook + "]"*/;
    }



}

