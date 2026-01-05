package edu.bhscs;

public class cup implements Offsetable {

  int height = 4;
  int width = 15;

  void draw() {
    this.draw(null);
  }

  // rim of the cup
  public void draw(Offsetable below) {
    for (int i = 0; i < width; i++) {
      System.out.print("-");
    }
    System.out.println();

    // length of the cup
    for (int i = 0; i < height; i++) {
      System.out.print("|");

      // spacing
      for (int c = 0; c < width - 2; c++) {
        System.out.print(" ");
      }
      System.out.println("|");
      System.out.println();
    }

    // bottom of the cup
    for (int i = 0; i < width; i++) {
      if (height < width) {
        System.out.print("-");
      } else {
        System.out.print("");
      }
    }

    System.out.println();
  }

  public int getWidth() {
    return width;
  }
}
