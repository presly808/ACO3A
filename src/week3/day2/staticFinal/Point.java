package week3.day2.staticFinal;

public final class Point {
  private final int x;
  private final int y;

  public static final Point ZERO_POINT = new Point(0,0);

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

}
