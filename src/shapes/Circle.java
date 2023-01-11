package shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        //Math.PI * Math.pow(this.radius, 2)
        return Math.PI * (radius * radius);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return "Circle{\n" +
                "Radius= " + this.radius + '\n' + "Area= " + this.getArea() + '\n' + "Circumference=" + this.getCircumference() +
                "\n}";
    }
}
