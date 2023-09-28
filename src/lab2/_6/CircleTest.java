package lab2._6;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(0.0, 0.0);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X and Y: ");

        double Radius1 = sc.nextDouble();;
        double Radius2 = sc.nextDouble();;

        circle.compare(Radius1, Radius2);

        System.out.println(circle.Square());

        System.out.println(circle.Long());
    }
}
