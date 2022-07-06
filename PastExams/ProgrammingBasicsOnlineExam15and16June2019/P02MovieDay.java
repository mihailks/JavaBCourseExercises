package ProgrammingBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class P02MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double time = Double.parseDouble(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int duration = Integer.parseInt(scanner.nextLine());

        double timeLeft = Math.abs(time * 0.85 - scenes * duration);
        if ((time * 0.85) >= (scenes * duration)) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", timeLeft);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", timeLeft);
        }
    }
}

