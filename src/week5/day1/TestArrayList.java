package week5.day1;

public class TestArrayList {
  public static void main(String[] args) {
    int listSize = 2;
    MyArrayList list = new MyArrayList(listSize);
    list.add("5");
    list.add("6");
    list.add("17");
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));


    list.add(2);

    System.out.println("Two = " + list.get(3));

    Integer i1 = 2;
    int a = i1;








  }
}
