package WhileLoopLab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int maxNum = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int nextNum = Integer.parseInt(input);
            if (nextNum > maxNum) {
                maxNum = nextNum;
            }
            input = scanner.nextLine();
        }
        System.out.println(maxNum);
    }
}
