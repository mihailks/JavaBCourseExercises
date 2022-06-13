package WhileLoopExercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        int sizeApart = width*length*high;
        int boxes = 0;
        int boxCount=0;
        String userInput="0";

        while (sizeApart>=boxCount){
            userInput = scanner.nextLine();
            if (userInput.equals("Done")){
                System.out.printf("%d Cubic meters left.", sizeApart-boxCount);
                break;
            }else {
                boxes = Integer.parseInt(userInput);
                boxCount+=boxes;
            }

        }
if (boxCount>sizeApart){
    System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(sizeApart - boxCount));
}
    }
}
