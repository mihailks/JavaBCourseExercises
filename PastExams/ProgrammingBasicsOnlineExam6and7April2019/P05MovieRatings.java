package ProgrammingBasicsOnlineExam6and7April2019;

import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double highScore = 0;
        String highScoreName="";
        double lolScore = 10;
        String lolScoreName="";
        double midScore = 0;
        for (int i = 0; i < n; i++) {
            String movieName = scanner.nextLine();
            double score = Double.parseDouble(scanner.nextLine());
            midScore += score;
            if (score > highScore) {
                highScore = score;
                highScoreName = movieName;
            } else if (score < lolScore) {
                lolScore = score;
                lolScoreName = movieName;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n", highScoreName , highScore );
        System.out.printf("%s is with lowest rating: %.1f%n", lolScoreName, lolScore);
        System.out.printf("Average rating: %.1f", midScore / n);
    }
}

