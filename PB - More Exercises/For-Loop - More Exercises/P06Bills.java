package ForLoopMoreExercises;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double elPrice = 0;
        double elBill = 0.0;
        double waterBill = 20;
        double internetBill = 15;
        double othersPrice;
        double othersBill = 0;

        for (int i = 0; i < n; i++) {
            elPrice = Double.parseDouble(scanner.nextLine());
            elBill += elPrice;
            othersPrice = (waterBill + internetBill + elPrice) * 1.2;
            othersBill += othersPrice;

        }
        double totalPrice = elBill + othersBill + n * waterBill + n * internetBill;
        System.out.printf("Electricity: %.2f lv%n", elBill);
        System.out.printf("Water: %.2f lv%n", waterBill * n);
        System.out.printf("Internet: %.2f lv%n", internetBill * n);
        System.out.printf("Other: %.2f lv%n", othersBill);
        System.out.printf("Average: %.2f lv%n", totalPrice / n);
    }
}