package ProgrammingBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class P0602TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double letterSum = 0;
        double maxScore = 0;
        String temp = "";
        int letter = 0;
        while (!input.equals("End of words")) {
            int first = input.charAt(0);
            for (int i = 0; i < input.length(); i++) {
                letter = input.charAt(i);
                letterSum += letter;
            }
            switch (input.charAt(0)) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                case 'y':
                case 'Y':
                    letterSum = letterSum * input.length();
                    break;
                default:
                    letterSum = Math.round(letterSum / input.length());
            }
            if (letterSum > maxScore) {
                maxScore = letterSum;
                temp = input;
            }
            letterSum=0;
            input = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", temp, maxScore);
    }
}
