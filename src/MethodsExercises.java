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
        count(5);
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

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        int input;

    do {
        System.out.print("Enter a number between" + min + " and " + max);
        input = sc.nextInt();
    } while (input < min || input > max);

    return input;
    }


}
