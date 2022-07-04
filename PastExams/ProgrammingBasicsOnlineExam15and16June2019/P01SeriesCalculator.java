package ProgrammingBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class P01SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double duration = Double.parseDouble(scanner.nextLine());
        double totalTime = 0;
        duration *= 1.2;
        totalTime = duration * episodes * seasons + seasons * 10;
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", name, Math.floor(totalTime));
    }
}
