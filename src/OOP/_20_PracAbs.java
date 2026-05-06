package OOP;
//problem -> shape drawing system -> abstraction + polymorphism
public class _20_PracAbs {
    static void renderShape(Shape2 s){
        s.draw();
    }
    public static void main(String[] args) {
        renderShape(new Circle2());
        renderShape(new Square());
        renderShape(new Rectangle2());
    }
}
abstract class Shape2{
    abstract void draw();
}
class Circle2 extends Shape2{
    void draw(){
        System.out.println("Drawing circle");
    }
}
class Square extends Shape2{
    void draw(){
        System.out.println("Drawing square");
    }
}
class Rectangle2 extends Shape2{
    void draw(){
        System.out.println("Drawing rectangle");
    }
}
