package week5.day1;

public interface MyList {

  boolean add(Object object);

  Object get(int index);

  int size();

  Object remove(int index);

  Object[] toArray();
}
