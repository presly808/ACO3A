package week3.day1.music;

public class Arena {
  public static void main(String[] args) {
    SongWriter songWriter = new Compositor();
    String shlyager = songWriter.writeSong();

    ISinger singer = new Bard();
    singer.sing(shlyager);
  }
}
