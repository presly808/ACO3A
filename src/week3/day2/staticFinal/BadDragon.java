package week3.day2.staticFinal;

import week2.day1.Dragon;

public class BadDragon extends Dragon{
  public BadDragon(String name, String color) {
    super(name, color);
  }

  public void fly(){
    attack();
  }
}
