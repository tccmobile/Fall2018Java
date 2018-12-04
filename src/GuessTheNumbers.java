import java.util.HashSet;
import java.util.Scanner;

public class GuessTheNumbers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        HashSet<Integer> numbersToGuess = new HashSet<Integer>();
        int userGuess;

        numbersToGuess.add(3);
        numbersToGuess.add(5);
        numbersToGuess.add(1);

        System.out.print("Enter a number between 1 to 10 (0 to exit): ");
        userGuess = scnr.nextInt();

        while (userGuess != 0) {
            // Check user's guess
            if (numbersToGuess.remove(userGuess)) {
                //numbersToGuess.remove(userGuess);

                System.out.println("Good guess! " + numbersToGuess.size() +
                        " number(s) remaining.");
            }
            else {
                System.out.println("Incorrect guess. " + numbersToGuess.size() +
                        " number(s) remaining.");
            }

            System.out.println();

            // Exit if no numbers are left, otherwise ask again
            if (numbersToGuess.size() == 0) {
                break;
            }
            else {
                System.out.print("Enter a number between 1 to 10 (0 to exit): ");
                userGuess = scnr.nextInt();
            }
        }

        // Print victory/failure message
        if (userGuess != 0) {
            System.out.println("You won!");
        }
        else {
            System.out.println("Quitters always lose!");
        }
    }
}
