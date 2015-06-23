package week3.day2.staticFinal;

public class TestPoint {
  public static void main(String[] args) {
    Point p1 = new Point(5,3);
    Point p3 = new Point(5,7);


    double result = getLineLength(p1, Point.ZERO_POINT);
    System.out.println(result);

    System.out.println(getLineLength(p3, p1));

  }

  public static double getLineLength(Point point1, Point point2){
    return Math.sqrt(Math.pow((point2.getX() - point1.getX()), 2)
                       + Math.pow((point2.getY() - point1.getY()), 2));
  }
}
