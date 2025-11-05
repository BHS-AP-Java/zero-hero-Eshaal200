package edu.bhscs;

public class Table implements tableCake {
  // properties
  int legs;
  int width;
  String leg;
  String top;
  public int getWidth;

  // constrcutors
  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
    this.leg = "|";
    this.top = "~";
  }

  // methods

  public void setLegs(String leg) {
    this.leg = leg;
  }

  public void setTop(String top) {
    this.top = top;
  }

  public void draw(int legs, int width) {}

  public int getWidth() {
    return this.width;
  }

  public void drawTable() {
    setTop("=");
    setLegs("|");
  }

  public void draw() {
    // Substring implementation
    StringBuilder pattern = new StringBuilder();
    for (int i = 0; i < width; i++) pattern.append(top);

    System.out.println(pattern.substring(0, width));

    // you need atleast 2 legs, anything less will print this message
    if (legs < 2) {
      System.out.println("You need at least 2 legs for a table!");
      return;
    }

    // sets height and also makes sure the top of the table doesnt hang out when typing a # of legs
    // bigger than 3
    int spacing = width / legs;

    int legHeight = 3;

    // table body with the % module
    // can print multiple legs
    for (int row = 0; row < legHeight; row++) {
      StringBuilder line = new StringBuilder();
      for (int col = 0; col < width; col++) {
        if (col % spacing == 0) {
          line.append(leg);
        } else {
          line.append(" ");
        }
      }
      System.out.println(line.toString());
    }
  }
}
