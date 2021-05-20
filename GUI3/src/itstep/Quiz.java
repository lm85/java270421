package itstep;

import java.util.ArrayList;

public class Quiz {

    public static String file;

    private static ArrayList<ArrayList<String>> questions = new ArrayList<ArrayList<String>>();

    public static void loadfile() {
        //TOOD načíst soubor do questions;
        ArrayList<String> q = new ArrayList<String>();

        q.add(".");
        q.add("False");
        q.add("true");
        q.add(" ");

        questions.add(q);

    }


    public static ArrayList<String> getAswer(int i) {

        return questions.get(i);

    }



}
