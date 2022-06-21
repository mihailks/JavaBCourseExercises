package FirstStepsinCodingMoreExercises;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceSkumriq = Double.parseDouble(scanner.nextLine());
        double priceCaca = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        int kgMidi = Integer.parseInt(scanner.nextLine());

        double pricePalamud = priceSkumriq*1.6;
        double priceSafrid = priceCaca*1.8;
        double priceMidi = 7.5;

        double totalPrice = kgPalamud*pricePalamud + kgSafrid*priceSafrid + kgMidi*priceMidi;
        System.out.printf("%.2f",totalPrice);

    }
}
