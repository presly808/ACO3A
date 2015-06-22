package week3.day1.music;

public class Bard implements ISinger, SongWriter {

  @Override
  public void sing(String song) {
    System.out.println("Super puper singer:" + song);
  }

  @Override
  public String writeSong() {
    return "Bla bla bla";
  }
}
