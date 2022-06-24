package ExamPreparationOct2021;

import java.util.Scanner;

public class P04FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());
        double biscuitsPerDay = 0.0;
        double totalBiscuits = 0.0;
        double totalEatenFood = 0.0;
        double totalDog = 0;
        double totalCat = 0;

        for (int i = 0; i < days; i++) {

            double dogFood = Double.parseDouble(scanner.nextLine());
            double catFood = Double.parseDouble(scanner.nextLine());
            if ((i + 1) % 3 == 0) {
                biscuitsPerDay = (dogFood + catFood) * 0.10;
                totalBiscuits += biscuitsPerDay;
            }
            totalEatenFood += dogFood + catFood;
            totalDog += dogFood;
            totalCat += catFood;
        }

        double percentDog = totalDog / totalEatenFood * 100;
        double percentCat = totalCat / totalEatenFood * 100;
        double percentFood = totalEatenFood / totalFood * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.%n", totalBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", percentFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentDog);
        System.out.printf("%.2f%% eaten from the cat.%n", percentCat);

    }
}
