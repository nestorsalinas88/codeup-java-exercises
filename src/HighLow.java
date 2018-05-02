import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        int randomNumber = roll(100);
        boolean matched = false;
        int guess;
        int i = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Guess my number dude! ");


        do {
            System.out.print("Guess > ");
            guess = sc.nextInt();

            if(guess < randomNumber){
                System.out.println("TOO LOW DUDE ");

            } else if (guess > randomNumber){
                System.out.println("Too high");
            } else  {
                System.out.println("You're good");
                System.out.println("Took you this many time : " + i );
                matched = true;
            }
            i++;
            if(i == 20){ matched = true;
                System.out.println("You suck");}
        } while (!matched);

    }
    public static int roll(int max){
        return (int)(Math.random() * max) + 1;
    }
}
