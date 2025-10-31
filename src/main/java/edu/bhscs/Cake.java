package edu.bhscs;

// Eshaal Khan
// P2
// ITERATION
// 10/28/2025

/*
 * DESCRIPTION: An iteration that prints out slices of cake (and quality of cake) based on what you want
 * INPUT: number of slices, whatever baker you want
 * OUTPUT: cake based off of slices and baker
 * EDGE CASE: Quality?
 */

public class Cake {
  // fields and properties

  public String flavor;
  public int slices;
  public String Flour;
  public int eggs;
  public int milk;
  public String menu;
  public int price;
  public boolean frosting;
  public int qualityMultiplier;

  // constructors

  public Cake(String flavor, int eggs, int milk, String flour, int slices) {
    this.flavor = flavor;
    this.eggs = eggs;
    this.milk = milk;
    this.Flour = flour;
    this.frosting = false;
    this.slices = slices;
  }

  // public Cake(String answer, Flour f) {

  // }

  // public Cake(String giveAnswer) {

  // }

  public Cake(String giveAnswer, Flour f, int skill) {}

  // METHODS
  void draw(Table t) {
    System.out.println("I am drawing a cake");
  }

  public void flavor() {
    System.out.println("this cake has..." + flavor);
  }

  // time to bake :")"
  public void bake() {
    System.out.println(" Lets bake the cake! " + flavor + " with " + slices + " slices yippeeee ");
  }

  public void Frosting() {
    if (frosting) {
      frosting = true;
    } else {
      System.out.println(" This " + flavor + "cake has frosting! ");
    }
  }

  public void Slices() {
    if (slices > 0) {
      slices--;
      System.out.println("Slice eaten! Slices left:" + slices);
    } else {
      System.out.println("no slices left of" + flavor + "cake :(((");
    }
  }

  public String menu() {
    System.out.println(
        "Strawberry cake, Rubarb cake, Red velvet cake, Chocolate cake, Vanilla cake");
    return menu;
  }

  public void server() {
    System.out.println(
        "serving " + flavor + "cake! " + (frosting ? "with frosting " : "without frosting "));
  }

  public Cake(String flavor, int slices, int qualityMultiplier) {
    this.flavor = flavor;
    this.slices = slices;
    this.qualityMultiplier = qualityMultiplier;
    this.price = slices * 2 * qualityMultiplier;
  }

  public Cake(String name, int age) {}

  public String getflavor() {
    return flavor;
  }

  public int getslices() {
    return slices;
  }

  public int getPrice() {
    return Math.round(price * 100) / 100;
  }

  public int getQualityMultiplier() {
    return qualityMultiplier;
  }

  // the draw method starts here :")

  public void Cakedraw() {
    int sliceWidth = 6;
    int spacing = 2;
    int triangleHeight = 3;
    int bodyHeight = qualityMultiplier * 2;

    int cols = slices * (sliceWidth * spacing);
    int rows = triangleHeight + bodyHeight + 1;

    char[][] canvas = new char[rows][cols];

    // 1. fill this canvas in with spaces

    for (int r = 0; r < rows; r++) for (int c = 0; c < cols; c++) canvas[r][c] = ' ';

    // triangle tops (icing)

    for (int s = 0; s < slices; s++) {
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

    for (int s = 0; s < slices; s++) {
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
      for (int c = 0; c < cols; c++) System.out.print(canvas[r][c]);
      System.out.println();
    }
  }
}
