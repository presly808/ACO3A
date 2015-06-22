package week3.day1;

import java.util.Scanner;

public class ScannerTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter age");
    int age = sc.nextInt();
    System.out.println("Enter name");
//    sc.nextLine();
    String name = sc.nextLine();

    System.out.println("Age = " + age + ", name = " + name);


  }
}
