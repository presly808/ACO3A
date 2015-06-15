package week2.day1;

public class FireDragon {
  private String name;
  private String color;
  private int age;

  private int damage;
  private int fireDamage;

  public FireDragon(String name, String color) {
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

  public int getFireDamage() {
    return fireDamage;
  }

  public void setFireDamage(int fireDamage) {
    this.fireDamage = fireDamage;
  }

  public void spitFire(){
    System.out.println("Dragon " + name + " spit with fire and do damage " + fireDamage);
  }
}
