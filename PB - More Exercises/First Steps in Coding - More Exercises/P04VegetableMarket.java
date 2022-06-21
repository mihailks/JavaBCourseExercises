package FirstStepsinCodingMoreExercises;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegPrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        int kgVeg = Integer.parseInt(scanner.nextLine());
        int kgFruit = Integer.parseInt(scanner.nextLine());

        double totalPrice = (vegPrice*kgVeg + fruitPrice*kgFruit)/1.94;

        System.out.printf("%.2f", totalPrice);
    }
}
