package OOP;

//problem: Smart device system -----> abstraction + interface
//Abstract class = “what it is”, Interface = “what it can do”
public class _21_PracInterface {
    public static void main(String[] args) {
        SmartPhone p = new SmartPhone("Apple");
        SmartTv tv = new SmartTv("Sony");

        p.showBrand();
        p.turnOn();
        p.turnOff();

        tv.showBrand();
        tv.turnOn();
        tv.turnOff();
    }
}
interface RemoteControl{
    void turnOn();
    void turnOff();
}
abstract class Device{
    String brand;
    Device(String brand){
        this.brand = brand;
    }
    void showBrand(){
        System.out.println("Brand is: "+brand);
    }
}
class SmartPhone extends Device implements RemoteControl{
    SmartPhone(String brand) {
        super(brand);
    }
    public void turnOn(){
        System.out.println("Smartphone is ON");
    }
    public void turnOff(){
        System.out.println("Smartphone is OFF");
    }
}
class SmartTv extends Device implements RemoteControl{

    SmartTv(String brand) {
        super(brand);
    }
    public void turnOn(){
        System.out.println("SmartTv is ON");
    }
    public void turnOff(){
        System.out.println("SmartTv is OFF");
    }
}