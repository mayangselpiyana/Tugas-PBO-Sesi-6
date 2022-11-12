/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Restu
 */
public class LaptopUser {
    private Laptop laptop;

    public LaptopUser(Laptop laptop) {
        this.laptop = laptop;
    }
    
    void turnOnTheLaptop(){
        this.laptop.powerOn();
    }
    
    void turnOffTheLaptop(){
        this.laptop.powerOff();
    }
    
    void makeLaptopLouder(){
        this.laptop.volumeUp();
    }
    
    void makeLaptopSilent(){
        this.laptop.volumeDown();
    }
}
