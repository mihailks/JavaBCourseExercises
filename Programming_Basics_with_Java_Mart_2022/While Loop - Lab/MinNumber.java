package WhileLoopLab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int minNum = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int nextNum = Integer.parseInt(input);
            if (nextNum < minNum) {
                minNum = nextNum;

            }
            input = scanner.nextLine();
        }
        System.out.println(minNum);
    }
}
