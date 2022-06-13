package WhileLoopExercise;

import java.net.Inet4Address;
import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input="";
        int currentSessionSteps = 0;
        int stepsSoFar=0;
        int stepsToHome=0;
        int totalSteps = 0;

        while (stepsSoFar<10000){
            input=scanner.nextLine();
            if(input.equals("Going home")){
                stepsToHome = Integer.parseInt(scanner.nextLine());
                stepsSoFar+=stepsToHome;
                break;
            }
            currentSessionSteps = Integer.parseInt(input);
            stepsSoFar+=currentSessionSteps;
        }

        if (stepsSoFar>=10000){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!",stepsSoFar-10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000-stepsSoFar);
        }

    }
}
