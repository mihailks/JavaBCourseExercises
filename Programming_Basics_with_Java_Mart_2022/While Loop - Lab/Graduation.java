package WhileLoopLab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int excluded = 0;
        int grade = 1;
        double mark = 0.0;
        double average = 0.0;

        while (grade <= 12) {
            mark = Double.parseDouble(scanner.nextLine());
            grade++;
            average += mark;
            if (mark < 4) {
                excluded++;
            }
            if (excluded == 2) {
                System.out.printf("%s has been excluded at %d grade", name, grade-2);
                break;
            }
        }
        if (excluded<2){
            System.out.printf("%s graduated. Average grade: %.2f", name, average/12);
        }

    }
}
