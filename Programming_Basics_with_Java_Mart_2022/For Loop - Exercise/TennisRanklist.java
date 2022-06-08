package ForLoopExercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        double points = 0.0;
        double win = 0;
        for (int i =1; i<=n;i++){
            String place = scanner.nextLine();
            switch (place){
                case "W":
                    points += 2000;
                    win++;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;
            }
        }
        System.out.printf("Final points: %.0f%n", points+startPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(points/n));
        System.out.printf("%.2f%%",win/n*100);
    }
}
