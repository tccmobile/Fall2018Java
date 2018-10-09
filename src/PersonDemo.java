public class PersonDemo {

    public static void main(String arg[]) {

        // Enter  your code
        Person one = new Person();

        one.Print();
        System.out.println("one = " + one);

        one.setName("Bob");
        one.setAge(42);
        //one.name = "Carl";

       one.Print();

       Person two = new Person("Sue");

       two.Print();
       two.setAge(17);
       two.Print();


       Person three = new Person("Carl",80);
       three.Print();
       three.setName("Carla");
       three.Print();


    }
}
