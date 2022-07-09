package ProgrammingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class proba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cCounter = 0;
        int oCounter = 0;
        int nCounter = 0;
        String word = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            char letter = input.charAt(0);
            if (letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z') {
                if (letter == 'c') {
                    cCounter++;
                }
                if (letter == 'o') {
                    oCounter++;
                }
                if (letter == 'n') {
                    nCounter++;
                }
                if (letter == 'c' && cCounter >= 2) {
                    word = word + letter;
                } else if (letter == 'o' && oCounter >= 2) {
                    word = word + letter;
                } else if (letter == 'n' && nCounter >= 2) {
                    word = word + letter;
                } else if (cCounter >= 1 && oCounter >= 1 && nCounter >= 1) {
                    cCounter = 0;
                    oCounter = 0;
                    nCounter = 0;
                    System.out.print(word + " ");
                    word = "";
                }
                if (letter != 'c' && letter != 'o' && letter != 'n') {
                    word = word + letter;
                }
            }
        }
    }
}