package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int win = 0;
        int lose = 0;
        int draw = 0;
        for (int i = 0; i < 3; i++) {
            String result = scanner.nextLine();
            int a = Integer.parseInt("" + result.charAt(0));
            int b = Integer.parseInt("" + result.charAt(2));
            if (a > b) {
                win++;
            } else if (a < b) {
                lose++;
            } else {
                draw++;
            }
        }
        System.out.printf("Team won %d games.%n",win);
        System.out.printf("Team lost %d games.%n",lose);
        System.out.printf("Drawn games: %d",draw);

    }
}