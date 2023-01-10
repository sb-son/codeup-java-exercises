package shapes;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
    }

    public double getPerimeter(){
        return 4 * super.getLength();
    }

    public double getArea(){
        return super.getLength() * super.getWidth();
    }
}
