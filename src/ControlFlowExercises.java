import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {




//
//
////        String fuzz = "fuzz", buzz = "buzz";
////        for(int i = 0; i <= 100; i++){
////            System.out.println(i);
////            if(i % 3 == 0){
////                System.out.println(fuzz + i);
////            }
////            if(i % 5 == 0){
////                System.out.println(buzz + i);
////            }
////            if(i % 15 == 0){
////                System.out.println(fuzz + buzz + i);
////            }
////        }
//
//        for(int i = 2; i <= 15; i++){
//            System.out.println("i is " + i);
//
//        }
//
//        for(int i = 0; i <= 10; i++)
//        {
//            System.out.println("i is " + i);
//
//        }
//
//        String buzz = "buzz", fizz = "fizz";
//
//        for(int i = 1; i <= 100; i++){
//
//            if (i % 15 == 0){
//                System.out.println(fizz + buzz);
//            } else if (i % 3 == 0){
//                System.out.println(fizz);
//            }else if(i % 5 == 0) {
//                System.out.println(buzz);
//            } else {
//                System.out.println(i);
//            }
//        }
//
//
//        int userInput;
//        Scanner lg = new Scanner(System.in);
//
//        System.out.println("Enter a number");
//        userInput = lg.nextInt();
//
//        System.out.println("Number\tCubed\tSquared");
////
////        System.out.println(userInput);
//
//        for (int i = 1; i <= userInput; i++){
//            int square = i * i;
//            int cubed = i * i * i;
//            System.out.println(i + "\t" + cubed + "\t" + square);
//
//        }

        Scanner sc = new Scanner(System.in);
        int userInt;
        String userContinue;
        boolean continueOn = true;

        do {

            System.out.print("Enter grade: ");
            userInt = sc.nextInt();

            System.out.print( gradeToString(userInt) + "\n");

            System.out.print("Type Y or y to continue: ");
            userContinue = sc.next();

            if(!userContinue.contains("y") && !userContinue.contains("Y")) {
                continueOn = false;
            }

        } while (continueOn);

    }
//       long i = 2;
//       double square = Math.pow(i,i);
//       do{
//
//          System.out.println(i);
//           i *= i;
//       } while(i <= 65536);


//    int grade = number.nextInt();
//        if (grade >= 99){
//        System.out.println("A+");
//    }
//        if( grade < 99 && grade >= 88){
//        System.out.println("A");
//    }
//        if (grade > 80 && grade <= 87){
//        System.out.println("b");
//    }
//        if (grade > 67 && grade <= 79){
//        System.out.println("C");
//    }
//        if (grade > 60 && grade <= 66){
//        System.out.println("D");
//    }
//        if (grade > 0 && grade <= 59){
//        System.out.println("F");
//    }
//
//
//
//    Scanner sc = new Scanner(System.in);
//        System.out.println("Would you like to continue? [Y/N]");
//
//    String hey = sc.nextLine();
//
//    boolean yes = hey.equalsIgnoreCase("Y");
//    boolean no = hey.equalsIgnoreCase("N");
//
//        if (yes == true){
//        System.out.println( "Lets continue");
//    } else{
//        System.out.println( "Lets Stop then");
//    }

    private static String gradeToString(int number) {

        String grade = (number >= 100) ? "A+": "F";

        if (number >= 50 && number < 100) {

            String numberString = Integer.toString(number);

            switch (Character.getNumericValue(numberString.charAt(0))) {
                case 5:
                    grade = "F";
                    break;
                case 6:
                    grade = "D";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 9:
                    grade = "A";
                    break;

            }


            switch (Character.getNumericValue(numberString.charAt(1))) {
                case 0: case 1: case 2: case 3:
                    grade += "-";
                    break;
                case 7: case 8: case 9:
                    grade += "+";
                    break;


            }



        }


        return grade;
    }
}

