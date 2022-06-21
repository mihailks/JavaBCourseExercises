package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int gameWinCounter = 0;
        int gameLoseCounter = 0;
        int winDaysCounter = 0;
        double moneyPerDay = 0.0;
        double raisedMoney = 0.0;

        for (int i = 0; i < days; i++) {

            String result = scanner.nextLine();

            while (!result.equals("Finish")) {

                if (result.equals("win")) {
                    gameWinCounter++;
                } else if (result.equals("lose")) {
                    gameLoseCounter++;
                }
                result = scanner.nextLine();
            }
            moneyPerDay = gameWinCounter * 20;
            if (gameWinCounter > gameLoseCounter) {
                winDaysCounter++;
                moneyPerDay *= 1.10;
            }
            raisedMoney += moneyPerDay;
            moneyPerDay = 0.0;
            gameWinCounter = 0;
            gameLoseCounter = 0;
        }

        if (winDaysCounter > days / 2) {
            raisedMoney *= 1.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", raisedMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", raisedMoney);
        }
    }
}
