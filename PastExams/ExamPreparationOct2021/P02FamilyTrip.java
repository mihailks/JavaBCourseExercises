package ExamPreparationOct2021;

import java.util.Scanner;

public class P02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int expenses = Integer.parseInt(scanner.nextLine());
        double totalPrice;

        if (nights <= 7) {
            totalPrice = pricePerNight * nights;
        } else {
            totalPrice = pricePerNight * nights * 0.95;
        }
        budget-=budget*expenses/100;

        if (totalPrice <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", Math.abs(budget - totalPrice));
        } else {
            System.out.printf("%.2f leva needed.", Math.abs(budget - totalPrice));
        }


    }
}
