package edu.bhscs;

public class Cake implements tableCake {

  //properties
  String name;
  int age;
  int height = 5;
  int width = 10;
  int candles;




  //constructors

  public Cake(Table t, String name, int age) {

        this.name = name;
        this.age = age;
        this.candles = Math.min(age, 5);
  }




// methods

public void draw(Table t) {
        if (t == null) return;

        int padding = (t.width - width) / 2;
        if (padding < 0)
          padding = 0;

          //candle centering

          int candleSpacing = 2; // one space between candles
          int candleWidth = candles * candleSpacing + 1;
          int candleStart = padding + (width - candleWidth) / 2;


        // candle flames
        // candle flames
        for (int i = 0; i < padding; i++)
          System.out.print(" ");
        for (int i = 0; i < width; i++) {
          if (i >= candleStart && (i - candleStart) % 2 == 0 && (i - candleStart) / 2 < candles)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.println();

        // candle sticks
        for (int i = 0; i < padding; i++)
          System.out.print(" ");
        for (int i = 0; i < width; i++) {
          if (i >= candleStart && (i - candleStart) % 2 == 0 && (i - candleStart) / 2 < candles)
            System.out.print("|");
          else
            System.out.print(" ");
        }
        System.out.println();

        // cake body
        for (int r = 0; r < height; r++) {
          for (int i = 0; i < padding; i++)
            System.out.print(" ");
          System.out.print("*");
          for (int c = 0; c < width - 2; c++)
            System.out.print((r % 2 == 1) ? "=" : " ");
          System.out.println("*");
        }

        // cake top icing line
        for (int i = 0; i < padding; i++)
          System.out.print(" ");
        for (int i = 0; i < width; i++)
          System.out.print("-");
        System.out.println();

        t.draw();
}




@Override
public void draw() {

}



}


