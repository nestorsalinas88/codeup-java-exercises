import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("add: 3 + 4 = " + add(3,4));
        System.out.println("subtract: 5 - 2 = " + subtract(5,2));
        System.out.println("multiply: 2 * 2 = " + multiply(2,2));
        System.out.println("divide: 6 / 3 = " + divide(6,3));
        System.out.println("modulus: 6 % 3 = " + modulus(6,3));
        System.out.println("Multiply (hard): 3 * 3 = " + multiplyMore(3,3));
        System.out.println(hey(5,3));
//        count(5);

//        calling method to allow user to enter a number between 1 - 10
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter a number between 1 and 10: ");
        int input = sc.nextInt();
        getInteger(1,10, input);

//        calling  method to get number and create a factorial up to that number

        System.out.println("For factorial please a number from 1-10: ");
        int factInt = sc.nextInt();
        getFactorial(factInt);

        System.out.println(" ");
        System.out.println("Please enter the number of sides on a pair of dice: ");
        int sides = sc.nextInt();
        diceRoll(sides);



    }

    public  static int add(int a, int b){
    return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }
    public  static float divide(int a, int b){
        return (float) a / b;
    }
    public static int modulus(int a, int b){
        return a % b;
    }
    public static int multiplyMore(int a, int b){
        int mult = a;
        for (int i = 1; i < b; i++){
            mult += a;
        }
        return mult;
    }

    public static int hey(int n, int m) {
        if(m == 0){
        return 0;
        }
        if (m == 4){
        return n;

        }
        return m + hey(n,m + 1);


    }


    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }


//    ublic static int hey(int n, int m) {
//        if(m == 0){
//            return 0;
//        }
//        if (m == 4){
//            return n;
//
//        }
//        return m + hey(n,m + 1);
//
//
//    }
    public static int getInteger(int min, int max, int x){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        if (x >= min && x <= max){
            System.out.println("That number you entered is: " + x);
            return x;
        }

        System.out.print("That is not a valid number! Please enter an integer");
        int input = sc.nextInt();
        getInteger(1, 10, input);
        return x;


    }
//
    public static long getFactorial(int number) {

        String multiplyString = "! = 1 ";
        int total = 1;

        System.out.println("1"+ multiplyString + " = " + total);

        for(int i = 2; i <= number; i++) {

            total = total*i;
            multiplyString += "x "+ i + " ";
            System.out.println(i + multiplyString + " = " + total);

        }

        return (long) total;
    }
    public static long diceRoll(int sides){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        long randOne = Math.round(Math.random() * sides) + 1;
        System.out.println("First dice rolls " + randOne);
        double randTwo = Math.round(Math.random() * sides) + 1;
        System.out.println("Second dice rolls" + randTwo);
        System.out.println("Would you like to roll again? Yes/No");
        String confirm = sc.next();
        if(confirm.equals("Yes") || confirm.equals("yes")){
            diceRoll(sides);
        }
        return sides;

    }






}
