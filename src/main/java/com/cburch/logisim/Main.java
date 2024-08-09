package com.cburch.logisim;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    try (FileOutputStream fos = new FileOutputStream("/Users/hutchens/testOutput.txt")) {
      String text = "It seems to work!\n";
      byte[] myBytes = text.getBytes();
      fos.write(myBytes);
      fos.close();
    } catch (IOException ex) {

    }
  }
}
