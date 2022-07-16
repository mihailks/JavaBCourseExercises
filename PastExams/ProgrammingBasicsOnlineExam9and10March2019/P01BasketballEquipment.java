package ProgrammingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class P01BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearTax = Integer.parseInt(scanner.nextLine());
        double kec = yearTax * 0.6;
        double clothes = kec * 0.8;
        double ball = clothes / 4;
        double accses = ball / 5;
        double money = kec + clothes + ball + accses + yearTax;

        System.out.printf("%.2f", money);

    }
}
