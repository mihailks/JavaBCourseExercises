package ProgrammingBasicsOnlineExam15and16June2019;

import java.util.Scanner;

public class P06FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int currentMoviePoints = 0;
        int maxPoints = 0;
        int movieCounter = 1;
        String chosenMovie = "";

        while (!movieName.equals("STOP")) {

            for (int i = 0; i < movieName.length(); i++) {
                char letter = movieName.charAt(i);
                if ('a' <= letter && letter <= 'z') {
                    letter -= 2 * movieName.length();
                } else if ('A' <= letter && letter <= 'Z') {
                    letter -= movieName.length();
                }
                currentMoviePoints += letter;
            }
            if (currentMoviePoints > maxPoints) {
                maxPoints = currentMoviePoints;
                chosenMovie = movieName;
            }
            movieCounter++;
            currentMoviePoints = 0;
            if (movieCounter > 7) {
                System.out.println("The limit is reached.");
                break;
            }
            movieName = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", chosenMovie, maxPoints);
    }
}
