package ProgrammingBasicsOnlineRetakeExam2and3May2019;

import java.util.Scanner;

public class P04FFlightTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ticketNumber = scanner.nextLine();

        int minTime = Integer.MAX_VALUE;
        String flight = "";
        double finalTicketPrice = 0;

        while (!ticketNumber.equals("End")){
            double ticketPrice = Double.parseDouble(scanner.nextLine());
            int waitingTime = Integer.parseInt(scanner.nextLine());
            if (waitingTime<minTime){
                minTime=waitingTime;
                flight=ticketNumber;
                finalTicketPrice=ticketPrice;
            }
            ticketNumber = scanner.nextLine();
        }
        finalTicketPrice*=1.96;

        System.out.printf("Ticket found for flight %s costs %.2f leva with %dh %dm stay",flight, finalTicketPrice, minTime/60, minTime%60);
    }
}
