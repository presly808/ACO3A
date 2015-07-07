package week4.day1;

import week2.day1.MyNumber;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {
  public static void main(String[] args) {

    MyNumber[] numbers = new MyNumber[5];
    numbers[0] = new MyNumber(15);
    numbers[1] = new MyNumber(30);
    numbers[2] = new MyNumber(3);
    numbers[3] = new MyNumber(-25);
    numbers[4] = new MyNumber(7);

    System.out.println(Arrays.toString(numbers));
//    sort(numbers);
//    ArrayUtils.sort((numbers));
//    System.out.println(Arrays.toString(numbers));


    Arrays.sort(numbers, new Comparator<MyNumber>() {
      @Override
      public int compare(MyNumber o1, MyNumber o2) {
        if(o1.getValue() > o2.getValue()) {
          return -1;
        } else if (o1.getValue() < o2.getValue()){
          return 1;
        }        
        return 0;
      }
    });
    System.out.println(Arrays.toString(numbers));

  }


  //do not use that
  public static void sort(MyNumber[] numbers) {
    for (int i = 0; i < numbers.length - 1; i++) {
      for (int j = 0; j < numbers.length - 1 - i; j++) {
        if (numbers[j].compareTo(numbers[j + 1]) > 0) {
          MyNumber temp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
        }
      }
    }
  }


}
