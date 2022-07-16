package ProgrammingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class P06HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());
        int currentJump = Integer.parseInt(scanner.nextLine());
        int jumpCounter = 0;
        int currentHigh = 0;
        int startHigh = target - 30;
        boolean fail = false;
        while (target >= currentJump) {

            jumpCounter++;
            if (startHigh < currentJump) {
                currentHigh = 0;
                startHigh += 5;
            } else {
                currentHigh++;
            }

            if (currentHigh == 3) {
                fail = true;
                break;
            }
            currentJump = Integer.parseInt(scanner.nextLine());
        }

        if (fail) {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", startHigh, jumpCounter);
        } else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", startHigh, jumpCounter + 1);
        }


    }
}
