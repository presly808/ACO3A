package week1.day2;

import week1.day1.Human;

import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    Human human = new Human();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter name");
    String name = scanner.next();
    System.out.println("Enter age");
    int age = scanner.nextInt();

    human.setAge(age);
    human.setName(name);

    sellAlcohol(human);
  }

  public static void sellAlcohol(Human human) {
    if (human.getAge() > 21) {
      System.out.println("Take your vodka");
    } else {
      System.out.println("Go home");
    }
  }
}
