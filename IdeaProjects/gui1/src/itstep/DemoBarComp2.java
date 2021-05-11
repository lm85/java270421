/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itstep;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author lmasic
 */
public class DemoBarComp2 {
    void start() {
        JFrame frame = new JFrame("Demo Progress Bar of the Computation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(480, 240));

        MyBarPanel myBarPanel = new MyBarPanel();

        frame.getContentPane().add(myBarPanel);
        frame.pack();
        frame.setVisible(true);

        Model comp = new Model();
        myBarPanel.setComputation(comp);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          DemoBarComp2 demo = new DemoBarComp2();
        demo.start();
    }
    
}
