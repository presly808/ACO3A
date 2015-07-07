package util;

public class ArrayUtils {

  public static void sort(Comparable[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j].compareTo(array[j + 1]) > 0) {
          swapElements(array, j, j + 1);
        }
      }
    }
  }

  public static void swapElements(Object[] array, int index1, int index2) {
    Object temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }

  public static int binarySearch(int[] array, int target) {
    int start = 0;
    int end = array.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (target < array[mid]) {
        end = mid - 1;
      } else if (target > array[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    //return -1 if we didn't find element in array
    return -1;
  }

}
