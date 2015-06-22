package week3.day1.geometry;

public class TestFigure {
  public static void main(String[] args) {
    Circle circle = new Circle(2);
    System.out.println(circle.perimeter());

    Rectangular rectangular = new Rectangular(2,3);
    System.out.println(rectangular.perimeter());


    System.out.println("Rectangular " + FigureHelper.perimeter(rectangular));
    System.out.println("Circle " + FigureHelper.perimeter(circle));

    Figure figure = new Circle(5);

    Triangle triangle = new Triangle();
    System.out.println(FigureHelper.perimeter(triangle));

  }
}
