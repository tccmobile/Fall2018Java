import java.util.Scanner;

public class NumberGuessGame {
    public static void guessNumber(int lowVal, int highVal) {
        Scanner scnr = new Scanner(System.in);
        int midVal;            // Midpoint of low..high
        char userAnswer;       // User response

        midVal = (highVal + lowVal) / 2;

        // Prompt user for input
        System.out.print("Is it " + midVal + "? (l/h/y): ");
        userAnswer = scnr.next().charAt(0);

        if ((userAnswer != 'l') && (userAnswer != 'h')) { // Base case: found number
            System.out.println("Thank you!");
        }
        else {                                            // Recursive case: split into lower OR upper half
            if (userAnswer == 'l') {                       // Guess in lower half
                guessNumber(lowVal, midVal);                // Recursive call
            }
            else {                                         // Guess in upper half
                guessNumber(midVal + 1, highVal);           // Recursive call
            }
        }
    }

    public static void main(String[] args) {
        // Print game objective, user input commands
        System.out.println("Choose a number from 0 to 100.");
        System.out.println("Answer with:");
        System.out.println("   l (your num is lower)");
        System.out.println("   h (your num is higher)");
        System.out.println("   any other key (guess is right).");

        // Call recursive function to guess number
        guessNumber(0, 100);
    }
}