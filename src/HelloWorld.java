import java.sql.SQLOutput;

public class HelloWorld {
    public static void main(String[] args)
    {
//        System.out.print("Hello," );
//        System.out.print("World!");
//        System.out.print("You Should indent your code");
//        System.out.print("with four spaces");

//        int myFavoriteNumber = 5;
//        String myString = 3.14159;
//        System.out.print(myString);


        float myNumber = 3.14F;
        System.out.println(myNumber);


//  Will add after prints out the same value
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
////

//  Will add before print
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);


//  Assignment operators
        int y = 4;
        y = y + 5;

//  Shorthand assignment operators
        int x = 4;
        x += 5;
        System.out.println(x);


//  Assigning operators
//        int x = 3;
//        int y = 4;
//        y = y * x;
//
////  Shorthand assignments operations
//        int x = 3;

//        explicit casting
        double pi = 3.14;

//        treat the variable on the right of the (int) as an int
        int almostPi = (int) pi;

//        implicit casting is also called widening conversion
        short favoriteNumber = 23;

        double someNumber = favoriteNumber;
        System.out.println(someNumber);

//        sout is a keyboard shortcut for System.out.print

    }
}



