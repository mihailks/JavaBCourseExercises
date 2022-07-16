package ProgrammingBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class P06EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double basket = 1.5;
        double wreath = 3.80;
        double chocolateBunny = 7;
        int customers = Integer.parseInt(scanner.nextLine());

        int purchasesPerCustomer = 0;
        double billPerCustomer = 0;
        double shopMoney = 0;
        for (int i = 1; i <= customers; i++) {
            String input = scanner.nextLine();
            while (!input.equals("Finish")) {
                purchasesPerCustomer++;
                switch (input) {
                    case "basket":
                        billPerCustomer += basket;
                        break;
                    case "wreath":
                        billPerCustomer += wreath;
                        break;
                    case "chocolate bunny":
                        billPerCustomer += chocolateBunny;
                        break;
                }
                input = scanner.nextLine();
            }
            if (purchasesPerCustomer % 2 == 0) {
                billPerCustomer *= 0.8;
            }
            shopMoney += billPerCustomer;
            System.out.printf("You purchased %d items for %.2f leva.\n", purchasesPerCustomer, billPerCustomer);
            purchasesPerCustomer=0;
            billPerCustomer = 0;
        }
        System.out.printf("Average bill per client is: %.2f leva.", shopMoney / customers);
    }
}
