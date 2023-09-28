package lab3.format.shop;

import java.util.Scanner;

public class Purchase {
    Scanner sc = new Scanner(System.in);

    public Purchase(int choose, double[] price, String[] name){
        System.out.println("Choose in what forex you want to pay: ");
        String forex = sc.nextLine();
        double euro = 1.1;
        double usd = 1.0;
        switch (forex){
            case "usd":
                System.out.printf("You should pay %.2f$ for %s in usd", price[choose]* usd, name[choose]);
                break;

            case "euro":
                System.out.printf("You should pay %.2f€ for %s in euro", price[choose]* euro, name[choose]);
                break;
        }
    }
}
