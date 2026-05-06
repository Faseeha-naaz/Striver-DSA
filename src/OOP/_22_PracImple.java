package OOP;

public class _22_PracImple {
    public static void main(String[] args) {
        //problem -> online payment + notification system
        Payment3 p = new OnlinePayment();
        p.pay(500);
        Notification n = new OnlinePayment();
        n.sendNotification("You have paid successfully");
    }
}
interface Payment3{
    void pay(double amount);
}
interface Notification{
    void sendNotification(String message);
}
class OnlinePayment implements Payment3,Notification{
    public void pay(double amount){
        System.out.println("Amount: "+amount);
    }
    public void sendNotification(String message){
        System.out.println(message);
    }
}
