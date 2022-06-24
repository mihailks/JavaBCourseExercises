package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P07FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());

        if (!fuelType.equals("Diesel") && !fuelType.equals("Gasoline") && !fuelType.equals("Gas")) {
            System.out.println("Invalid fuel!");
        } else {
            if (liters >= 25) {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            }
        }
    }
}

