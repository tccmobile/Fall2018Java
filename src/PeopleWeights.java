import java.util.Scanner;

public class PeopleWeights {

    public static void main(String arg[]) {

        // Enter  your code
        double[] myWeights = new double[5];
        Scanner scnr = new Scanner(System.in);
        double total =0;
        double maxWeight = 0;

        for (int i = 0; i < myWeights.length ; i++) {
            System.out.println("Enter weight "+(i+1)+":");
            myWeights[i] = scnr.nextDouble();
            total += myWeights[i];
            if (myWeights[i]>maxWeight){
                maxWeight = myWeights[i];
            }
        }

        System.out.print("You entered: ");

        for (double weight :
                myWeights) {
            System.out.print(weight+" ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Total weight: "+total);
        System.out.println("Average weight: "+(total/5));
        System.out.println("Max weight: "+maxWeight);

    }
}
