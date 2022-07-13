package NestedLoopsMoreExercises;

import java.util.Scanner;

public class P06WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lastSector = scanner.nextLine().charAt(0);
        int numberRollsFirstSector = Integer.parseInt(scanner.nextLine());
        int numberOfSeatsOdd = Integer.parseInt(scanner.nextLine());
        int numberOfSeatsEven = numberOfSeatsOdd + 2;
        int placeCount = 0;

        for (int sector = 'A'; sector <= lastSector; sector++) {             //сектори                       A A A

            for (int i = 1; i <= numberRollsFirstSector; i++) {     //редове - ако е четен~         1 1 1
                if (i % 2 != 0) {
                    for (int j = 'a'; j < numberOfSeatsOdd + 'a'; j++) {                                // a b c
                        System.out.printf("%c%d%c%n", sector, i, j);
                        placeCount++;
                    }
                } else {
                    for (int j = 'a'; j < numberOfSeatsEven + 'a'; j++) {                                // a b c
                        System.out.printf("%c%d%c%n", sector, i, j);
                        placeCount++;
                    }
                }
            }
            numberRollsFirstSector++;
        }
        System.out.println(placeCount);
    }
}