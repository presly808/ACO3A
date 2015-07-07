package week2.day1;

public class MyNumber implements Comparable<MyNumber> {
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

  @Override
  public int compareTo(MyNumber number) {
    return this.value > number.value ? 1 :
      this.value < number.value ? -1 : 0;
  }

  public int getValue() {
    return value;
  }
}
