package lab2._8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String element = sc.nextLine();
        while(!element.equals("end")){
            array.add(element);
            element = sc.nextLine();
        }

        System.out.println(array);

        array.sort(Collections.reverseOrder());

        System.out.println(array);
    }
}
