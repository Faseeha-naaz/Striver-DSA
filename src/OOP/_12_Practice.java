package OOP;

public class _12_Practice {
    public static void main(String[] args) {
        //problem: payment system
        Payment1 p1 = new Credit();
        Payment1 p2 = new Online();
        Payment1 p3 = new Cash();

        p1.pay(500);
        p2.pay(500);
        p3.pay(500);
    }
}
interface Payment1{
    void pay(double amount);
}
class Credit implements Payment1{
    public void pay(double amount){
        System.out.println("Paid " +(int)amount+" using credit card");
    }
}
class Online implements Payment1{
    public void pay(double amount){
        System.out.println("Paid " +(int)amount+ " using UPI");
    }
}
class Cash implements Payment1{
    public void pay(double amount){
        System.out.println("Paid " +(int)amount+" using cash");
    }
}