package week3.day1.geometry;

public class Rectangular extends Figure {
  private double width;
  private double length;

  public Rectangular(double width, double length) {
    this.width = width;
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public double getLength() {
    return length;
  }

  public double perimeter() {
    return (length + width) * 2;
  }
}
