package lab2._9;

import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        int[] numbers = new int[52];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 10) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 5; j++) {
                    int randomIndex = random.nextInt(numbers.length);
                    int selectedNumber = numbers[randomIndex];
                    System.out.print(selectedNumber + " ");
                    // Удаляем выбранное число из массива
                    numbers = removeElement(numbers, randomIndex);
                };
                System.out.println("\n");
            }
        }
        else {
            System.out.println("Столько карт в колоде нет");
        }
    }
    public static int[] removeElement(int[] arr, int index) {
        if (index >= 0 && index < arr.length) {
            int[] newArray = new int[arr.length - 1];
            System.arraycopy(arr, 0, newArray, 0, index);
            System.arraycopy(arr, index + 1, newArray, index, arr.length - index - 1);
            return newArray;
        } else {
            return arr;
        }
    }
}
