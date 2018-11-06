public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public void setSide(double side){
        setHeight(side);
        setWidth(side);
    }

    public double getSide(){
        return getWidth();
    }

    @Override
    public String toString() {
        return "Square{"+"side = "+getHeight()+"}";
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }
}
