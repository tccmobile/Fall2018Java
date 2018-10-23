import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;

public class StringOutputStream {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Basic character stream for fullname
        StringWriter fullnameCharStream = new StringWriter();
        // Augments character stream (fullname) with print()
        PrintWriter fullnameOSS = new PrintWriter(fullnameCharStream);
        // Basic character stream for age
        StringWriter ageCharStream = new StringWriter();
        // Augments character stream (age) with print()
        PrintWriter ageOSS = new PrintWriter(ageCharStream);

        String firstName;      // First name
        String lastName;       // Last name
        String fullName;       // Full name (first and last)
        String ageStr;         // Age (string)
        int userAge;           // Age

        // Prompt user for input
        System.out.print("Enter \"firstname lastname age\": \n   ");
        firstName = scnr.next();
        lastName = scnr.next();
        userAge = scnr.nextInt();

        // Writes formatted string to buffer, copies from underlying char buffer
        fullnameOSS.print(lastName + ", " + firstName);
        fullName = fullnameCharStream.toString();

        // Output parsed input
        System.out.println("\n   Full name: " + fullName);

        // Writes int age as characters to buffer
        ageOSS.print(userAge);

        // Appends (minor) to object if less than 21, then
        // copies buffer into string
        if (userAge < 21) {
            ageOSS.print(" (minor)");
        }

        ageStr = ageCharStream.toString();

        // Output string
        System.out.println("   Age: " + ageCharStream);

        System.out.println("   Age: " + ageCharStream.toString());
    }
}