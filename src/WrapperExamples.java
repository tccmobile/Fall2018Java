public class WrapperExamples {

    public static void main(String arg[]) {

        // Enter  your code
        int num = 42;

        Integer myNum = 42;

        Integer myNum2 = new Integer(17);


        System.out.println(num);
        System.out.println(myNum);
        System.out.println(myNum2.toString());
        System.out.println(myNum2.intValue());

        int total = 5 + myNum.intValue();


        System.out.println("total = " + total);

    }
}
