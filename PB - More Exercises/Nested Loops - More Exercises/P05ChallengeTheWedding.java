package NestedLoopsMoreExercises;

import java.util.Scanner;

public class P05ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMens = Integer.parseInt(scanner.nextLine());
        int numberOfWomen = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int i = 1; i <= numberOfMens; i++) {
            for (int j = 1; j <= numberOfWomen; j++) {
                counter++;
                if (counter > tables) {
                    break;
                }
                System.out.printf("(%d <-> %d) ", i, j);
            }
        }
    }
}
