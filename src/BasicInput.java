import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt;
        double userDouble;
        char userChar;
        String userString;


        System.out.println("Enter integer:");
        userInt = scnr.nextInt();
        System.out.println("Enter double:");
        userDouble = scnr.nextDouble();
        System.out.println("Enter character:");
        userChar = scnr.next().charAt(0);
        System.out.println("Enter string:");
        userString = scnr.next();

        System.out.println(userInt+ " "+ userDouble+" "+userChar+" "+userString);

        System.out.println(userString+ " "+userChar+" "+userDouble+" "+userInt);

        System.out.println(userDouble+" cast to an integer is "+(int)userDouble);
    }
}