package week4.day1;

public class Line implements Comparable<Line> {
  private int length;

  public Line(int length) {
    this.length = length;
  }

  public int getLength() {
    return length;
  }

  @Override
  public int compareTo(Line line) {
//    int res = 0;
//    if (this.length > line.length) {
//      res = 1;
//    } else if (this.length < line.length) {
//      res = -1;
//    }
//    return res;
    return this.length > line.length ? 1 :
      this.length < line.length ? -1 : 0;
  }
}
