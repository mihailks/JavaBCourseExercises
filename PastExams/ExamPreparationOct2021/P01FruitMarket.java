package ExamPreparationOct2021;

import java.util.Scanner;

public class P01FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double kgBananas = Double.parseDouble(scanner.nextLine());
        double kgOranges = Double.parseDouble(scanner.nextLine());
        double kgRaspberries = Double.parseDouble(scanner.nextLine());
        double kgStrawberries = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberriesPrice / 2;
        double orangesPrice = raspberriesPrice * 0.60;
        double bananasPrice = 0.2 * raspberriesPrice;

        double total = strawberriesPrice * kgStrawberries + bananasPrice * kgBananas + orangesPrice * kgOranges + raspberriesPrice * kgRaspberries;

        System.out.printf("%.2f", total);
    }
}
