package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in).useDelimiter("\n");
    }
    public String getString() {
        return this.scanner.nextLine();
    }


    public boolean yesNo() {
        String input = scanner.nextLine();

//        This Method should return true if the user enters y, yes, or variants thereof, and false otherwise.
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max) {
        System.out.print("Please input a number between " + min + " and "+ max + ": ");

        int userInt = this.getInt();

        return (userInt > max || userInt < min) ? getInt(min, max) : userInt;

    }

    public int getInt(String prompt, int min, int max) {
        System.out.print(prompt);
        int userInt = this.getInt();

        return (userInt > max || userInt < min) ? getInt(prompt, min, max) : userInt;
    }

    public int getInt(int prompt) {
        System.out.print(prompt);
        return getInt();
    }

    //Validate int input
    public int getInt() {
        try {
            String inputInt  = this.scanner.nextLine();
            return Integer.valueOf(inputInt);
        } catch(NumberFormatException e) {
            System.out.println("Try again. Fail. ");
            return getInt();
        }
    }
    public double getDouble(double min, double max) throws Exception {
//    The getDouble method should do the same thing, but with decimal numbers.
        System.out.print("Please enter any real number between " + min + " and " + max + ": ");
        double check = getDouble();
        if(check < min || check > max) {
            throw new Exception(String.valueOf(getDouble(min, max)));
        } else {
            return check;
        }
    }

    public boolean pressEnter() {
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
        return true;
    }
    public boolean pressEnter(String prompt) {
        System.out.print(prompt);
        return pressEnter();
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
    public double getDouble(double min, double max, String prompt) throws Exception {
        System.out.println(prompt);
        return getDouble(min, max);
    }
    public double getDouble(String prompt){
        System.out.print(prompt);
        return getDouble();
    }


    public int getBinary(String prompt) {
        System.out.print(prompt);
        return getBinary();
    }

    public int getBinary() {
        try {
            String input = this.scanner.next();
            return Integer.valueOf(input,2);
        } catch(NumberFormatException e) {
            return getBinary();
        }
    }

}

