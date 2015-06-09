package week1.day2;

import week1.day1.Human;

public class Ex2 {
  public static void main(String[] args) {
    Human human = new Human();
    human.setName("Andrew");
    human.setAge(25);
    human.setId(12334324);
    System.out.println(human.asString());


    System.out.println(human.getName());
  }
}
