package ProgrammingBasicsExam21February2016;

import java.util.Scanner;

public class P01HungryGarfield {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double garfieldMoney = Double.parseDouble(scanner.nextLine());
        double dollarsExchangeRate = Double.parseDouble(scanner.nextLine());
        double pizzaPrice = Double.parseDouble(scanner.nextLine());
        double lasagnaPrice = Double.parseDouble(scanner.nextLine());
        double sandwichPrice = Double.parseDouble(scanner.nextLine());
        long pizzaQuantity = scanner.nextLong();
        long lasagnaQuantity = scanner.nextLong();
        long sandwichQuantity = scanner.nextLong();

        double totalPrice = (pizzaPrice * pizzaQuantity + lasagnaPrice * lasagnaQuantity +
                sandwichPrice * sandwichQuantity) / dollarsExchangeRate;
        if (garfieldMoney >= totalPrice) {
            System.out.printf("Garfield is well fed, John is awesome. Money left: $%.2f.", Math.abs(garfieldMoney - totalPrice));
        } else {
            System.out.printf("Garfield is hungry. John is a badass. Money needed: $%.2f.", Math.abs(garfieldMoney - totalPrice));
        }
    }
}
