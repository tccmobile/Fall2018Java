import java.util.Scanner;

public class ShoppingCartManager {

    public static char printMenu(ShoppingCart myCart,Scanner scanner){
        char choice = '?';

        // print menu
        // get input
        // data validation
        // execute choice on cart

        return choice;
    }

    public static void main(String arg[]) {

        // Enter  your code

        Scanner scanner = new Scanner(System.in);
        ShoppingCart myCart;
        String name, date;
        char choice;

        System.out.println("Enter Customer's Name:");
        name = scanner.nextLine();
        System.out.println("Enter Today's Date:");
        date = scanner.nextLine();

        System.out.println("\nCustomer Name: "+name);
        System.out.println("Today's Date: "+date);

        myCart = new ShoppingCart(name,date);


        do {
            choice = printMenu(myCart,scanner);
        } while (choice!='q');




    }
}
