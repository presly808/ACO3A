package week5.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestReadFile {
  public static void main(String[] args) {

    String path = "/home/amakogon/ACO3_TestRead";
    FileInputStream inputStream = null;
    try {
      inputStream = new FileInputStream(path);

// Old version
/*      int symbol = inputStream.read();
      StringBuilder builder = new StringBuilder();

      while (symbol != -1) {
        builder.append(((char) symbol));
        symbol = inputStream.read();
      }

      System.out.println(builder);*/


      //New version
      StringBuilder builder = new StringBuilder();
      byte[] buffer = new byte[5];
      int readResult = inputStream.read(buffer);
      while (readResult != -1){
        for (int i = 0; i < readResult; i++) {
          builder.append(((char) buffer[i]));
        }
        readResult = inputStream.read(buffer);
      }
      System.out.println(builder);


    } catch (FileNotFoundException e) {
      System.err.println("Filepath is not valid");
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
