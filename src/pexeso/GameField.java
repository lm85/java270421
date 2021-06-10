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
import java.util.Random;
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
    GameButton[] buttons;
    String[] symbols;
    

    public GameField() {

        frame = new JFrame("Piškvorky");
        /* int r = Integer.parseInt(JOptionPane.showInputDialog(frame, "Jak mám být velké pole?"));
        if (r < 3) {
            r = 3;
        }*/
        int r = 4;
        symbolsGen(r*r);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(r * 100 + 20, r * 100 + 20));
        Container pane = frame.getContentPane();
        pane.setLayout(new GridLayout(r, r));

        buttons = new GameButton[r * r];
        
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new GameButton(i);
            buttons[i].setText("PEXESO");
            buttons[i].setSymbol(symbols[i]);
            //buttons[i].setText(symbols[i]);    
            
            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    GameButton gb = (GameButton) e.getSource();

                            if (gb.turnCard()) {//hraje další hráč
                            
                            turnCards();
                                
                                
                            }
                            
                    
                }
            });

            pane.add(buttons[i]);
        }

        frame.setVisible(true);//Nutné pro zobrazení...
        start();
    }
    
    private void turnCards() {
        buttons[GameButton.getTurnedCard()[0]].setText("PEXESO");
        buttons[GameButton.getTurnedCard()[1]].setText("PEXESO");  
        
        buttons[0].cleanTurnedCards();
            }
    
    private void symbolsGen(int r) {
        
        symbols = new String[r];
         for (int i = 0; i < symbols.length/2; i++) {
            symbols[i]=Integer.toString(i+1);
            symbols[symbols.length-1-i]=Integer.toString(i+1);
                    }
         
         Random rand = new Random();
		
		for (int i = 0; i < symbols.length; i++) {
			int randomIndexToSwap = rand.nextInt(symbols.length);
			String temp = symbols[randomIndexToSwap];
			symbols[randomIndexToSwap] = symbols[i];
			symbols[i] = temp;
		}
         
         
    }

}
