package week4.day2;

import util.ArrayUtils;

public class TestBinarySearch {
  public static void main(String[] args) {
    int[] sortedNums = {1, 5, 18, 23, 23, 68, 90};

    int res = ArrayUtils.binarySearch(sortedNums, 18);
  }
}
