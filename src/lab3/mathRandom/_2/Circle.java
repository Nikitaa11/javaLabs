package lab3.mathRandom._2;

public class Circle {
    private final double radius;

    private final double circleLong;

    private final Point point;


    public Circle(double radius, Point point, double circleLong) {
        this.radius = radius;
        this.point = point;
        this.circleLong = 2 * Math.PI * radius;
    }

    public Point getPoint() {
        return point;
    }

    public double getRadius(){
        return radius;
    }

    public double getCircleLong(){
        return circleLong;
    }
}
