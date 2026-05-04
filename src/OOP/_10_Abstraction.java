package OOP;

public class _10_Abstraction {
    public static void main(String[] args) {
        //Show what to do, Hide how it is done
        Vehicle1 v1 = new Car2();
        Vehicle1 v2 = new Bike();
        v1.start();
        v1.stop();
        v2.start();
        v2.stop();
    }
}
abstract class Vehicle1{
    //use abstract classes when classes share common code + behavior
    abstract void start();
    //no body for abstract methods
    void stop(){
        System.out.println("Vehicle stopped.");
    }
}
class Car2 extends Vehicle1{
    void start(){
        System.out.println("Car starts with key");
    }
}
class Bike extends Vehicle1{
    void start(){
        System.out.println("Bike starts with kick");
    }
}
