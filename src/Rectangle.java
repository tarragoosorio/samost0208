public class Rectangle extends Figure {
    double width, length;
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    @Override
    public double getPerimeter() {
        return 2*width + 2*length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

}
