package ProgrammingBasicsOnlineExam6and7April2019;

import java.util.Scanner;

public class P04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());
        double price = 0;
        int tickets = 0;
        int others = 0;
        int count = 0;
        while (voucher >= 0) {
            String name = scanner.nextLine();
            if (name.equals("End")) {
                break;
            }
            count = name.length();

            if (count > 8) {
                price = name.charAt(0) + name.charAt(1);
                tickets++;
            } else {
                price = name.charAt(0);
                others++;
            }
            voucher -= price;
        }
        if (count > 8 && voucher < 0) {
            System.out.println(tickets - 1);
            System.out.println(others);
        } else if (count <= 8 && voucher < 0) {
            System.out.println(tickets);
            System.out.println(others - 1);
        } else {
            System.out.println(tickets);
            System.out.println(others);
        }
    }
}
