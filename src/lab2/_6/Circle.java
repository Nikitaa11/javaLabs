package lab2._6;

public class Circle {
    private double Radius1 = 0.0;
    private double Radius2 = 0.0;

    public Circle(double Radius1, double Radius2){
        this.Radius1 = Radius1;
        this.Radius2 = Radius2;
    }
    public void compare(double Radius1, double Radius2){
        this.Radius1 = Radius1;
        this.Radius2 = Radius2;
    }

    public String Square() {
        return "Radius 1/2: " + Math.PI*Radius1 * Radius1 + ", " + Math.PI*Radius2 * Radius2;
    }

    public String Long() {
        return "Sum 1/2: " + Math.PI*Radius1 + ", " + Math.PI*Radius2;
    }
}
