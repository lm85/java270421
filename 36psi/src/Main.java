/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author lmasic
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dog cokl = new Dog("Alík",3,"transka");
        
        System.out.println(cokl.getName());
        
        Yorkshire debie = 
                new Yorkshire("samiči",2,"Debžoň",12,
                "samička");
        
        System.out.println(debie.getName());
        
        
        
        
    }
    
}
