package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5,4);

        System.out.println("get area: " + box1.getArea());
        System.out.println("perimeter is: " + box1.getPerimeter());


        Square box2 = new Square(5);

        System.out.println("Box2 area is: " + box2.getArea());
        System.out.println("Box 2 perimeter is: " + box2.getPerimeter());




    }
}
