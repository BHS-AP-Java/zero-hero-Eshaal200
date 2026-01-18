package edu.bhscs;

// Eshaal Khan
// P2
// ITERATION
// 10/28/2025

/*
 * DESCRIPTION: An iteration that prints out slices of cake (and quality of cake) based on what you
 * want INPUT: number of slices, whatever baker you want OUTPUT: cake based off of slices and baker
 * EDGE CASE: Quality?
 */

public class kake {
  // fields and properties

  public String flavor;
  public int slices;
  public String Flour;
  public String eggs;
  public String milk;
  public String menu;

  public int qualityMultiplier;

  public String colorCode = ASI.RESET;

  // constructors

  public kake(String giveAnswer, Flour f, int skill) {}

  // METHODS

  public void flavor() {
    System.out.println("this cake has..." + flavor);
  }

  // time to bake :")"
  public void bake() {
    System.out.println(" Lets bake the cake! " + flavor + " with " + slices + " slices yippeeee ");
  }

  public void Slices() {
    if (slices > 0) {
      slices--;
      System.out.println("Slice eaten! Slices left:" + slices);
    } else {
      System.out.println("no slices left of" + flavor + "cake :(((");
    }
  }

  public static void menu() {
    System.out.println(
        ASI.Chocolate
            + "Chocolate Cake"
            + ASI.RESET
            + ", "
            + ASI.Vanilla
            + "Vanilla Cake"
            + ASI.RESET
            + ", "
            + ASI.Strawberry
            + "Strawberry Cake"
            + ASI.RESET
            + ", "
            + ASI.RedVelvet
            + " Red Velvet Cake"
            + ASI.RESET
            + ", "
            + ASI.Mint
            + "Mint Cake"
            + ASI.RESET
            + ",");
  }

  public kake(String flavor, int slices, int qualityMultiplier) {
    this.flavor = flavor;
    this.slices = slices;
    this.qualityMultiplier = qualityMultiplier;

    applyColor();
  }

  public kake(String name, int age) {}

  public kake(String giveAnswer, String eggs, String flour, String milk, String flavor) {}

  public String getflavor() {
    return flavor;
  }

  public int getslices() {
    return slices;
  }

  public int getQualityMultiplier() {
    return qualityMultiplier;
  }

  private void applyColor() {
    switch (flavor.toLowerCase()) {
      case "chocolate cake":
        colorCode = ASI.Chocolate;
        break;
      case "vanilla cake":
        colorCode = ASI.Vanilla;
        break;
      case "strawberry cake":
        colorCode = ASI.Strawberry;
        break;
      case "red velvet cake":
        colorCode = ASI.RedVelvet;
        break;
      case "mint cake":
        colorCode = ASI.Mint;
        break;
      default:
        colorCode = ASI.RESET;
    }
  }

  // the draw method starts here :")

  public void Cakedraw() {
    int slicesDraw = Math.min(slices, 20);
    int sliceWidth = (slicesDraw > 12) ? 3 : 6;
    int spacing = 2;
    int triangleHeight = 3;
    int bodyHeight = qualityMultiplier * 2;

    int cols = slicesDraw * (sliceWidth * spacing);
    int rows = triangleHeight + bodyHeight + 1;

    char[][] canvas = new char[rows][cols];

    // 1. fill this canvas in with spaces

    for (int r = 0; r < rows; r++) for (int c = 0; c < cols; c++) canvas[r][c] = ' ';

    // triangle tops (icing)

    for (int s = 0; s < slicesDraw; s++) {
      int offset = s * (sliceWidth * spacing);

      for (int t = 0; t < triangleHeight; t++) {
        int start = offset + triangleHeight - t - 1;
        int end = offset + triangleHeight + t + 1;
        for (int c = start; c <= end && c < cols; c++) {
          canvas[t][c] = '/';
        }
      }
    }

    // draw the slices bodies

    for (int s = 0; s < slicesDraw; s++) {
      int offset = s * (sliceWidth * spacing);
      int topRow = triangleHeight;
      int bottomRow = topRow + bodyHeight;

      // bodiesssss

      for (int r = topRow; r < bottomRow && r < rows; r++)
        for (int c = offset; c < offset + sliceWidth && c < cols; c++) canvas[r][c] = '#';

      // bottom

      for (int c = offset; c < offset + sliceWidth && c < cols; c++) canvas[bottomRow][c] = '=';

      // right wall

      for (int r = topRow; r <= bottomRow && r < rows; r++) {
        int wallCol = offset + sliceWidth;
        if (wallCol < cols) canvas[r][wallCol] = '|';
      }
    }

    // print the cake
    System.out.println(
        "\nCake: "
            + flavor.toUpperCase()
            + " ("
            + slices
            + " slices, Q = "
            + qualityMultiplier
            + " )");
    for (int r = 0; r < rows; r++) {
      System.out.print(colorCode);
      for (int c = 0; c < cols; c++) System.out.print(canvas[r][c]);
      System.out.println(ASI.RESET);
    }
  }
}
