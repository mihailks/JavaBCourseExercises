package DrawingFiguresWithLoopsMoreExercises;

import java.util.Scanner;

public class P08Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        FirstLastRow(n);
        System.out.println();
        for (int i = 0; i < n - 2; i++) {
            MidRows(n);
            if (i == (n - 1) / 2 - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("|");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.print(" ");
                }
            }
            MidRows(n);
            System.out.println();
        }
        FirstLastRow(n);
    }

    private static void MidRows(int n) {
        System.out.print("*");
        for (int j = 0; j < 2 * n - 2; j++) {
            System.out.print("/");
        }
        System.out.print("*");
    }

    private static void FirstLastRow(int n) {
        for (int j = 0; j < 2 * n; j++) {
            System.out.print("*");
        }
        for (int j = 0; j < n; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * n; j++) {
            System.out.print("*");
        }
    }
}
