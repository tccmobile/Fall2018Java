import java.util.Scanner;

public class SumofExcess {
    public static void main (String [] args) {
        final int NUM_VALS = 4;
        int[] testGrades = new int[NUM_VALS];
        int i;
        int sumExtra = 0; // Assign sumExtra with 0 before your for loop

        testGrades[0] = 101;
        testGrades[1] = 83;
        testGrades[2] = 107;
        testGrades[3] = 90;

        /* Your solution goes here  */

       /* for (int j = 0; j < testGrades.length; j++) {
            if (testGrades[j]>100){
                sumExtra += (testGrades[j]-100);
            }
        }*/

        for (int test :
                testGrades) {
            if (test > 100) {
                sumExtra += (test - 100);
            }
        }

        for (int test2 :
                testGrades) {
            if (test2 > 100) {
                test2 = 0; // Does not change the array ONLY the temp value
            }
            }

        System.out.println("sumExtra: " + sumExtra);
    }
}