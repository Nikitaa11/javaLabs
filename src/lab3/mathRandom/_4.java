package lab3.mathRandom;

import java.util.ArrayList;
import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter size of array: ");
            n = sc.nextInt();
        }while(n <= 0);

        int[] array = new int[n];
        boolean check = false;

        for(int i = 0; i < array.length; i++) {
            array[i] = 1 + (int) (Math.random() * n);
        }
        ArrayList<Integer> mass = new ArrayList<>();

        for (int j : array) {
            if (j % 2 == 0) {
                mass.add(j);
                check = true;
            }
        }

        for(int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]" + " = " + array[i]);
        }

        if(check) {
            System.out.println("Even elements: ");
            System.out.println(mass.toString().replaceAll("[]\\[,]", ""));
        }else
            System.out.println("There are no even elements!");
    }
}
