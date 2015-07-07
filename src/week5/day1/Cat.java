package week5.day1;

public class Cat implements Cloneable{
  private String name;
  private int age;

  public Cat(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }


  @Override
  public String toString() {
    return "Cat{" +
      "name='" + name + '\'' +
      ", age=" + age +
      '}';
  }
}
