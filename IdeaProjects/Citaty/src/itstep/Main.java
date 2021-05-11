package itstep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream in = new FileInputStream("Quotes.csv");
        Scanner scan = new Scanner(in);
        SortedSet<Autor> ts = new TreeSet<Autor>();

        while (scan.hasNext()) {
            String[] line = scan.nextLine().split(";");

            Autor autor= new Autor(line[1],line[0]);
            ts.add(autor);


        }


        }
}
