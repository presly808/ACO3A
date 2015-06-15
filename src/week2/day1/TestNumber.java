package week2.day1;

public class TestNumber {
  public static void main(String[] args) {
    MyNumber n1 = new MyNumber(5);
    System.out.println(n1.asString());
    MyNumber n2 = new MyNumber(3);
    n1.addNumber(n2);
    System.out.println(n1.asString());


    MyNumber n3 = new MyNumber(10);
    MyNumber n4 = new MyNumber(10);
//    if (n3 == n4) {
//      System.out.println("They are equal");
//    }
    if (n3.isSame(n4)) {
      System.out.println("They are equal");
    }

  }
}
