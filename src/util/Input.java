package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input(){
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }
    public String getString(){
        return this.sc.nextLine();
    }

//    public String getString(String prompt){
//        System.out.println(prompt);
//        return getString();
//    }

//    public boolean pressEnter() {
//        try
//        {
//            System.in.read();
//        }
//        catch(Exception e)
//        {}
//        return true;
//    }
//    public boolean pressEnter(String prompt) {
//        System.out.print(prompt);
//        return pressEnter();
//    }

    public boolean yesNo() {
        String input = this.sc.nextLine();
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }

//    public boolean yesNo(String prompt) {
//        System.out.print(prompt);
//        return yesNo();
//    }

//    public int getInt(int min, int max){
//
//    }
//    public int getInt()
//    public double getDouble(double min, double max)
//    public double getDouble()
//

}
