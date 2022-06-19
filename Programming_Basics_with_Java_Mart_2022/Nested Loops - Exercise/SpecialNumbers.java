package NestedLoopsExercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
        double n = Double.parseDouble(scanner.nextLine());


        for (int i = 1111; i <= 9999; i++) {
            boolean isMagic = false;
            String num = "" + i;
            for (int j = 0; j < num.length(); j++) {
                double digit = Double.parseDouble("" + num.charAt(j));
                if (digit == 0) {
                    isMagic = false;
                    break;
                } else if (n % digit != 0) {
                    isMagic = false;
                    break;
                } else if (n % digit == 0) {
                    isMagic = true;
                }
            }
            if (isMagic) {
                System.out.print(i + " ");
            }

        }
    }

}
