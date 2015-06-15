package week2.day1;

import java.util.Date;

public class TestDate {
  public static void main(String[] args) {
    Date date = new Date();
    Date date2 = new Date(143438100560L);
    System.out.println(date);
    System.out.println(date2);

    if(date.getTime() > date2.getTime()) {
      System.out.println();
    }
  }
}
