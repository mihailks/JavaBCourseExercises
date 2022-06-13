package WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goHome = Integer.parseInt(scanner.nextLine());
        String problem = "";
        String problemFinal;
        int badMarkCount = 0;
        double averageScore = 0;
        int problemSolved = 0;
        String lastProblem ="";
        boolean okScore = true;
        boolean exitExam = false;
        while (true) {
            lastProblem = problem;
            problem = scanner.nextLine();
            if (problem.equals("Enough")){
                exitExam=true;
                break;
            }
            lastProblem = problem;
            int mark = Integer.parseInt(scanner.nextLine());
            averageScore += mark;
            problemSolved++;
            if (mark <= 4) {
                badMarkCount++;
                if (badMarkCount >= goHome) {
                    okScore = false;
                    System.out.printf("You need a break, %d poor grades.%n",goHome);
                    break;
                }
            }
        }

        if (okScore){
            averageScore /= problemSolved;
            System.out.printf("Average score: %.2f%n", averageScore);
            System.out.printf("Number of problems: %d%n", problemSolved);
            System.out.printf("Last problem: %s%n", lastProblem);
        }



    }
}
