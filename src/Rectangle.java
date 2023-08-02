public class Rectangle extends Figure {
    double width;
    double length;
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    @Override
    public double getPerimeter() {
        double perimeter = 2*width + 2*length;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = width * length;
        return area;
    }

}
