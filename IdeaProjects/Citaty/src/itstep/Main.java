package itstep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        //https://www.itnetwork.cz/java/soubory/java-tutorial-prace-se-soubory-txt/
        Scanner scan;
        try (FileInputStream in = new FileInputStream("d:\\Downloads\\quotes7.csv")) {
            scan = new Scanner(in);
            SortedSet<Autor> ts = new TreeSet<Autor>();//https://www.geeksforgeeks.org/sortedset-java-examples/


            while (scan.hasNext()) {
                String[] line = scan.nextLine().split(";");

                Autor autor= new Autor(line[1],line[0]);
                ts.add(autor);
            }
        } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
            e.printStackTrace();
        }


        //fulltext
       /* String fulltext ="Churchil";

        Iterator<Autor> i = ts.iterator();
        while (i.hasNext()) {
            String name= i.next().getName();

            Iterator<Autor> a = i.
            while (i.hasNext()) {
                System.out.println(i.next());
            }
        }*/


    }



        }

