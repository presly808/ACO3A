package week3.day1;

public class IntArray {

  private int[] elements;
  private static final int INT_ARRAY_DEFAULT_SIZE = 32;

  public IntArray(){
    elements = new int[INT_ARRAY_DEFAULT_SIZE];
  }

  public IntArray(int size) {
    elements = new int[size];
  }

  public void add(int value, int index) {
    elements[index] = value;
  }

  public int get(int index){
    return elements[index];
  }

  public String toString() {
    String result = "{";
    for (int i = 0; i < elements.length - 1; i++) {
      result += elements[i] + ", ";
    }
    result += elements[elements.length - 1] + "}";
    return result;
  }
}
