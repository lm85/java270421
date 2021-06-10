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
    private static int CoutTurnedCard = 0;
    private static int[] turnedCard = new int[2];

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

    public static int[] getTurnedCard() {
        return turnedCard;
    }

    public void cleanTurnedCards() {
        this.CoutTurnedCard = 0;
        this.getTurnedCard()[0] = 0;
        this.getTurnedCard()[1] = 0;
    }

    private void addIndex(int index) {

        if (turnedCard[0] == 0) {
            turnedCard[0] = index;
        } else {
            turnedCard[1] = index;
        }

    }

    public boolean turnCard() {

        if (CoutTurnedCard == 2) {

            return true;
        }

        this.addIndex(this.index);

        if (super.getText().equals("PEXESO")) {

            super.setText(symbol);

            CoutTurnedCard++;
            
        } else {

            super.setText("PEXESO");
            CoutTurnedCard--;
        }
        return false;
    }
}
