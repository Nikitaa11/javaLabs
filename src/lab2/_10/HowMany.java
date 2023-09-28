package lab2._10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] arr = text.split(" ");
        System.out.println(arr.length);
    }
}
