package shapes;

public class Square extends Quadrilateral {


    public Square(int side) {
        super(side, side);
    }

    @Override
    void setLength(int input) {
        setWidth(input);
        setLength(input);
    }

    @Override
    void setWidth(int input) {
        setWidth(input);
        setLength(input);
    }

    @Override
    public int getPerimeter() {
        return getWidth() * 4;
    }

    @Override
    public int getArea() {
        return getLength() * getWidth();
    }

    //
//    protected int side;
//
//    public Square(int side){
//        super(side);
//        this.side = side;
//    }
//
//    public double getArea(){
//      return this.side * this.side;
//    }
//    public double getPerimeter(){
//      return this.side * 4;
//    }



}
