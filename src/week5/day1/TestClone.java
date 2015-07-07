package week5.day1;

public class TestClone {

  public static void main(String[] args) {

    Cat cat = new Cat("Vasia");

    Cat clonedCat = null;
    try {
      clonedCat = ((Cat) cat.clone());
    } catch (CloneNotSupportedException ex) {
//      ex.printStackTrace();
    }

    System.out.println(cat);
    System.out.println(clonedCat);

  }
}
