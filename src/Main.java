public class Main {
    public static void main(String[] args) {

        ex1();
    }

    static void ex1(){
        Triangle triangle = new Triangle(3,4,5);//Arraylist <Figure> figures = new ArrayList<>();figures.add(new Triangle(1,2,3))
        double perimeter = triangle.getPerimeter();
        double area = triangle.getArea();
        System.out.println("Периметр треугольника равен " + perimeter);
        System.out.println("Площадь треугольника равна " + area);

        Triangle triangle1 = new Triangle(1,1,1);
        double perimeter1 = triangle1.getPerimeter();
        double area1 = triangle1.getArea();
        System.out.println("Периметр второго треугольника равен " + perimeter1);
        System.out.println("Площадь второго треугольника равна " + area1);

        Rectangle rectangle = new Rectangle(4,6);
        double perimeter2 = rectangle.getPerimeter();
        double area2 = rectangle.getArea();
        System.out.println("Периметр прямоугольника равна " + perimeter2);
        System.out.println("Площадь прямоугольника равна " + area2);

        Figure[] figures = new Figure[3];
        figures[0] = triangle;
        figures[1] = triangle1;
        figures[2] = rectangle;
        double finalArea = 0;
        for (int i = 0; i < figures.length; i++) {
            finalArea = finalArea + figures[i].getArea();
        }
        System.out.println("Общая площадь фигур равна " + finalArea);
    }
}