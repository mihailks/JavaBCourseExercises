package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int area = Integer.parseInt(scanner.nextLine());
        double grapesPerScMeter = Double.parseDouble(scanner.nextLine());
        int wineNeeded = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());


        double totalGrapes = area * grapesPerScMeter * 0.4;
        double wine = totalGrapes / 2.5;
        if (wine < wineNeeded) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineNeeded - wine));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wine - wineNeeded), Math.ceil((wine - wineNeeded) / workers));
        }
    }
}
