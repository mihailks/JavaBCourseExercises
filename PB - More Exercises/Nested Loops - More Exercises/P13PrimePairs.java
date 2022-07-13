package NestedLoopsMoreExercises;

import java.util.Scanner;

public class P13PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startFirst = Integer.parseInt(scanner.nextLine());
        int startSecond = Integer.parseInt(scanner.nextLine());
        int deltaFirst = Integer.parseInt(scanner.nextLine());
        int deltaSecond = Integer.parseInt(scanner.nextLine());
        boolean firstIsPrime = true;
        boolean secondIsPrime = true;

        for (int i = startFirst; i <= startFirst + deltaFirst; i++) {
            for (int j = startSecond; j <= startSecond + deltaSecond; j++) {
                for (int k = 2; k <= Math.sqrt(i); k++) {
                    if (i % k == 0) {
                        firstIsPrime = false;
                        break;
                    }
                }
                for (int m = 2; m <= Math.sqrt(j); m++) {
                    if (j % m == 0) {
                        secondIsPrime = false;
                        break;
                    }
                }
                if (firstIsPrime && secondIsPrime) {
                    System.out.printf("%d%d\n", i, j);
                } else {
                    firstIsPrime = true;
                    secondIsPrime = true;
                }
            }
        }
    }
}
