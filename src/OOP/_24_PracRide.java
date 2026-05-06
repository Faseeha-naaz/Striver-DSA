package OOP;

public class _24_PracRide {
    public static void main(String[] args) {
        //problem: Ride booking system -> like uber
        RideService r1 = new RideService();
        r1.startRide(new Car3(), 10);
        r1.startRide(new Bike1(), 10);
    }
}
interface Ride{
    void bookRide(double distance);
}
class Car3 implements Ride{
    public void bookRide(double distance){
        double fare = distance * 10;  //car rate
        System.out.println("Car ride booked. Fare is: "+fare);
    }
}
class Bike1 implements Ride{
    public void bookRide(double distance){
        double fare = distance * 5;  //bike rate
        System.out.println("Bike ride booked. Fare is: "+fare);
    }
}
class RideService{
    void startRide(Ride r, double distance){
        r.bookRide(distance);
    }
}