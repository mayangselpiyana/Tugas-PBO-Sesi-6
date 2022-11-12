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
