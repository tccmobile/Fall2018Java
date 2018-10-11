import java.util.Scanner;

public class ShoppingCartPrinter {

    public static void main(String arg[]) {

        // Enter  your code
        Scanner scanner = new Scanner(System.in);
        String itemName;
        int itemPrice, itemQuantity;
        ItemToPurchase one, two;

        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        itemName = scanner.nextLine();
        System.out.println("Enter the item price:");
        itemPrice = scanner.nextInt();
        System.out.println("Enter the item quantity:");
        itemQuantity = scanner.nextInt();

        one = new ItemToPurchase();
        one.setName(itemName);
        one.setPrice(itemPrice);
        one.setQuantity(itemQuantity);

        scanner.nextLine(); // don't care about value - just getting stray \n

        System.out.println("\nItem 2");
        System.out.println("Enter the item name:");
        itemName = scanner.nextLine();
        System.out.println("Enter the item price:");
        itemPrice = scanner.nextInt();
        System.out.println("Enter the item quantity:");
        itemQuantity = scanner.nextInt();

        two = new ItemToPurchase();
        two.setName(itemName);
        two.setPrice(itemPrice);
        two.setQuantity(itemQuantity);


        System.out.println("\nTOTAL COST");
        System.out.println(one.getName()+" "+one.getQuantity()+" @ $"+one.getPrice()+" = $"+(one.getQuantity()*one.getPrice()));
        System.out.println(two.getName()+" "+two.getQuantity()+" @ $"+two.getPrice()+" = $"+(two.getQuantity()*two.getPrice()));

        System.out.println("\nTotal: $"+((one.getQuantity()*one.getPrice())+(two.getQuantity()*two.getPrice())));


    }
}
