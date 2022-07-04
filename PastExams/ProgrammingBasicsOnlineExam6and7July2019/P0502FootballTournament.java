package ProgrammingBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class P0502FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        int counterW = 0;
        int counterD = 0;
        int counterL = 0;

        for (int i = 1; i <= n; i++) {
            char c = scanner.next().charAt(0);
            switch (c) {
                case 'W':
                    counterW++;
                    break;
                case 'D':
                    counterD++;
                    break;
                case 'L':
                    counterL++;
                    break;
            }
        }
        int totalPoints = counterW * 3 + counterD;
        double winPercent = counterW * 1.0 / n * 100;
        if (n == 0) {
            System.out.printf("%s hasn't played any games during this season.", name);
        } else {
            System.out.printf("%s has won %d points during this season.%n", name, totalPoints);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", counterW);
            System.out.printf("## D: %d%n", counterD);
            System.out.printf("## L: %d%n", counterL);
            System.out.printf("Win rate: %.2f%%", winPercent);
        }
    }
}
