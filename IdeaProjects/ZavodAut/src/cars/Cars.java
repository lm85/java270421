/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;


public class Cars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    TimeSpan t1 = new TimeSpan();
    TimeSpan t2 = new TimeSpan();

    t1.add(484849);
    t2.add(484554);


    t1.equals(t2);

    System.out.println(t1.getHour());
    System.out.println(t1.getMinute());
    System.out.println(t1.getSecond());

    
    //System.out.println(t2.getClass());
    
    
    }
    
}
