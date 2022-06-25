package WhileLoopMoreExercises;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        int fil = 0;
        int detergent = bottles * 750;
        int n;
        int dishes = 0;
        int pots = 0;

        while (detergent >= 0) {
            fil++;
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            n = Integer.parseInt(input);

            if (fil % 3 == 0) {
                detergent -= n * 15;
                pots += n;
            } else {
                detergent -= n * 5;
                dishes += n;
            }
        }
        if (detergent >= 0) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", dishes, pots);
            System.out.printf("Leftover detergent %d ml.", detergent);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergent));
        }
    }
}
