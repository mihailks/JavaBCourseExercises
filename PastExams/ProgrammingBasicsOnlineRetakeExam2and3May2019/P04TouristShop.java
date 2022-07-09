package ProgrammingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class P04TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String product = scanner.nextLine();
        int productCounter = 0;
        double moneyNeeded = 0;
        while (!product.equals("Stop")){
            double price = Double.parseDouble(scanner.nextLine());
            productCounter++;
            if (productCounter%3==0){
                price*=0.5;
            }
            moneyNeeded+=price;
            if (budget<moneyNeeded){
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!",moneyNeeded-budget);
                break;
            }
            product = scanner.nextLine();
        }
        if (product.equals("Stop")){
            System.out.printf("You bought %d products for %.2f leva.", productCounter, moneyNeeded);
        }
    }
}
