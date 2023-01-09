package shapes;

import java.lang.Math;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{\n" +
                "Radius= " + this.radius + '\n' + "Area= " + this.getArea() + '\n' + "Circumference=" + this.getCircumference() +
                "\n}";
    }
}
