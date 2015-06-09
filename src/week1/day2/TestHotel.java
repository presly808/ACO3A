package week1.day2;

import week1.day1.Human;

public class TestHotel {
  public static void main(String[] args) {
    Hotel hotel = new Hotel();

    Human human1 = new Human();
    human1.setName("Petro");
    human1.setAge(19);

    Human human2 = new Human();
    human2.setName("Anka");
    human2.setAge(18);

    hotel.addVisitor(human1);
    hotel.addVisitor(human2);

    hotel.showVisitors();
  }
}
