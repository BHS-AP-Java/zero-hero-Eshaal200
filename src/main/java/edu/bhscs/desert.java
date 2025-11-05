package edu.bhscs;

public class desert {

  // fields and properties

  String name;
  int age;
  String flavor;
  String icing;
  String s;
  int n;
  Table t;

  // constructor(?)

  public desert(String name, int age, String flavor, String icing) {
    this.name = name;
    this.age = age;
    this.flavor = flavor;
    this.icing = icing;
  }

  public desert(String s, int n) {
    this.s = s;
    this.n = n;
  }

  // methods + start of cake drawing

  public void Cakedraw(int slicesEaten) {
    int width = 10 + age;
    int fullHeight = 7;
    int remainingHeight = Math.max(fullHeight - slicesEaten, 1);
    int candleCount = Math.min(age, 15);

    // colors!

    // cake flavor/color

    String cakeColor, icingColor;
    switch ((flavor.toLowerCase())) {
      case "chocolate":
        cakeColor = "\u001B[38;2;110;38;14m";
        break; // brown
      case "vanilla":
        cakeColor = "\u001B[37m";
        break;
      case "strawberry":
        cakeColor = "\u001B[35m";
        break;
      case "red velvet":
        cakeColor = "\u001B[31m";
        break;
      case "mint":
        cakeColor = "\u001B[32m";
        break;
      default:
        cakeColor = "\u001B[38;2;110;38;14m"; // brown default
        break;
    }

    // icing color

    switch (icing.toLowerCase()) {
      case "chocolate":
        icingColor = "\u001B[33m";
        break;
      case "vanilla":
        icingColor = "\u001B[97m";
        break;
      case "strawberry":
        icingColor = "\u001B[95m";
        break;
      case "red velvet":
        icingColor = "\u001B[91m";
        break;
      case "mint":
        icingColor = "\u001B[92m";
        break;
      default:
        icingColor = "\u001B[96m";
        break;
    }

    // candle color

    String candleColor = "\u001B[93m"; // bright yellow
    String reset = "\u001B[0m";

    // candle flame *

    if (candleCount > 0) {
      int candleWidth = candleCount * 2 - 1;
      int start = (width - candleWidth) / 2;

      System.out.print(candleColor);
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

    System.out.println(reset);

    // cake body

    System.out.print(icingColor);
    for (int i = 0; i < width; i++) System.out.print("/");
    System.out.println(reset);

    for (int row = 0; row < remainingHeight; row++) {
      System.out.print(cakeColor + "*");

      boolean isIcing = (row % 2 == 1);

      for (int col = 0; col < width - 2; col++) {
        System.out.print(isIcing ? icingColor + "=" + cakeColor : cakeColor + " ");
      }
      System.out.println(cakeColor + "*" + reset);
    }

    // cake bottom

    System.out.print(cakeColor);

    for (int i = 0; i < width; i++) System.out.print("*");
    System.out.print(reset);
    System.out.println();

    System.out.println("This cake is for... " + name + " who is " + age + " years old! ");
  }
}
