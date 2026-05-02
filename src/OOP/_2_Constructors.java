package OOP;

public class _2_Constructors {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 234);
        Car c2 = new Car("AUDI", 120);
        c1.display();
        c2.display();
        System.out.println(c1.isFast());   //true
        System.out.println(c2.isFast());   //false
    }
}
class Car{
    String brand;
    int speed;
    Car(String brand, int speed){
        this.brand = brand;
        this.speed = speed;   //current
    }
    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed);
        System.out.println();
    }
    boolean isFast(){
        return speed > 150;      //decision making
    }
}
