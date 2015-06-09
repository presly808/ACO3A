package week1.day1;

public class Human {
  private long id;
  private String name;
  private int age;


  public Human(){
    System.out.println("Human created");
  }

  public Human(String humanName){
    name = humanName;
  }

  public String asString() {
//    String result = "Name=" + name + ", age=" + age;
//    return result;
    return "Name=" + name + ", age=" + age + ", id=" + id;
  }

  public void hello() {
    System.out.println("Hello! My name is " + name);
  }

  public void setAge(int humanAge) {
    if(humanAge > 0) {
      age = humanAge;
    }
  }

  public void setName(String humanName) {
    name = humanName;
  }

  public void setId(long humanId) {
    id = humanId;
  }

  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }
}
