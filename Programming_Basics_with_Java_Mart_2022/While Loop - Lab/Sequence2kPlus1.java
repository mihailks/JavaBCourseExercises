package WhileLoopLab;

import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int array = 1;
        while (n >= array) {
            System.out.println(array);
            array = array * 2 + 1;

        }
    }
}
