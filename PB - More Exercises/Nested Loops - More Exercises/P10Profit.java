package NestedLoopsMoreExercises;

import java.util.Scanner;

public class P10Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneCoins = Integer.parseInt(scanner.nextLine());
        int twoCoins = Integer.parseInt(scanner.nextLine());
        int fifeNote = Integer.parseInt(scanner.nextLine());
        int totalSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= oneCoins; i++) {
            for (int j = 0; j <= twoCoins; j++) {
                for (int k = 0; k <= fifeNote; k++) {
                    if ((i + (j * 2) + (k * 5)) == totalSum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, totalSum);
                    }
                }
            }
        }
    }
}
