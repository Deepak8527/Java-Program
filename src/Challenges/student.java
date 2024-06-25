package Challenges;

import java.io.Console;

public class student {
  public static void main(String[] args) {
    Console c = System.console();
    c.printf("enter the marks b/w 0 and 100: \n");
    int marks = Integer.parseInt(c.readLine());

  }
}
