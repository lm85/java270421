package itstep;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {




        JFrame frame = new NewJFrame("Kvízovač");


            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setMinimumSize(new Dimension(480, 240));

            MyBarPanel myBarPanel = new MyBarPanel();

            frame.getContentPane().add(myBarPanel);
            frame.pack();
            frame.setLocationRelativeTo(null);//center
            frame.setVisible(true);





    }
}
