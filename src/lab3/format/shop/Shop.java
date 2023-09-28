package lab3.format.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = {"cheese", "coffee", "potato", "tomato", "bread", "beer", "vodka", "sugar", "sausage", "milk", "cola", "chocolate"};
        double[] price = {12.99, 7.99, 5.99, 7.99, 2.99, 3.99, 5.99, 0.99, 1.99, 1.5, 1.99, 0.99};
        ArrayList<Catalog> videoCards = new ArrayList<>();

        for(int i = 0; i < 12; i++){
            Catalog catalog = new Catalog(i, name[i], price[i]);
            videoCards.add(catalog);
        }

        for (Catalog catalog : videoCards) {
            System.out.format("%-2d %-23s  price: %.2f \n", catalog.getNumberInList(), catalog.getName(), catalog.getPrice());
        }

        System.out.println("Enter number of graphics card in catalog: ");
        int choose = sc.nextInt() - 1;
        new Purchase(choose, price, name);
    }
}
