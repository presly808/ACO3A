package week5.day1;

public class TestClone {

  public static void main(String[] args) throws CloneNotSupportedException {

    Cat cat = new Cat("Vasia");

    Cat clonedCat = ((Cat) cat.clone());

    System.out.println(cat);
    System.out.println(clonedCat);



  }
}
