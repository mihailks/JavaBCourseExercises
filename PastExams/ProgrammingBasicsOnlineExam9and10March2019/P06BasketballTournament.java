package ProgrammingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class P06BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int ourTeamWins=0;
        int otherTeamWins=0;
        int totalGames=0;
        while (!name.equals("End of tournaments")){
            int n = Integer.parseInt(scanner.nextLine());
            totalGames+=n;
            for (int i = 1; i <= n; i++) {
                int ourTeamPoints = Integer.parseInt(scanner.nextLine());
                int otherTeamPoints = Integer.parseInt(scanner.nextLine());
                if (ourTeamPoints>otherTeamPoints){
                    ourTeamWins++;
                    System.out.printf("Game %d of tournament %s: win with %d points.\n",i,name, ourTeamPoints-otherTeamPoints);
                } else {
                    otherTeamWins++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n",i,name, otherTeamPoints-ourTeamPoints);
                }
            }
            name = scanner.nextLine();
        }
        System.out.printf("%.2f%% matches win\n",ourTeamWins*1.0/totalGames*100);
        System.out.printf("%.2f%% matches lost\n",otherTeamWins*1.0/totalGames*100);
    }
}
