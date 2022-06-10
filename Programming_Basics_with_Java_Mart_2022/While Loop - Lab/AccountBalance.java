package WhileLoopLab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double total = 0.0;

        while (!input.equals("NoMoreMoney")){
            double increase = Double.parseDouble(input);
            if (increase < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                System.out.printf("Increase: %.2f%n", increase);
            }
            total +=increase;
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", total);
    }
}



//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double increase = Double.parseDouble(scanner.nextLine());
//        if (increase < 0) {
//            System.out.println("Invalid operation!");
//            System.out.println("Total: 0.00");
//        } else {
//            System.out.printf("Increase: %.2f%n", increase);
//        }
//
//        while (increase >= 0) {
//            increase = Double.parseDouble(scanner.nextLine());
//            if (increase < 0) {
//                System.out.println("Invalid operation!");
//                System.out.printf("Total: %.2f", increase);
//                break;
//            } else {
//                System.out.printf("Increase: %.2f%n", increase);
//            }
//        }
//    }
