package OOP;

public class _23_PracMixed {
    public static void main(String[] args) {
        //problem: Online shopping cart system
        //Encapsulation, Inheritance, Polymorphism, Interfaces
        Product p1 = new Product("Phone", 10000);
        Product p2 = new Product("Headset", 20000);
        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.checkout(new CreditCards());
        cart.checkout(new UPI2());
    }
}
interface Payments{
    void pay(double amount);
}
class CreditCards implements Payments{
    public void pay(double amount){
        System.out.println("Paid using credit card: " +amount);
    }
}
class UPI2 implements Payments{
    public void pay(double amount){
        System.out.println("Paid using upi:" +amount);
    }
}
class Product{
    String name;
    double price;
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }
}
class Cart{
    double totalAmount = 0;
    void addProduct(Product p){
        totalAmount = totalAmount + p.price;
        System.out.println(p.name + " added to cart");
    }
    void checkout(Payments p){
        p.pay(totalAmount);
    }
}