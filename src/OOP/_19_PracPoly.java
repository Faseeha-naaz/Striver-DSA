package OOP;
//problem: payment system -> polymorphism + decision-making
public class _19_PracPoly {
    static void processPayment(Payment2 p, double amount){
        p.pay(amount);
    }
    public static void main(String[] args) {
        processPayment(new CreditCard1(), 500);
        processPayment(new UPI1(), 300);
        processPayment(new NetBanking(), 700);
    }
}
interface Payment2{
    void pay(double amount);
}
class CreditCard1 implements Payment2{
    public void pay(double amount){
        System.out.println("Paid using credit card "+amount);
    }
}
class UPI1 implements Payment2{
    public void pay(double amount){
        System.out.println("Paid using UPI "+amount);
    }
}
class NetBanking implements Payment2{
    public void pay(double amount){
        System.out.println("Paid using NetBanking "+amount);
    }
}