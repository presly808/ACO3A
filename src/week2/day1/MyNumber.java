package week2.day1;

public class MyNumber {
  private int value;

  public MyNumber(int value){
    this.value = value;
  }

  public void addNumber(MyNumber number){
    value = value + number.value;
  }

  public String asString(){
    return value + "";
  }

  public boolean isSame(MyNumber number){
    return value == number.value;
  }
}
