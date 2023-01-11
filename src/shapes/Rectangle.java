package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    void setLength(double length) {
        this.length = length;
    }

    void setWidth(double width) {
        this.width = width;
    }
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public double getPerimeter(){
//        return (2 * length) + (2 * width);
//    }
//
//    public double getArea(){
//        return length * width;
//    }
}
