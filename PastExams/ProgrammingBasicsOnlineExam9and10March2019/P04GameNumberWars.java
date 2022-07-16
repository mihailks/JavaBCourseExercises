package ProgrammingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class P04GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerOne = scanner.nextLine();
        String playerTwo = scanner.nextLine();

        String inputOne = scanner.nextLine();
        String inputTwo = scanner.nextLine();
        int playerOnePoints = 0;
        int playerTwoPoints = 0;
        boolean numberWars = false;
        int winPoints = 0;
        String winName = "";
        while (!inputOne.equals("End of game")) {

            int movePlayerOne = Integer.parseInt(inputOne);
            int movePlayerTwo = Integer.parseInt(inputTwo);

            if (movePlayerOne > movePlayerTwo) {
                playerOnePoints += movePlayerOne - movePlayerTwo;
            } else if (movePlayerOne < movePlayerTwo) {
                playerTwoPoints += movePlayerTwo - movePlayerOne;
            } else {
                movePlayerOne = Integer.parseInt(scanner.nextLine());
                movePlayerTwo = Integer.parseInt(scanner.nextLine());
                numberWars = true;
                if (movePlayerOne > movePlayerTwo) {
                    winName = playerOne;
                    winPoints = playerOnePoints;
                    break;
                } else if (movePlayerOne < movePlayerTwo) {
                    winName = playerTwo;
                    winPoints = playerTwoPoints;
                    break;
                }
            }
            inputOne = scanner.nextLine();
            if (inputOne.equals("End of game")){
                break;
            }
            inputTwo = scanner.nextLine();
        }

        if (numberWars) {
            System.out.println("Number wars!");
            System.out.printf("%s is winner with %d points", winName, winPoints);
        } else {
            System.out.printf("%s has %d points\n", playerOne, playerOnePoints);
            System.out.printf("%s has %d points", playerTwo, playerTwoPoints);
        }
    }
}
