package lab2._4;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        ArrayList<String> roster = new ArrayList<String>();
        System.out.println("Enter the product in cash: ");
        Scanner sc = new Scanner(System.in);
        String position = sc.nextLine();
        while (!position.equals("end")){
            roster.add(position);
            position = sc.nextLine();
        }


        System.out.println(roster.toString().replaceAll("[]\\[,]", ""));


        System.out.println("What do you want?(add or delete)");

        String choose1 = sc.nextLine();

        if (choose1.equals("add")) {
            System.out.println("Enter the product in cash: ");
            position = sc.nextLine();
            roster.add(position);
            System.out.println(roster.toString().replaceAll("[]\\[,]", ""));

        } else if (choose1.equals("delete")) {
            String choose2;
            System.out.println("Select the finished product: " + roster.toString().replaceAll("[]\\[,]", ""));
            choose2 = sc.nextLine();
            roster.remove(choose2);
            System.out.println(roster.toString().replaceAll("[]\\[,]", ""));

        } else {
            System.out.println("Wrong choose!");
        }
    }
}
