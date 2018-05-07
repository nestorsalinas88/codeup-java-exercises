package util;

public class InputTest {



    public static void main(String[] args) {


        Input scanner = new Input();
        System.out.println(scanner);

        // Binary Test
        // Integer Testing
        System.out.print("Input and a binary number: ");
        int userInt = scanner.getInt();
        System.out.println("Int Input: " + userInt);

        // Yes No Testing
        System.out.println("Input y/yes for true: ");
        boolean userYes = scanner.yesNo();
        System.out.println("Int Input: " + userYes);



        // Integer Testing
        System.out.println("Input and integer: ");
        userInt = scanner.getInt();
        System.out.println("Int Input: " + userInt);

        System.out.println("Input and integer between ");
        userInt = scanner.getInt(5, 10);
        System.out.println("Between Int Input: " + userInt);

//
//        userInt = scanner.getBinary("Input and integer (prompt)");
//        System.out.println("(prompt) Int Input: " + userInt);
//
//        userInt = scanner.getInt("Input an integer between (prompt)",5,10);
//        System.out.println(userInt);


        System.out.println("Give me a double! " + scanner.getDouble());
        System.out.println(scanner.getInt("Give me an int! "));
        System.out.println(scanner.getDouble(1.2, 10.7, "Give me a double!"));
        System.out.println(scanner.getInt(3, 13, "Give me an int!"));
        System.out.println(scanner.yesNo("Would you like to continue?"));
        scanner.getString();
        System.out.println(scanner.getString("Give me a string! "));

    }
}
