package week5.day1;

import java.util.Arrays;

public class MyArrayList implements MyList{

  private static final int DEFAULT_CAPACITY = 16;

  private Object[] elements;
  private int index;

  public MyArrayList() {
    this(DEFAULT_CAPACITY);
  }

  public MyArrayList(int capacity) {
    elements = new Object[capacity];
  }

  public boolean add(Object object) {
    ensureCapacity();
    elements[index++] = object;
    return true;
  }

  private void ensureCapacity() {
    if (index >= elements.length) {
      elements = Arrays.copyOf(elements, index * 2);
    }
  }

  public Object get(int index) {
    return elements[index];
  }

  public int size() {
    return index;
  }

  @Override
  public Object remove(int index) {
    return null;
  }
}
