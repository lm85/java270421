package itstep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //https://www.itnetwork.cz/java/soubory/java-tutorial-prace-se-soubory-txt/
        Scanner scan;
        SortedSet<Autor> ts = new TreeSet<Autor>();//https://www.geeksforgeeks.org/sortedset-java-examples/
        try (FileInputStream in = new FileInputStream("d:\\Downloads\\quotes.csv")) {
            scan = new Scanner(in);

            while (scan.hasNext()) {
                String[] line = scan.nextLine().split(";");

                Autor autor = new Autor(line[1]);
                autor.addQuote(line[0]);
                ts.add(autor);

                if (ts.last().getName().equals(line[0]))
                {
                    ts.last().addQuote(line[0]);
                }

                else {
                    //TODO: Přidat citát k existujícímu autorovi

                }


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //fulltext
        String fulltext = "ilne";

        Iterator<Autor> i = ts.iterator();
        while (i.hasNext()) {
            Autor a = i.next();

            String name = a.getName();

            if (name.toLowerCase(Locale.ROOT).contains(fulltext.toLowerCase(Locale.ROOT)))
                System.out.println(name);

            Iterator<String> quotes = a.getQuotes().iterator();


            while (quotes.hasNext()) {
                String quote = quotes.next();

                if (quote.toLowerCase(Locale.ROOT).contains(fulltext.toLowerCase(Locale.ROOT)))
                    System.out.println(name+": "+quote);
            }
        }


    }


}

