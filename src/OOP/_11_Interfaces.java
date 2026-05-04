package OOP;

public class _11_Interfaces {
    public static void main(String[] args) {
        //Interface is used to define rules that classes must implement. It supports multiple inheritance.
        //use implements, Methods are public by default
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();
        p1.pay();
        p2.pay();
    }
}
interface Payment{
    void pay();
}
class CreditCard implements Payment{
    public void pay(){
        System.out.println("Pay using credit card");
    }
}
class UPI implements Payment{
    public void pay(){
        System.out.println("Pay using UPI");
    }
}