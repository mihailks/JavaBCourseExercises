package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String clas, type;

        if (budget <= 100) {
            clas = "Economy class";
            if (season.equals("Summer")) {
                budget *= 0.35;
                type = "Cabrio";
            } else {
                budget *= 0.65;
                type = "Jeep";
            }
        } else if (budget <= 500) {
            clas = "Compact class";
            if (season.equals("Summer")) {
                budget *= 0.45;
                type = "Cabrio";
            } else {
                budget *= 0.80;
                type = "Jeep";
            }
        } else {
            clas = "Luxury class";
            type = "Jeep";
            budget *= 0.90;
        }

        System.out.println(clas);
        System.out.printf("%s - %.2f", type, budget);

    }
}
