package week4.day1;

public class TestLine {

  public static void main(String[] args) {
    Line l1 = new Line(6);
    Line l2 = new Line(6);

    System.out.println(l1.compareTo(l2));


    int resultOfComparation = l1.compareTo(l2);
    if (resultOfComparation < 0) {
      System.out.println("L1 less then L2");
    } else if(resultOfComparation >  0){
      System.out.println("L1 more then L2");
    } else {
      System.out.println("lines are equal");
    }
  }
}
