public class Triangle extends Figure {
    double firstSide;
    double secondSide;
    double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        super();
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;

    }

    @Override
    public double getPerimeter() {
        double perimeter = firstSide + secondSide + thirdSide;
        return perimeter;
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter()/2;
        double area = Math.sqrt(halfPerimeter*(halfPerimeter-firstSide)*(halfPerimeter-secondSide)*(halfPerimeter-thirdSide));
        return area;
    }
}
