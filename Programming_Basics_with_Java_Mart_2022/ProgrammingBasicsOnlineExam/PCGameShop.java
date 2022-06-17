package ProgrammingBasicsOnlineExam;

import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hearthstone = 0;
        int fornite = 0;
        int overwatch = 0;
        int others=0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String gameName = scanner.nextLine();
            switch (gameName){
                case "Hearthstone":
                    hearthstone++;
                    break;
                case "Fornite":
                    fornite++;
                    break;
                case "Overwatch":
                    overwatch++;
                    break;
                default:
                    others++;
                    break;
            }
        }
        double hearthstonePercent = hearthstone*1.0/n*100;
        double fornitePercent = fornite*1.0/n*100;
        double overwatchPercent = overwatch*1.0/n*100;
        double othersPercent = others*1.0/n*100;

        System.out.printf("Hearthstone - %.2f%%%n",hearthstonePercent);
        System.out.printf("Fornite - %.2f%%%n",fornitePercent);
        System.out.printf("Overwatch - %.2f%%%n",overwatchPercent);
        System.out.printf("Others - %.2f%%%n",othersPercent);
    }
}
