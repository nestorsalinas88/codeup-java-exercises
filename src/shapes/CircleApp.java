package shapes;

import util.Input;

public class CircleApp {
    private static int circleCount;

    static int getCircleCount(){
        return circleCount;
    }

    static void increaseCircleCount(){
        circleCount++;
    }

    static void makeCircle(){
        System.out.println("What is the radius?");
        Input input = new Input();
        double userRadius = input.getDouble();


        Circle userCircle = new Circle(userRadius);
        System.out.println("The radius was" + userRadius);
        System.out.println("Area: " + userCircle.getArea());
        System.out.println("Circumference: " + userCircle.getCircumference());
        increaseCircleCount();
        System.out.println("Do you want to continue? ");
        boolean toContinue = input.yesNo();
        if (toContinue) {
            makeCircle();
        } else {
            System.out.println("As you wish, you have made " + getCircleCount() + "!");
        }
    }

    static void createCircle(){
        System.out.println("enter another radius?");
        Input input = new Input();
        double userRadius = input.getDouble();

        Circle userCircle = new Circle(userRadius);
        System.out.println("This user radius' was " + userRadius);
        System.out.println("Area: " + userCircle.getArea());
        System.out.println("Circumference: " + userCircle.getCircumference());
        increaseCircleCount();
        System.out.println("Would you like to make another? ");
    }


    public static void main(String[] args) {
        makeCircle();
        createCircle();
    }
}
