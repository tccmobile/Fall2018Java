import java.util.Scanner;

public class ch4Examples {

    public static void main(String arg[]){


        Scanner scnr = new Scanner(System.in);

        int count = 0;
        char userChoice = 'z';

       /* while (count<=9){
            System.out.println("count = " +count );
            count++;
        }*/

        /*System.out.println("Please enter a letter. q to quit."); // priming the pump
        userChoice = scnr.next().charAt(0);


        while (userChoice!='q'){ // q is a sentinal
            System.out.println("userChoice = " + userChoice);
            System.out.println("Please enter a letter. q to quit.");
            userChoice = scnr.next().charAt(0);
        }*/


        do {
            System.out.println("Please enter a letter. q to quit.");
            userChoice = scnr.next().charAt(0);
            if (userChoice=='@'){
                break;
            }
            if (userChoice=='?'){
                continue;
            }
            if (userChoice!='q') {
                System.out.println("userChoice = " + userChoice);
            }
        } while (userChoice!='q');


       /* for (int myCount = 0; myCount < 9; myCount++) {
            System.out.println("myCount = " + myCount);
        }*/

        /*for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.println("Row = "+row+" Col = "+ col);
            }
        }*/
    }
}
