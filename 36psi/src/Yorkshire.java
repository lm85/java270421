/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lmasic
 */
public class Yorkshire extends Dog{
    private String vyraz;
    private int pocetMasli;

    public Yorkshire(String vyraz, int pocetMasli,
            String name, int vek, String majitel) {
        super(name, vek, majitel);
        this.vyraz = vyraz;
        this.pocetMasli = pocetMasli;
    }

    public String getVyraz() {
        return vyraz;
    }

    public int getPocetMasli() {
        return pocetMasli;
    }

    public String getName() {
        return name;
    }

    public int getVek() {
        return vek;
    }

    public String getPohlavi() {
        return pohlavi;
    }
    
    
    
}
