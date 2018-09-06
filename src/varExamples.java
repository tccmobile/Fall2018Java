import java.util.Random;

public class varExamples {

    public static void main(String args[]){

        final double PI = 3.14;

        Random myRandom = new Random();

        int myInt;
        double myDouble = 3.14;
        float myFloat = 1.2f;
        boolean myBool = true;
        char myChar = 'x';
        String myName = "Will";

        myInt = 42;


//        System.out.println("myInt = " + myInt);
//        System.out.println("myFloat = " + myFloat);
//        System.out.println("myDouble = " + myDouble);
//        System.out.println("myBool = " + myBool);
//        System.out.println("myName = " + myName);
//        System.out.println("myChar = " + myChar);
//        System.out.println(myName.length());
//        System.out.println("PI = " + PI);

          int numerator = 7;
          int denominator = 2;

          double answer = (double)numerator/denominator;

        System.out.println("Result of division is "+ answer);

        System.out.println("Square root of 81 is "+ Math.sqrt(81.0) );
        System.out.println("25 cubed is "+Math.pow(25.0,3.0));

        System.out.println("mesquite in your cellar".replace('e', 'o'));

        System.out.println("A random number is "+((Math.abs(myRandom.nextInt()%11))+100));

        


    }
}
