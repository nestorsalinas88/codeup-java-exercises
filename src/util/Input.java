package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in).useDelimiter("\n");
    }
    String getString() {
        return this.scanner.nextLine();
    }


    public boolean yesNo() {
        String input = scanner.nextLine();

//        This Method should return true if the user enters y, yes, or variants thereof, and false otherwise.
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

    int getInt(int min, int max) {
//  This method should keep prompting the user for input until they give an integer within the min and max.
        System.out.println("Enter an number between " + min + " and " + max + ": " );
        int check = getInt();
        if (check < min || check > max){
            return getInt(min, max);
        } else {
            return check;
        }
    }
    int getInt(){
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
//    The getDouble method should do the same thing, but with decimal numbers.
        System.out.print("Please enter any real number between " + min + " and " + max + ": ");
        double check = getDouble();
        if(check < min || check > max) {
            return getDouble(min, max);
        } else {
            return check;
        }
    }
    public double getDouble(){
        return scanner.nextDouble();
    }



    //With PROMPT parameter
    public String getString(String prompt) {
        System.out.print(prompt);
        return getString();
    }
    public Boolean yesNo(String prompt) {
        System.out.print(prompt);
        return yesNo();
    }
    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        return getInt(min, max);
    }
    public int getInt(String prompt){
        System.out.print(prompt);
        return getInt();
    }
    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        return getDouble(min, max);
    }
    public double getDouble(String prompt){
        System.out.print(prompt);
        return getDouble();
    }

}

