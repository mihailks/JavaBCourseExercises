package ConditionalStatementsAdvancedMoreExercises;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String clas, type;

        if (budget <= 1000) {
            clas = "Camp";
            if (season.equals("Summer")) {
                budget *= 0.65;
                type = "Alaska";
            } else {
                budget *= 0.45;
                type = "Morocco";
            }
        } else if (budget < 3000) {
            clas = "Hut";
            if (season.equals("Summer")) {
                budget *= 0.80;
                type = "Alaska";
            } else {
                budget *= 0.60;
                type = "Morocco";
            }
        } else {
            clas = "Hotel";
            if (season.equals("Summer")){
                type = "Alaska";
            }else {
                type = "Morocco";
            }
            budget *= 0.90;
        }
        System.out.printf("%s - %s - %.2f", type, clas, budget);
    }
}
