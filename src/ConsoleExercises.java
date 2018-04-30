import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

////      Exploring Int Scanner Class
//        int userInput;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Whats Your favorite number? ");
//        userInput = sc.nextInt();
//
//        System.out.println("Your favorite number is " + userInput + " YAY!");
//
////     Exploring String Scanner classes
//        String userName;
//        Scanner st = new Scanner(System.in);
//
//        System.out.println("Whats your first name?");
//        userName = st.nextLine();
//
//        String userMiddle;
//        Scanner us = new Scanner(System.in);
//
//        System.out.println("enter your middle name");
//        userMiddle = us.nextLine();
//
//        String nameLast;
//        Scanner last = new Scanner(System.in);
//
//        System.out.println("enter your last name");
//        nameLast = last.nextLine();
//
//
//        System.out.println(userName  + " " + userMiddle + " " + nameLast);
//
//      NextLine method
//        String greet;
//        Scanner hello = new Scanner(System.in);
//
//        System.out.println("Tell me about you?");
//        greet =  hello.nextLine();
//
//        System.out.println(greet);

//        Exploring Int Scanner Class


        float length;
        Scanner lg = new Scanner(System.in);

        System.out.println("What is the length of the room? ");
        length = lg.nextFloat();

        float width;
        Scanner wd = new Scanner(System.in);

        System.out.println("What is the width?");
        width = wd.nextFloat();

        float height;
        Scanner ht = new Scanner(System.in);

        System.out.println("What is the height?");
        height = ht.nextFloat();

        Scanner sc = new Scanner(System.in);
        System.out.println("What are you searching for? [A/V/P]");
        String userInput = sc.nextLine();

        boolean area = userInput.equalsIgnoreCase("A");
        boolean volume = userInput.equalsIgnoreCase("V");
        boolean per = userInput.equalsIgnoreCase("P");

        if (area == true){
            System.out.println( "The area is: " + length * width);
        }
        else if ( volume == true) {
            System.out.println("The volume is: " + (length * width * height));
        }
        else {

            System.out.println("The perimeter is: " + ((2 * length) + (2 * width)));


        }



    }
}
