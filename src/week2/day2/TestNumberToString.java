package week2.day2;

import week2.day1.MyNumber;

public class TestNumberToString {
  public static void main(String[] args) {
    MyNumber n1 = new MyNumber(10);
    System.out.println("My number = " + n1.toString());
    System.out.println(n1);


    MyNumber n2 = new MyNumber(10);

    System.out.println(n2.equals(n1));
  }
}
