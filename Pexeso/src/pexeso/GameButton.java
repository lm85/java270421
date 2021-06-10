/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pexeso;

import javax.swing.JButton;

/**
 *
 * @author lmasic
 */
public class GameButton extends JButton {

    private String symbol = "";
    private int index = -1;
    static int CoutTurnedCard = 0;
    static int[] turnedCard = new int[2];

    public GameButton(int index) {
        super();
        this.index = index;

    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public boolean turnCard() {

        if (super.getText().equals("PEXESO")) {
            if (CoutTurnedCard == 2) {
                
                return true;
            }

            super.setText(symbol);

            CoutTurnedCard++;
        } else {

            super.setText("PEXESO");
            CoutTurnedCard--;
        }
        return false;
    }
}
