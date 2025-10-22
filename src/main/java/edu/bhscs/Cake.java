package edu.bhscs;

public class Cake {

  // fields and properties

  String name;
  int age;
  
// constructor(?)

  public Cake(String name, int age) {
    this.name = name;
    this.age = age;
  }


  // methods + start of cake drawing

  public void Cakedraw(String x, String y) {
    int width = 10 + age; // cake width depends on age
    int height = 4;
    int candleCount = Math.min(age, 10);

    // candle flame *

    if (candleCount > 0) {
      int candleWidth = candleCount * 2 - 1;
      int start = (width - candleWidth) / 2;

      for (int i = 0; i < width; i++)
        if (i >= start && (i - start) % 2 == 0 && (i - start) / 2 < candleCount)
          System.out.print("*");
        else System.out.print(" ");

      System.out.println();

      // candle stick |

      for (int i = 0; i < width; i++)
        if (i >= start && (i - start) % 2 == 0 && (i - start) / 2 < candleCount)
          System.out.print("|");
        else System.out.print(" ");

      System.out.println();
    }

    // cake body

    for (int row = 0; row < height; row++) {
      System.out.print("*"); // left edge

      if (row == 0) {
        System.out.print(centerTextInLayer(x, width - 2)); // top layer text
      } else if (row == 1) {
        System.out.print(centerTextInLayer(y, width - 2)); // second layer text
      } else {
        for (int i = 0; i < width - 2; i++) System.out.print(" "); // empty rows
      }

      System.out.println("*"); // right edge
    }

    // cake bottpm

    for (int i = 0; i < width; i++) System.out.print("*");
    System.out.println();

    System.out.println("This cake is for... " + name + " who is " + age + " years old! ");
  }

  public String centerTextInLayer(String text, int layerWidth) {
    int padding = (layerWidth - text.length()) / 2;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < padding; i++) sb.append(" ");
    sb.append(text);
    for (int i = padding + text.length(); i < layerWidth; i++) sb.append(" ");
    return sb.toString();
  }

  // middle of the cake

}
