import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

    public static void main(String arg[]) {

        // Enter  your code
        Scanner scanner = new Scanner(System.in);
        int value;


        System.out.println("enter an integer");

        try {
            value = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("You didn't type in an integer bozo!!!");
        }

    }
}
