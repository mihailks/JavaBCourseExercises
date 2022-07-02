package ProgrammingBasicsExam21February2016;

import java.math.BigDecimal;
import java.util.Scanner;

public class P04PassionDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal money = new BigDecimal(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("mall.Enter")) {
            input = scanner.nextLine();
        }
        while (!input.equals("mall.Exit")) ;
        {
            input = scanner.nextLine();
            for (int i = 0; i < input.length(); i++) {
                char n = input.charAt(i);
                if ('A' < n && n < 'Z') {

                }
            }


            input = scanner.nextLine();
        }


    }
}
