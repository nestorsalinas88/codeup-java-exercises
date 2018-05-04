package shapes;

import java.security.PublicKey;

public class Circle {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }
    double getArea(){
        return Math.PI * radius * radius;
    }
    double getCircumference(){
        return Math.PI * Math.pow(radius, 2);
    }
}
