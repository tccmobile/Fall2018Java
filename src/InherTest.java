import java.util.ArrayList;

public class InherTest {

    public static void main(String arg[]) {

        // Enter  your code
        Person one = new Person("will", 51);

        one.setAge(52);

        //System.out.println(one);

        Student two = new Student();

        //System.out.println(two);

        Student three = new Student("john",42,3.5);

        //System.out.println(three);

        ArrayList<Person> world = new ArrayList<Person>();
        world.add(one);
        world.add(two);
        world.add(three);

        Person four =  new Person("Bob",17);
        world.add(four);
        four.eat("sushi");
        two.eat("pizza");

       // three.withdraw();
       // four.withdraw(); not defined for Person class

        /*for (int i = 0; i < world.size(); i++) {
            //System.out.println(world.get(i));
            world.get(i).eat("fruit");
            //world.get(i).withdraw(); collection type is Person method doesn't exist in that class
        }*/

        ArrayList<Student> classroom = new ArrayList<Student>();
        classroom.add(two);
        classroom.add(three);
        /*for (int i = 0; i < classroom.size(); i++) {
            //System.out.println(world.get(i));
            //world.get(i).eat("fruit");
            classroom.get(i).withdraw();
        }*/

        ArrayList<Object> universe = new ArrayList<Object>();

        universe.add("Hello World");
        universe.add(new Integer("42"));
        universe.add(new Double(3.14));
        universe.add(two);
        universe.add(four);

        /*for (int i = 0; i < universe.size() ; i++) {
            System.out.println(universe.get(i));
        }*/

        //one.name = "nobody"; works if attribute is "protected" but not private

        Course java = new Course("Intro to Java",classroom);

        System.out.println(java.getTitle());

        for (int i = 0; i < java.getStudents().size(); i++) {
            java.getStudents().get(i).eat("sushi");
        }

    }
}
