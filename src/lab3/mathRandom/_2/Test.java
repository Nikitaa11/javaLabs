package lab3.mathRandom._2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        ArrayList<Circle> array = new ArrayList<>();


        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of circles: ");
        int size = sc.nextInt();

        for (int i = 0;i < size; i++) {
            double x = Math.random() * 10 ;
            double y = Math.random() * 10;
            double radius = Math.random() * 20;
            double circleLong = 0;

            Point point = new Point(x, y);

            Circle circle = new Circle(radius, point, circleLong);

            array.add(circle);
        }

        for (Circle circle : array) {
            System.out.printf("centre (x = %.2f, y = %.2f), radius = %.2f, length = %.2f", circle.getPoint().getX(), circle.getPoint().getY(), circle.getRadius(), circle.getCircleLong());
            System.out.println();
        }


        array.sort(Comparator.comparing(Circle::getCircleLong));
        System.out.println();
        System.out.println();
        System.out.printf("max (%.2f)", Collections.max(array, Comparator.comparing(Circle::getCircleLong)).getCircleLong());
        System.out.println();
        System.out.printf("min (%.2f)", Collections.min(array, Comparator.comparing(Circle::getCircleLong)).getCircleLong());
    }
}
