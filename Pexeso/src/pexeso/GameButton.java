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
public class GameButton extends JButton{
    private String symbol=null;

    public GameButton() {
    super();
            
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    
}
