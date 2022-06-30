package DrawingFiguresWithLoopsMoreExercises;

import java.util.Scanner;

public class P05SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String minus = "-";

            System.out.print("+ ");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(minus + " ");
            }
            System.out.println("+");

            for (int j = 0; j < n-2; j++) {

                System.out.print("| ");
                for (int k = 0; k < n - 2; k++) {
                    System.out.print(minus + " ");
                }
                System.out.println("|");
            }
            System.out.print("+ ");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(minus + " ");
            }
            System.out.println("+");
    }
}
