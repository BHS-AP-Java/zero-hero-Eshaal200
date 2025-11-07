package edu.bhscs;

public class Cake implements Offsetable {

  // properties
  String name;
  int age;
  int height = 5;
  int width = 10;
  int candles;

  // constructor
  public Cake(String name, int age) {
    this.name = name;
    this.age = age;
    this.candles = Math.min(age, 8);
  }

  public int getOffset(Table t) {
    if (t == null) return 0;
    int tableWidth = t.getWidth();
    int offset = (tableWidth - width) / 2;

    if ((tableWidth - width) % 2 != 0) {
      offset += 1;
    }
    return (Math.max(0, offset));
  }

  // main draw method
  public void draw(Table t) {
    int offset = getOffset(t);
    int candleSpacing = 2;
    int candleWidth = candles * candleSpacing - 1;
    int candleStart = (width - candleWidth) / 2;

    // candle flames
    System.out.print(" ".repeat(offset));
    for (int i = 0; i < width; i++) {
      if (i >= candleStart
          && (i - candleStart) % candleSpacing == 0
          && (i - candleStart) / candleSpacing < candles) System.out.print("*");
      else System.out.print(" ");
    }
    System.out.println();

    // candle sticks
    System.out.print(" ".repeat(offset));
    for (int i = 0; i < width; i++) {
      if (i >= candleStart
          && (i - candleStart) % candleSpacing == 0
          && (i - candleStart) / candleSpacing < candles) System.out.print("|");
      else System.out.print(" ");
    }
    System.out.println();

    // cake body
    for (int r = 0; r < height; r++) {
      System.out.print(" ".repeat(offset));
      System.out.print("*");
      for (int c = 0; c < width - 2; c++) {
        // Alternate icing lines using modulus
        System.out.print((r % 2 == 1) ? "=" : " ");
      }
      System.out.println("*");
    }

    // cake bottom icing line
    System.out.print(" ".repeat(offset));
    System.out.println("-".repeat(width));

    t.draw();
  }

  public void draw() {
    draw();
  }

  public int getWidth() {
    return width;
    // replace later
  }

  public void draw(Offsetable below) {}
}
