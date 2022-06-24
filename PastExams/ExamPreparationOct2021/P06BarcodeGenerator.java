package ExamPreparationOct2021;

import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());

        int a4 = start % 10;
        int a3 = (start / 10) % 10;
        int a2 = (start / 100) % 10;
        int a1 = (start / 1000) % 10;

        int b4 = stop % 10;
        int b3 = (stop / 10) % 10;
        int b2 = (stop / 100) % 10;
        int b1 = (stop / 1000) % 10;


        for (int i = a1; i <= b1; i++) {
            for (int j = a2; j <= b2; j++) {
                for (int k = a3; k <= b3; k++) {
                    for (int l = a4; l <= b4; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ",i, j, k, l);
                        }
                    }

                }

            }


        }
    }
}
