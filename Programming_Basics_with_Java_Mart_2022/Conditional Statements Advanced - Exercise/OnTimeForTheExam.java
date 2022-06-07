package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMin = Integer.parseInt(scanner.nextLine());

        int eMin = examHour * 60 + examMin;
        int aMin = arriveHour * 60 + arriveMin;

        if (eMin == aMin) {
            System.out.println("On time");
        }

        if (eMin - aMin > 0 && eMin - aMin <= 30) {
            System.out.println("On time");
            System.out.println(eMin - aMin + " minutes before the start");
        } else if (eMin - aMin > 30 && eMin - aMin <=59){
            System.out.println("Early");
            System.out.println(eMin - aMin + " minutes before the start");
        } else if (eMin - aMin > 59) {
            System.out.println("Early");
            int newHour = (eMin - aMin) / 60;
            int newMin = (eMin - aMin) % 60;
            if (newMin < 9) {
                System.out.printf("%d:0%d hours before the start", newHour, newMin);
            } else {
                System.out.printf("%d:%d hours before the start", newHour, newMin);
            }
        }
        if (aMin - eMin > 0 && aMin - eMin <= 59) {
            System.out.println("Late");
            System.out.println(aMin - eMin + " minutes after the start");
        } else if (aMin - eMin > 59) {
            System.out.println("Late");
            int newHour = (aMin - eMin) / 60;
            int newMin = (aMin - eMin) % 60;
            if (newMin < 9) {
                System.out.printf("%d:0%d hours after the start", newHour, newMin);
            } else {
                System.out.printf("%d:%d hours after the start", newHour, newMin);
            }
        }
    }
}

