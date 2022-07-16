package ProgrammingBasicsOnlineExam9and10March2019;

import java.util.Scanner;

public class P02FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int win1=0;
        int win2=0;
        int draws=0;
        for (int i = 0; i < 3; i++) {
            String input = scanner.nextLine();
            if (input.charAt(0)>input.charAt(2)){
                win1++;
            } else if (input.charAt(0)<input.charAt(2)){
                win2++;
            }else {
                draws++;
            }
        }
        System.out.printf("Team won %d games.\n",win1);
        System.out.printf("Team lost %d games.\n",win2);
        System.out.printf("Drawn games: %d\n",draws);

    }
}
