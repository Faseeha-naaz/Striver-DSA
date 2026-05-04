package OOP;

public class _7_Hierarchical {
    public static void main(String[] args) {
        //one parent → multiple children
        //        Shape
        //       /      \
        //     Circle   Rectangle
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        c1.draw();
        c1.circleInfo();
        r1.draw();
        r1.rectangleInfo();
    }
}
class Shape{
    void draw(){
        System.out.println("Drawing shape");
    }
}
class Circle extends Shape{
    void circleInfo(){
        System.out.println("This is a circle");
    }
}
class Rectangle extends Shape{
    void rectangleInfo(){
        System.out.println("This is a rectangle");
    }
}