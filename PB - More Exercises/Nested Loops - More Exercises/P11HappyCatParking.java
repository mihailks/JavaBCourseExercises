package NestedLoopsMoreExercises;

import java.util.Scanner;

public class P11HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;
        double pricePerDay = 0.0;
        for (int i = 1; i <= days; i++) {
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0) {
                    if (j % 2 != 0) {
                        pricePerDay += 2.5;
                    } else pricePerDay += 1;
                } else {
                    if (j % 2 == 0) {
                        pricePerDay += 1.25;
                    } else {
                        pricePerDay += 1;
                    }
                }
            }
            totalPrice += pricePerDay;
            System.out.printf("Day: %d - %.2f leva\n", i, pricePerDay);
            pricePerDay = 0;
        }
        System.out.printf("Total: %.2f leva", totalPrice);
    }
}
