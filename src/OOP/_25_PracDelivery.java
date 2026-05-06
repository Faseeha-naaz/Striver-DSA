package OOP;

public class _25_PracDelivery {
    public static void main(String[] args) {
        //problem: Food delivery system
        OrderService service = new OrderService();
        service.placeOrder(new Zomato(), "Biryani");
        service.placeOrder(new Swiggy(), "Coke");
    }
}
interface Food{
    void deliver(String item);
}
class Zomato implements Food{
    public void deliver(String item){
        System.out.println("Order placed via Zomato for "+item);
    }
}
class Swiggy implements Food{
    public void deliver(String item){
        System.out.println("Order placed via swiggy for "+item);
    }
}
class OrderService{
    void placeOrder(Food f, String item){
        f.deliver(item);
    }
}