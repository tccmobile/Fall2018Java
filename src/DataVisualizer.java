import java.util.ArrayList;
import java.util.Scanner;

public class DataVisualizer {

    static String[] tokens;

    public static boolean hasComma(String userInput){

        return  userInput.contains(",");
    }

    public static boolean hasCorrectCommas(String userInput){
        tokens = userInput.split(",");
        tokens[0]=tokens[0].trim();
        tokens[1]=tokens[1].trim();
        if (tokens.length>2)
            return false;
        else
            return true;

    }

    public static boolean isBooks(String book){
        boolean digit = Character.isDigit(book.charAt(0));
        return digit;
    }

    public static void main(String arg[]) {

        // Enter  your code
        String tableTitle, column1Title, column2Title,authorName, userInput;
        Scanner scanner = new Scanner(System.in);
        int numBooks;
        ArrayList<String> authors = new ArrayList<String>();
        ArrayList<Integer> books = new ArrayList<Integer>();


        // Steps 1 & 2
        System.out.println("Enter a title for the data:");
        tableTitle = scanner.nextLine();
        System.out.println("You entered: "+tableTitle);
        System.out.println();
        System.out.println("Enter the column 1 header:");
        column1Title = scanner.nextLine();
        System.out.println("You entered: "+column1Title);
        System.out.println();
        System.out.println("Enter the column 2 header:");
        column2Title = scanner.nextLine();
        System.out.println("You entered: "+column2Title);
        System.out.println();

        //Step 3

        System.out.println("Enter a data point (-1 to stop input):");
        userInput = scanner.nextLine();

        while (!userInput.equals("-1")){
            if (!hasComma(userInput)){
                System.out.println("Error: No comma in string.");
                System.out.println();
            } else if (!hasCorrectCommas(userInput)){
                System.out.println("Error: Too many commas in input.");
                System.out.println();
            } else if (!isBooks(tokens[1])){
                System.out.println("Error: Comma not followed by an integer.");
                System.out.println();
            }

            System.out.println("Data string: "+tokens[0]);
            System.out.println("Data integer: "+tokens[1]);

            authorName = tokens[0];
            numBooks = Integer.valueOf(tokens[1]);

            authors.add(authorName);
            books.add(numBooks);

            System.out.println();
            System.out.println("Enter a data point (-1 to stop input):");
            userInput = scanner.nextLine();
        }

        // Steps 4 & 5

    }
}
