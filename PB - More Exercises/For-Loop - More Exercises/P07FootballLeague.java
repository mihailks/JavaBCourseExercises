package ForLoopMoreExercises;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sector;
        int capacity = Integer.parseInt(scanner.nextLine());
        int fens = Integer.parseInt(scanner.nextLine());
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        for (int i = 0; i < fens; i++) {

            sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    counter1++;
                    break;
                case "B":
                    counter2++;
                    break;
                case "V":
                    counter3++;
                    break;
                case "G":
                    counter4++;
                    break;
            }
        }
        double totalPeople = counter1 + counter2 + counter3 + counter4;
        System.out.printf("%.2f%%%n", counter1 / totalPeople * 100);
        System.out.printf("%.2f%%%n", counter2 / totalPeople * 100);
        System.out.printf("%.2f%%%n", counter3 / totalPeople * 100);
        System.out.printf("%.2f%%%n", counter4 / totalPeople * 100);
        System.out.printf("%.2f%%", totalPeople / capacity * 100);
    }
}
