package week2.day1;

public class Dragon {
  private String name;
  private String color;
  private int age;

  private int damage;
  private int fireDamage;

  public Dragon(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public void attack() {
    System.out.println("Dragon " + name + " is attacking with damage " + damage);
  }

  public void fly() {
    System.out.println("Dragon " + name + " is flying");
  }

}
