public class ch5Examples {

    public static void main(String arg[]) {

        // Enter  your code

      int[] itemCount = new int[3];

      itemCount[0] = 42;

      //System.out.println("itemCount = " + itemCount[0]);

     // itemCount[4] = 75; auto prevents us from writing onto memory we dont own

       /* for (int i = 0; i < itemCount.length; i++) {
            System.out.println("itemCount"+"["+i+"] = " + itemCount[i]);
        }*/


        String[] myStudents = new String[3];
        String[] moreStudents = new String[3];

        myStudents[0] = "Bob";
        myStudents[1] = "Joe";
        myStudents[2] = "Will";

        for (int i = 0; i < myStudents.length; i++) {
            System.out.println("myStudents = " + myStudents[i]);
        }

        moreStudents = myStudents.clone(); // copies the array

        System.out.println("Array assignment...");

        for (int i = 0; i < moreStudents.length ; i++) {
            System.out.println("moreStudents = " + moreStudents[i]);
        }

        myStudents[1] = "Sue";

        System.out.println("Original class...");

        for (int i = 0; i < myStudents.length; i++) {
            System.out.println("myStudents = " + myStudents[i]);
        }

        System.out.println("2nd class...");
        for (int i = 0; i < moreStudents.length ; i++) {
            System.out.println("moreStudents = " + moreStudents[i]);
        }

    }

}
