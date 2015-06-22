package week3.day1.geometry;

public class Circle extends Figure {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public double perimeter() {
    return 2 * Math.PI * radius;
  }


}
