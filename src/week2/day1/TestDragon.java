package week2.day1;

public class TestDragon {
  public static void main(String[] args) {
    Dragon greenDragon = new Dragon("Fluffy", "Green");
    greenDragon.fly();
    greenDragon.setDamage(300);
    greenDragon.attack();

    Dragon blackDragon = new Dragon("Dracula", "Black");
    blackDragon.setDamage(500);
    blackDragon.attack();

    FireDragon fireDragon = new FireDragon("Flower", "Gold");
    fireDragon.setDamage(150);
    fireDragon.setFireDamage(1000);
    fireDragon.spitFire();

//    greenDragon.spitFire();

  }
}
