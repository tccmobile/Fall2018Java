import java.util.Scanner;

public class ParseStrings {

    public static void main(String arg[]) {

        // Enter  your code
        Scanner scanner = new Scanner(System.in);
        String usrInput;

        System.out.println("Enter input string:");
        usrInput = scanner.nextLine();

        while (!usrInput.equals("q")) {

            while (!usrInput.contains(",")) {
                System.out.println("Error: No comma in string.");
                System.out.println("\nEnter input string:");
                usrInput = scanner.nextLine();
                if (usrInput.equals("q"))
                    break;

            }

            if (!usrInput.equals("q")) {
                String[] tokens;

                tokens = usrInput.split(",");

                String first = tokens[0];
                String second = tokens[1];

                first = first.trim();
                second = second.trim();

                System.out.println("First word: " + first);
                System.out.println("Second word: " + second);

                System.out.println("\nEnter input string:");
                usrInput = scanner.nextLine();
            }
        }
    }
}
