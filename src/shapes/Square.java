package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    void setLength(double length) {
       this.length = length;
    }

    void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return 4 * length;
    }

    public double getArea() {
        return width * length;
    }


//    public Square(double side) {
//        super(side, side);
//    }
//
//    public double getPerimeter() {
//        return 4 * super.getLength();
//    }
//
//    public double getArea() {
//        return super.getLength() * super.getWidth();
//    }
}
