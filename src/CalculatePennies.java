public class CalculatePennies {
    // Returns number of pennies if pennies are doubled numDays times
    public static long doublePennies(long numPennies, int numDays) {
        long totalPennies;

        /* Your solution goes here  */
        if (numDays == 1){
            totalPennies = numPennies*2;
        }
        else {
            totalPennies = doublePennies((numPennies * 2), numDays - 1);
        }
        return totalPennies;
    }

    // Program computes pennies if you have 1 penny today,
// 2 pennies after one day, 4 after two days, and so on
    public static void main (String [] args) {
        long startingPennies;
        int userDays;

        startingPennies = 1;
        userDays = 10;
        System.out.println("Number of pennies after " + userDays + " days: "
                + doublePennies(startingPennies, userDays));
    }
}