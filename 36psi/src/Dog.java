/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lmasic
 */
public class Dog {
    protected String name;
    protected int vek;
    protected String pohlavi;

    public Dog(String name, int vek, String pohlavi) {
        this.name = name;
        this.vek = vek;
        this.pohlavi = pohlavi;
    }

    public String getName() {
        return name;
    }

    public int getVek() {
        return vek;
    }

  

    public void setName(String name) {
        this.name = name;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    
    
    
    
}
