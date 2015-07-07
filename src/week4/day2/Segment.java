package week4.day2;

public class Segment {
  private Point pointA;
  private Point pointB;

  public Segment(double x1, double x2, double y1, double y2) {
    this.pointA = new Point(x1, y1);
    this.pointB = new Point(x2, y2);
  }

  public double getX1() {
    return pointA.getX();
  }

  public double getX2() {
    return pointB.getX();
  }

  public double getY1() {
    return pointA.getY();
  }

  public double getY2() {
    return pointB.getY();
  }

  public double length() {
    return 0;
  }

  public static class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
      this.x = x;
      this.y = y;
    }

    public double getX() {
      return x;
    }

    public double getY() {
      return y;
    }

    public String toString() {
//      return "x=" + x + ", y=" + y;
      return String.format("x=%f, y=%f", x, y);
    }


  }


}
