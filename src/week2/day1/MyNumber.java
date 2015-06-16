package week2.day1;

public class MyNumber {
  private int value;

  public MyNumber() {

  }

  public MyNumber(int value) {
    this.value = value;
  }

  public void addNumber(MyNumber number) {
    value = value + number.value;
  }

  public String asString() {
    return value + "";
  }

  public boolean isSame(MyNumber number) {
    return value == number.value;
  }

  public String toString() {
    return value + "";
  }

  public boolean equals(MyNumber number) {
    return value == number.value;
  }
}
