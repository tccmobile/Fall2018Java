abstract public class Shape {

    abstract public double getArea();

    abstract public double getPerimeter();

    @Override
    public String toString(){
        return "I'm a shape!";
    }
}
