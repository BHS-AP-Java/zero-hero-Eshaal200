package edu.bhscs;

public class Cake2 {
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

  public Cake2(String flavor, int eggs, int milk, String flour, int slices) {
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

  public Cake2(String giveAnswer, Flour f, int skill) {}

  // METHODS
  void draw() {
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

  public Cake2(String flavor, int slices, int qualityMultiplier) {
    this.flavor = flavor;
    this.slices = slices;
    this.qualityMultiplier = qualityMultiplier;
    this.price = slices * 2 * qualityMultiplier;
  }

  public Cake2() {}

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
    int baseWidth = slices * 2;
    int height = qualityMultiplier * 2;
    int cols = (baseWidth + 10) * 2;
    int rows = height + 10;

    char[][] canvas = new char[rows][cols];

    for (int r = 0; r < rows; r++)
      for (int c = 0; c < cols; c++)
        canvas[r][c] =
            ' '; // AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
    // anyways this makes rows

    for (int sliceNum = 0; sliceNum < 2; sliceNum++) {
      int sliceOffset = sliceNum * (baseWidth + 10); // horizontal hotdog style of both slices :P

      // frosting was a pain to code but was simplified
      int frostingHeight = 3;
      double m = -0.5;
      int currentTopRow = 1;
      int stepRightAnchor = baseWidth + sliceOffset - 1;
      for (int f = 0; f < frostingHeight; f++) {
        int width = baseWidth / 2 + f;
        int xRight = stepRightAnchor;
        int xLeft = Math.max(sliceOffset, xRight - width);
        double b = currentTopRow - m * xRight;
        for (int x = xLeft; x <= xRight; x++) {
          int y = (int) Math.round(m * x + b);
          if (y >= 0 && y < rows && x >= 0 && x < cols) {
            canvas[y][x] = '/';
          }
        }

        currentTopRow++;
        stepRightAnchor++;
      }
      // this is the body of the cake
      int cakeTop = currentTopRow + 1;
      int cakeBottom = cakeTop + height;
      int leftEdge = sliceOffset + 2;
      for (int r = cakeTop; r < cakeBottom && r < rows; r++)
        for (int c = leftEdge; c < leftEdge + baseWidth && c < cols; c++) canvas[r][c] = '#';

      // bottom part of the cake (with body)
      int baseRow = Math.min(rows - 1, cakeBottom);
      for (int c = leftEdge; c < leftEdge + baseWidth; c++) canvas[baseRow][c] = '=';

      // right side of this cake (part of body)
      for (int r = cakeTop - 1; r <= baseRow; r++) {
        int wallCol = leftEdge + baseWidth;
        if (wallCol < cols) canvas[r][wallCol] = '|';
      }
    }

    // Print canvas
    System.out.println(
        "\n cake!!!!!  " + flavor.toUpperCase() + " yummy!! (" + slices + " slices each)");
    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols; c++) System.out.print(canvas[r][c]);
      System.out.println();
    }
  }
}
