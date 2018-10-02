
public class PizzaArea {

    public static double printPizzaArea(double pizzaDiameter, String pizzaType) {
       // double pizzaDiameter;
        double pizzaRadius;
        double pizzaArea;
        double piVal = 3.14159265;

        //pizzaDiameter = 12.0;
        pizzaDiameter *= 2;
        pizzaType = "Supreme";
        //pizzaType = pizzaType.toUpperCase();
        pizzaRadius = pizzaDiameter / 2.0;
        pizzaArea = piVal * pizzaRadius * pizzaRadius;
        System.out.print(pizzaDiameter + " inch "+pizzaType+" pizza is ");
        System.out.println(pizzaArea + " inches squared.");

        return pizzaDiameter;
    }

    public static void main (String [] args) {

        double pizzaDiameter = 15.0;
        double newDiameter = 0.0;
        String pizzaType  = "Cheese";

        newDiameter = printPizzaArea(pizzaDiameter,pizzaType);
        printPizzaArea(pizzaDiameter);
       // printPizzaArea(pizzaDiameter); no receiver so value is lost


       /* System.out.println("pizzaDiameter = " + pizzaDiameter);
        System.out.println("newDiameter = " + newDiameter);
        System.out.println("pizzaType = " + pizzaType);*/


        return;
    }

    private static double printPizzaArea(double pizzaDiameter) {
        double pizzaRadius;
        double pizzaArea;
        double piVal = 3.14159265;

        //pizzaDiameter = 12.0;
        pizzaDiameter *= 2;

        //pizzaType = pizzaType.toUpperCase();
        pizzaRadius = pizzaDiameter / 2.0;
        pizzaArea = piVal * pizzaRadius * pizzaRadius;
        System.out.print(pizzaDiameter + " inch Cheese pizza is ");
        System.out.println(pizzaArea + " inches squared.");

        return pizzaDiameter;
    }
}