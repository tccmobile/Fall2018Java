import java.util.ArrayList;

public class ShapeTester {

    public static void main(String arg[]) {

        // Enter  your code
        //Shape one = new Shape();
        Circle two = new Circle(5);
        Rectangle three = new Rectangle(6,8);
        Square four = new Square(12);
        Triangle five = new Triangle();
        ArrayList<newShape> myShapes = new ArrayList<newShape>();

       // myShapes.add(one);
        myShapes.add(two);
        myShapes.add(three);
        myShapes.add(four);
        myShapes.add(five);

       /* System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);*/

       double area, perimeter;

        for (int i = 0; i <myShapes.size() ; i++) {
            System.out.println(myShapes.get(i));
            area = myShapes.get(i).getArea();
            perimeter = myShapes.get(i).getPerimeter();
            System.out.println("Area = "+area+" Perimeter = "+perimeter);
            System.out.println();
        }




    }
}
