package ExamPreparationOct2021;

import java.util.Scanner;

public class P05EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsP1 = Integer.parseInt(scanner.nextLine());
        int eggsP2 = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        boolean p1Done = false;
        boolean p2Done = false;

        while (!input.equals("End")) {

            if (input.equals("one")) {
                eggsP2--;
                if (eggsP2 == 0) break;
            } else if (input.equals("two")) {
                eggsP1--;
                if (eggsP1 == 0) break;
            }
            input = scanner.nextLine();
        }
        if (eggsP2 == 0) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.%n", eggsP1);
        } else if (eggsP1 == 0) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.%n", eggsP2);
        } else {
            System.out.printf("Player one has %d eggs left.%n", eggsP1);
            System.out.printf("Player two has %d eggs left.%n", eggsP2);
        }
    }
}
