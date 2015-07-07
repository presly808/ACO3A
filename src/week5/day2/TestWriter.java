package week5.day2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class TestWriter {
  public static void main(String[] args) throws IOException {
    String path = "/home/amakogon/ACO3_TestRead";

    PrintWriter printWriter = new PrintWriter(new FileOutputStream(path, true));
//    printWriter.write("Test message");
    printWriter.append("Hello");
    printWriter.flush();





  }
}
