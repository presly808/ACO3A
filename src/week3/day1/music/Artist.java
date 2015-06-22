package week3.day1.music;

public class Artist implements ISinger {

  @Override
  public void sing(String song) {
    System.out.println("Sings: " + song);
  }
}
