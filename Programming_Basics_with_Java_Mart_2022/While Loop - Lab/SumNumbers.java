package WhileLoopLab;

import java.util.Scanner;

public class SumNumbers {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (sum<firstNum){
            int remainingNums = Integer.parseInt(scanner.nextLine());
            sum += remainingNums;
        }
        System.out.println(sum);

    }
}
