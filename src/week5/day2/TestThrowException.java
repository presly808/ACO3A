package week5.day2;

public class TestThrowException {
  public static void main(String[] args) throws MyTestException {

    someMethod();

  }

  public static void someMethod() throws MyTestException{
    MyTestException exception = new MyTestException();

    if (Math.random() < 0.5) {
      throw exception;
    }

    System.out.println("Some message");
  }
}
