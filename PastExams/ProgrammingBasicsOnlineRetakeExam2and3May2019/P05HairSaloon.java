package ProgrammingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class P05HairSaloon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = Integer.parseInt(scanner.nextLine());
        int sumTillNow = 0;
        int price = 0;
        String input1 = scanner.nextLine();
        while (!input1.equals("closed")) {
            String input2 = scanner.nextLine();
            switch (input2) {
                case "mens":
                    price = 15;
                    break;
                case "kids":
                    price = 10;
                    break;
                case "ladies":
                case "touch up":
                    price = 20;
                    break;
                case "full color":
                    price = 30;
                    break;
            }
            sumTillNow += price;
            if (sumTillNow >= target) {
                break;
            }
            input1 = scanner.nextLine();
        }
        if (sumTillNow >= target) {
            System.out.println("You have reached your target for the day!");
        } else {
            System.out.printf("Target not reached! You need %dlv. more.", Math.abs(target - sumTillNow));
        }
        System.out.printf("Earned money: %dlv.", Math.abs(sumTillNow));
    }
}
