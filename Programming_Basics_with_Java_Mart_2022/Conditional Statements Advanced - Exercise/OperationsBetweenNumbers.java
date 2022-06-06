package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.next().charAt(0);
        double result = 0;

        if (operator == '+' || operator == '-' || operator == '*'){
            switch (operator){
                case '+':
                    result = n1 + n2;
                    break;
                case '-':
                    result = n1 - n2;
                    break;
                case '*':
                    result = n1 * n2;
                    break;
            }
            if (result%2==0){
                System.out.printf("%d %c %d = %.0f - even", n1, operator, n2, result);
            }else {
                System.out.printf("%d %c %d = %.0f - odd", n1, operator, n2, result);
            }
        }
        if (n2==0){
            System.out.printf("Cannot divide %d by zero", n1);
        }else if (operator == '/'){
            result = n1*1.0 / n2;
            System.out.printf("%d %c %d = %.2f", n1, operator, n2, result);
        } else if (operator == '%'){
            result = n1*1.0 % n2;
            System.out.printf("%d %c %d = %.0f", n1, operator, n2, result);
        }

    }
}
