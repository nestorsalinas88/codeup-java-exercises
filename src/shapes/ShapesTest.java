package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable box1 = new Rectangle(5,4);

        System.out.println("get area: " + box1.getArea());
        System.out.println("perimeter is: " + box1.getPerimeter());


        Measurable box2 = new Square(5);

        System.out.println("Box2 area is: " + box2.getArea());
        System.out.println("Box 2 perimeter is: " + box2.getPerimeter());


////////////////   NOTES THAT BELONGS IN MAIN METHOD    /////////////////////


//    //        implicit casting
////        converting lower type data into higher type data
//    int height = 6;
//    double mass = 220.2345;
//
//    double result = height - mass;
//
//        System.out.println("this is implicit :" + result);
//
//
//
////        explicit casting
////        converting higher data types into lower data types
//
//    int j = 100;
//    byte b;
//
//    b = (byte)j;
//        System.out.println("explicit " + b);
//
//
//}



    }
}
