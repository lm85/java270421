/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lode;
/**
 *
 * @author masic
 */
public class ShipFactory {
    private int MaxCount;
    private int MaxCountCruiser=0;
    private int CountCruiser=0;
    
    ShipFactory(int count) {
        this.MaxCount=count;  
        
        //if...
        MaxCountCruiser=2;
 
    }
    
    public Cruiser createCruiser() throws Exception{
    
    if (MaxCountCruiser<2)  
        return new Cruiser();
    else
        throw new Exception("MaxCountCruiser is "+MaxCountCruiser);
        
    }
    
}
