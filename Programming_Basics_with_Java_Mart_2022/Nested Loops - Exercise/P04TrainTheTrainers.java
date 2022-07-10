package NestedLoopsExercise;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfPresentation = scanner.nextLine();
        double currentSubject = 0.0;
        double finalScore = 0.0;
        int marksCounter = 0;
        while (!typeOfPresentation.equals("Finish")){
            for (int i = 1; i <= numberOfPeople; i++) {
                double mark = Double.parseDouble(scanner.nextLine());
                marksCounter++;
                currentSubject+=mark;
                finalScore+=mark;
            }
            System.out.printf("%s - %.2f.%n",typeOfPresentation, currentSubject/numberOfPeople);
            currentSubject=0;
            typeOfPresentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", finalScore/marksCounter);
    }
}
