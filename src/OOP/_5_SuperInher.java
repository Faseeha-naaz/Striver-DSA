package OOP;

public class _5_SuperInher {
    public static void main(String[] args) {
        //example of inheritance using super keyword
        Car1 c1 = new Car1("BMW", 590);
        c1.displayCar();
    }
}
class Vehicle{
    String brand;
    //constructor
    Vehicle(String brand){   //If parent has only parameterized constructor, Child MUST call it using super(...)
        this.brand = brand;
    }
    //method
    void displayBrand(){
        System.out.println("Brand: "+brand);
    }
}
class Car1 extends Vehicle{
    int speed;
    //constructor
    Car1(String brand, int speed){
        super(brand);  //this calls parent constructor
        this.speed = speed;
    }
    //method
    void displayCar(){
        displayBrand();
        System.out.println("Speed: "+speed);
    }
}
