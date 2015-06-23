package week3.day2.staticFinal;

import week2.day1.Dragon;
import week2.day2.IceDragon;
import week3.day1.geometry.Circle;
import week3.day1.geometry.Figure;

public class TestSecurity {

  public static void main(String[] args) {
    Figure figure = new Circle(24);

    Dragon dragon = new IceDragon("Icy", "White");

    dragon = new BadDragon("BadBoy", "Black");

    //somewhere in the code
    dragon.fly();

  }
}
