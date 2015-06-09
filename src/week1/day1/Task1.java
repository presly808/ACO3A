package week1.day1;

public class Task1 {
  public static void main(String[] args) {
    int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    arr = rotate(arr);
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int[][] rotate(int[][] matrix) {
    int[][] rotatedMatrix = new int[matrix.length][matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        rotatedMatrix[j][matrix.length - 1 - i] = matrix[i][j];
      }
    }
    return rotatedMatrix;
  }
}
