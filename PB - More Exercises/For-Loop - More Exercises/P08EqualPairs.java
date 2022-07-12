import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int diff = 0;
        int maxDiff = 0;
        int sum;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            sum = num1 + num2;
            if (i == 0) {
                temp = sum;
            } else {
                if (temp != sum) {
                    diff = Math.abs(sum - temp);
                    temp = sum;
                }
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }
        if (diff == 0) {
            System.out.printf("Yes, value=%d", temp);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}