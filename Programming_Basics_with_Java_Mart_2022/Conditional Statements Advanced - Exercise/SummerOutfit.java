package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degree = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        String outfit = "";
        String shoes = "";

        if (degree >= 10 && degree <= 18) {
            if (time.equals("Morning")) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (time.equals("Afternoon") || time.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        } else if (degree > 18 && degree <= 24) {
            if (time.equals("Morning") || time.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (time.equals("Afternoon")) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if (degree >= 25) {
            if (time.equals("Morning")) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (time.equals("Afternoon")) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            } else if (time.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
    }
}
