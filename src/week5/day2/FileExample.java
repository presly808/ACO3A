package week5.day2;

import java.io.File;
import java.io.IOException;

public class FileExample {
  public static void main(String[] args) {
    File file = new File("/home/amakogon/CreatedFromJava");

    System.out.println(file.exists());
    System.out.println(file.getAbsolutePath());

    try {
      boolean created = file.createNewFile();
      System.out.println("Is created = " + created);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
