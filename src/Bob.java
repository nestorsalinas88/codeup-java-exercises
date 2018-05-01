import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String message;
        String name = "bob";
        Scanner sc = new Scanner(System.in);

        boolean match;

        System.out.println("Sup dude? (type exit, to quit)");

        do {
            match = false;
            System.out.println("> ");
            message = sc.nextLine();

            if(message.contains("!")) {
                System.out.println("Whoa, chill out!");
                match = true;
            }


        } while (!message.contains("exit"));




    }
}
