package lab3.mathRandom;

import java.util.Arrays;
import java.util.Random;

public class _1 {
    public static void main(String[] args) {
        int size1 = 1 + (int) (Math.random() * 10);
        int[] random1 = new int[size1];

        System.out.println("Math: ");

        for (int i = 0; i < size1; i++){
            random1[i] = (int) (Math.random() * 100);
            System.out.print(random1[i] + " ");
        }
        Arrays.sort(random1);
        System.out.println();

        for (int n:
                random1) {
            System.out.print(n + " ");
        }



        System.out.println("\nRandom: ");

        Random rand = new Random();

        int size2 = 1 + rand.nextInt(10);
        int[] random2 = new int[size2];

        for (int i = 0; i < size2; i++){
            random2[i] = rand.nextInt(100);
            System.out.print(random2[i] + " ");
        }
        Arrays.sort(random2);
        System.out.println();

        for (int n:
                random2) {
            System.out.print(n + " ");
        }
    }
}
