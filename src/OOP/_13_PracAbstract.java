package OOP;

public class _13_PracAbstract {
    public static void main(String[] args) {
         //Problem: Shape system
        Shape1[] shapes = {new Circle1(2), new Rectangle1(2, 5)};
        for(Shape1 s: shapes){
            System.out.println(s.area());
        }
    }
}
abstract class Shape1{
    abstract double area();
}
class Circle1 extends Shape1{
    double radius;  //data inside constructor is always better
    Circle1(double radius){
        this.radius = radius;
    }
    double area(){
        return 3.14 * radius * radius;
    }
}
class Rectangle1 extends Shape1{
    double length;
    double breadth;
    Rectangle1(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double area(){
        return length * breadth;
    }
}