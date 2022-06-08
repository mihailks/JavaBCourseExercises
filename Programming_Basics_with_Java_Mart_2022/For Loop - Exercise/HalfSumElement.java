package ForLoopExercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;
        int newSum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > maxNum) {
                maxNum = number;
            }
            sum += number;
        }
        newSum = sum-maxNum;
        if (newSum==maxNum){
            System.out.println("Yes");
            System.out.println("Sum = "+ newSum);
        }else{
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(maxNum-newSum));
        }
    }

}
