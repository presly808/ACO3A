package week2.day2;

public class TestIceDragon {
  public static void main(String[] args) {
    IceDragon iceDragon = new IceDragon("name", "title");
    iceDragon.setName("Sub-zero");
    iceDragon.setDamage(350);
    iceDragon.attack();

    iceDragon.setIceDamage(1500);
    iceDragon.freeze();

//    Dragon ordinaryDragon = new Dragon();
//    ordinaryDragon.setIceDamage();
  }
}
