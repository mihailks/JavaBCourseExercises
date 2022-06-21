package ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOff = Integer.parseInt(scanner.nextLine());

        int workDays = 365 - daysOff;
        int playMinutes = daysOff * 127 + workDays * 63;
        int overPlay = playMinutes - 30000;

        if (overPlay > 0) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", overPlay / 60, overPlay % 60);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", Math.abs(overPlay / 60), Math.abs(overPlay % 60));
        }
    }
}
