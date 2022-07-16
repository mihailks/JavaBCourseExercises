package ProgrammingBasicsOnlineExam20and21April2019;

import java.util.Scanner;

public class P05EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int packSugar = 950;
        int packFlour = 750;
        double sugarPacks = 0;
        double flourPacks = 0;
        int maxSugar = 0;
        int maxFlour = 0;
        int totalSugar = 0;
        int totalFlour = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            totalSugar += sugar;
            totalFlour += flour;
            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
            if (flour > maxFlour) {
                maxFlour = flour;
            }
        }
        sugarPacks = Math.ceil(totalSugar * 1.0 / packSugar);
        flourPacks = Math.ceil(totalFlour * 1.0 / packFlour);

        System.out.printf("Sugar: %.0f\n", sugarPacks);
        System.out.printf("Flour: %.0f\n", flourPacks);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
