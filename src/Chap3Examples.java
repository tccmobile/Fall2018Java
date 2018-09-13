import java.util.Scanner;

public class Chap3Examples {

    public static void main(String args[]){

        Scanner scnr = new Scanner(System.in);
        String userInput;

        int myAge = 23;
        int numChildren = 1;

        if ((myAge >= 60) && (numChildren<=2)){
            System.out.println("You are close to retirement");
        } else {
            System.out.println("You still have to go to work!");
        }


        myAge = 75;

        if ((myAge >= 60) && (numChildren<=2)){
            System.out.println("You are close to retirement");
        } else {
            System.out.println("You still have to go to work!");
        }

        System.out.println("Please enter your name: ");
        userInput = scnr.nextLine();

       // String userInput2 = scnr.next();
       // String userInput3 = scnr.next();

        System.out.println("Your name is: "+userInput);
       // System.out.println("userInput2 = " + userInput2);
      //  System.out.println("userInput3 = " + userInput3);

        if (userInput.indexOf("Smith")!=-1){
            System.out.println("There are a lot of you!");
        } else {
            System.out.println("At least you are not a Smith");
        }



    }
}
