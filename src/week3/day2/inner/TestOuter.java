package week3.day2.inner;

public class TestOuter {
  public static void main(String[] args) {
    Outer outer = new Outer();

    Outer.Inner innerInstance = outer.new Inner();
    innerInstance.setInnerField(6);
    innerInstance.innerMethod();


    Outer.Nested nestedInstance = new Outer.Nested();

  }
}
