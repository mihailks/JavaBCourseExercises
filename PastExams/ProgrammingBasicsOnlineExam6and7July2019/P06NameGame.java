package ProgrammingBasicsOnlineExam6and7July2019;

import java.util.Scanner;

public class P06NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int currentGamePoints = 0;
        int maxPoints = 0;
        String winnerName = "";
        while (!name.equals("Stop")){
            for (int i = 0; i < name.length(); i++) {
                int n = Integer.parseInt(scanner.nextLine());
                if (n==name.charAt(i)){
                    currentGamePoints+=10;
                }else {
                    currentGamePoints+=2;
                }
            }
            if (currentGamePoints>=maxPoints){
                maxPoints=currentGamePoints;
                winnerName=name;
            }
            currentGamePoints=0;
            name = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", winnerName, maxPoints);
    }
}
