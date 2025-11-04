package edu.bhscs;

public class Cake implements tableCake {

  // properties
  String name;
  int age;
  int height = 5;
  int width = 10;
  int candles;

  // constructor
  public Cake(Table t, String name, int age) {
    this.name = name;
    this.age = age;
    this.candles = Math.min(age, 5);
  }

  // methods
  public void draw(Table t) {
    if (t == null) return;

    // offset to center cake on table
    int offset = (t.width - width) / 2;
    if (offset < 0) offset = 0;

    // candle spacing
    int candleSpacing = 2;
    int candleWidth = candles * candleSpacing - 1;
    int candleStart = (width - candleWidth) / 2;

    // --- candle flames ---
    for (int i = 0; i < offset; i++) System.out.print(" ");
    for (int i = 0; i < width; i++) {
      if (i >= candleStart
          && (i - candleStart) % candleSpacing == 0
          && (i - candleStart) / candleSpacing < candles) System.out.print("*");
      else System.out.print(" ");
    }
    System.out.println();

    // --- candle sticks ---
    for (int i = 0; i < offset; i++) System.out.print(" ");
    for (int i = 0; i < width; i++) {
      if (i >= candleStart
          && (i - candleStart) % candleSpacing == 0
          && (i - candleStart) / candleSpacing < candles) System.out.print("|");
      else System.out.print(" ");
    }
    System.out.println();

    // --- cake body ---
    for (int r = 0; r < height; r++) {
      for (int i = 0; i < offset; i++) System.out.print(" ");
      System.out.print("*");
      for (int c = 0; c < width - 2; c++) System.out.print((r % 2 == 1) ? "=" : " ");
      System.out.println("*");
    }

    // --- cake bottom icing line ---
    for (int i = 0; i < offset; i++) System.out.print(" ");
    for (int i = 0; i < width; i++) System.out.print("-");
    System.out.println();

    // draw table
    t.draw();
  }

  @Override
  public void draw() {}
}
