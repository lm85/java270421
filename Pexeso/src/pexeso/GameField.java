/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pexeso;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author lmasic
 */

public class GameField extends Thread{
   JFrame frame; 
    public GameField() {
    
        frame = new JFrame("Piškvorky");
        /* int r = Integer.parseInt(JOptionPane.showInputDialog(frame, "Jak mám být velké pole?"));
        if (r < 3) {
            r = 3;
        }*/
        int r=4;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(r*100+20, r*100+20));
       Container pane = frame.getContentPane();
        pane.setLayout(new GridLayout(r, r));

       GameButton[] buttons = new GameButton[r * r];
        
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new GameButton();
            buttons[i].setText("PEXESO");
            
            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   
                   
                    
                   
                }
            });

            pane.add(buttons[i]);
        }

        frame.setVisible(true);//Nutné pro zobrazení...
        start();
    }
    

   
}

