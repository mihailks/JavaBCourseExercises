package NestedLoopsExercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());


        for (int i = n + 1; i < m; i++) {
            String number = "" + i;
            int odd = 0;
            int even = 0;
            for (int j = 0; j < number.length(); j++) {
                int digit = Integer.parseInt("" + number.charAt(j));
                if (j % 2 == 0) {
                    even += digit;
                } else {
                    odd += digit;
                }
            }
            if (odd==even){
                System.out.print(i+ " ");

            }
        }

    }
}
