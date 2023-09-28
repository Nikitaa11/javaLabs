package lab2._3;

public class Circle {
    private final double radius;

    private final Point point;


    public Circle(Point point, double radius) {
        this.radius = radius;
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public double getRadius(){
        return radius;
    }
}
