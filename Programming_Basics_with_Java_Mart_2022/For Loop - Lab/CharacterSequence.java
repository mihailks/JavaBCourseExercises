package ForLoopLab;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) { // обхождаме стринга

            char letter = text.charAt(i); // взимаме всяка буква.
            System.out.println(letter);

        }


    }
}
