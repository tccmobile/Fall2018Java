import java.util.Scanner;

public class AuthoringAssistant {

    //static Scanner scanner = new Scanner(System.in);

    public static char printMenu(Scanner scanner){


        char choice;

        System.out.println("MENU");
        System.out.println("c - Number of non-whitespace characters");
        System.out.println("w - Number of words");
        System.out.println("f - Find text");
        System.out.println("r - Replace all !'s");
        System.out.println("s - Shorten spaces");
        System.out.println("q - Quit");
        System.out.println();
        System.out.println("Choose an option:");
        choice = scanner.next().charAt(0);

        while ((choice!='c')&&(choice!='w')&&(choice!='f')&&(choice!='r')&&(choice!='s')&&(choice!='q')){
            System.out.println();
            System.out.println("Invalid choice");
            System.out.println("Choose an option:");
            choice = scanner.next().charAt(0);
        }
        return choice;
    }

    public static void main(String[] args) {
        /* Type your code here. */

        Scanner scanner = new Scanner(System.in);
        String userInput;
        char choice;


        System.out.println("Enter a sample text:");
        userInput = scanner.nextLine();

        System.out.println("\nYou entered: "+userInput);

        do{
            choice = printMenu(scanner);
            //do menu choices aka call methods
        } while (choice!='q');


    }
}