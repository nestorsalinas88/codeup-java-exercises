package shapes;

public class Rectangle extends Quadrilateral {

//    protected double length;
//    protected  double width;
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//
//
//    public double getArea(){
//        return length * width;
//    }
//
//    public  double getPerimeter(){
//        return (length * 2) + (width * 2);
//    }


    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    void setLength(int input) {
        setLength(input);
    }

    @Override
    void setWidth(int input) {
        setWidth(input);

    }

    @Override
    public double getPerimeter() {
        return getLength() * getWidth();
    }

    @Override
    public double getArea() {
        return (getLength()*2) + (getWidth()*2);
    }
}
