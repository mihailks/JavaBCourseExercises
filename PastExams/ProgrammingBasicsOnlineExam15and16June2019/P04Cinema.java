package ProgrammingBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class P04Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int income = 0;
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("Movie time!")) {
            int people = Integer.parseInt(input);
            if (n - people >= 0) {
                n -= people;
                income += people * 5;
                if (people % 3 == 0) {
                    income -= 5;
                }
            }
            else {
                System.out.println("The cinema is full.");
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Movie time!")) {
            System.out.printf("There are %d seats left in the cinema.%n", n);
        }
        System.out.printf("Cinema income - %d lv.", income);
    }
}
