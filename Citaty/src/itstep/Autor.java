package itstep;

import java.util.ArrayList;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class Autor implements Comparable{
    private String name;
    private SortedSet<String> quotes = new TreeSet<String>();

    public Autor(String name) {

        this.name=name;

    }

    public Autor(String name,String quote) {

        this.name=name;
        this.addQuote(quote);

    }

    public SortedSet<String> getQuotes() {
        return quotes;
    }

    public int getCountQuotes() {
        return this.quotes.size();
    }

    public String getName() {
        return name;
    }

    public void addQuote(String quote) {
        this.quotes.add(quote);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        final boolean equals = Objects.equals(name, autor.name);
        return equals;
    }

    @Override
    public int hashCode() {
        final int hash = Objects.hash(this.name);
        return hash;

    }

    @Override
    public int compareTo(Object o) {
        if (this.equals(o)==true) {

            return 0;
        }
        else return 1;
    }
}
