
import java.util.Scanner;

public class Practice {
//    visibility (static) returnType methodName (paramType1 param 1, paramType2 param 2)

        public static void main(String s[])
        {
            People people = new People();
            play();

// It is necessary to call the other class with proper calling import techniques
//            Example bellow Check people class
            people.lastName = "Salinas";
            System.out.println(people.lastName);

            people.firstName = "Nestor";
            System.out.println(people.firstName);

            People people2 = new People();

            people2.lastName = "Reyes";
            System.out.println(people2.lastName);

            people2.firstName = "Diego";
            System.out.println(people2.firstName);

//            play();
//            print(8);
//            print(20 < 10);
//            dog();
        }

        static void play()
        {
        String userMiddle;
        Scanner us = new Scanner(System.in);

        System.out.println("Como le podria servir?");
        userMiddle = us.nextLine();


            do {
                if (userMiddle.contains("?")){
                    System.out.println("Su pregunta e");

                } else if (userMiddle.contains("!")){
                    System.out.printf("WOW! I am glad machines will take your jobs!");
                }
            } while (true);
        }

//        static void createCharacters(){
//            System.out.println("who");
//            String firstCharacter;
//            S
//        }

        static void print(int i)
        {
            System.out.println("Called print with int parameter");
        }

        static void print(boolean b)
        {
            System.out.println("Called print with boolean parameter");
        }
        static void dog(){
            System.out.println("You're awesome! ");
        }




//
//        // instance variables
//        //
//        public String firstName;
//        public String lastName;
//        // instance method
//        public String sayHello() {
//            return lastName + ", " + firstName + " says hi!";
//        }


}

