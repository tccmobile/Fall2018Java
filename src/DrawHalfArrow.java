import java.util.Scanner;

public class DrawHalfArrow {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int arrowBaseHeight;
        int arrowBaseWidth;
        int arrowHeadWidth;

        System.out.println("Enter arrow base height:");
        arrowBaseHeight = scnr.nextInt();

        System.out.println("Enter arrow base width:");
        arrowBaseWidth = scnr.nextInt();

        System.out.println("Enter arrow head width:");
        arrowHeadWidth = scnr.nextInt();
        System.out.println("");

        // Draw arrow base (height = 3, width = 2)
        System.out.println("**");
        System.out.println("**");
        System.out.println("**");

        // Draw arrow head (width = 4)
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
}