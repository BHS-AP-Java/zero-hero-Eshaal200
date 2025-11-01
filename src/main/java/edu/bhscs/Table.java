package edu.bhscs;

public class Table implements tableCake {
  // properties
  int legs;
  int width;
  String leg;
  String top;

  // constrcutors
  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
    this.leg = "|";
    this.top = "~";

  }



  public void setLegs(String leg) {
    this.leg = leg;
  }

  public void setTop(String top) {
    this.top = top;
  }

  public void draw(int legs, int width) {}

  // methods

  public void drawTable() {
    setTop("=");
    setLegs("|");
  }

  public void draw() {
    // Substring implementation
    StringBuilder pattern = new StringBuilder();
    for (int i = 0; i < width; i++) pattern.append(top);

    System.out.println(pattern.substring(0, width));

    // table body with the % module

    for (int row = 0; row < legs; row++) {
      for (int cols = 0; cols < width; cols++) {
        if (cols == 0 || cols == width - 1) {
          System.out.print(leg);
        } else if (row == 0 && cols % 2 == 0) {
          System.out.print("~");
        } else {
          System.out.print(" ");
        }
      }

      System.out.println();
    }
  }
}
