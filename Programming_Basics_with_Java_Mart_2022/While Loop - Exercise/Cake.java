package WhileLoopExercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());

        int pieces = width * high;
        int pieceCake = 1;
        String command = "";
        int count = 0;

        while (pieces > 0) {
            command = scanner.next();
            if (command.equals("STOP")) {
                System.out.printf("%d pieces are left.", pieces);
                break;
            } else {
                count = Integer.parseInt(command);
                pieces -= count;
            }

        }
        if (pieces <= 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
        }

    }


}
