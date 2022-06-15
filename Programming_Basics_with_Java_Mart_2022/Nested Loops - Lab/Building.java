package NestedLoopsLab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int apartments = Integer.parseInt(scanner.nextLine());


        for (int i = floors + 1; i >= 2; i--) {
            System.out.println();
            for (int j = 0; j < apartments; j++) {
                if (floors == 1) {
                    System.out.printf("L1%d ", j);
                } else if (i == floors + 1) {
                    System.out.printf("L%d%d ", i - 1, j);
                } else if (i % 2 == 0) {
                    System.out.printf("A%d%d ", i - 1, j);
                } else if (i % 2 != 0) {
                    System.out.printf("O%d%d ", i - 1, j);
                }

            }
        }


    }
}

