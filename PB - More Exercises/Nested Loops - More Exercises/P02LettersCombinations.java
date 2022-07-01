package NestedLoopsMoreExercises;

import java.util.Scanner;

public class P02LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.next().charAt(0);
        char last = scanner.next().charAt(0);
        char miss = scanner.next().charAt(0);
        int counter = 0;

        for (int i = first; i <= last; i++) {
            if (i != miss) {
                for (int j = first; j <= last; j++) {
                    if (j != miss) {
                        for (int k = first; k <= last; k++) {
                            if (k != miss) {
                                counter++;
                                System.out.printf("%c%c%c ", i, j, k);
                            }
                        }
                    }
                }
            }
        }
        System.out.print(counter);
    }
}
