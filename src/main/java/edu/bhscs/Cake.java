package edu.bhscs;

public class Cake {
  // fields and properties

  public String flavor;
  public int slices;
  public String flour;
  public int eggs;
  public int milk;

  public boolean frosting;

  // constructors

  public Cake(String flavor, int eggs, int milk, String flour, int slices) {
    this.flavor = flavor;
    this.eggs = eggs;
    this.milk = milk;
    this.flour = flour;
    this.frosting = false;
    this.slices = slices;
  }

  public void flavor() {
    System.out.println("this cake has..." + flavor);
  }

  // time to bake :")"
  public void bake() {
    System.out.println(" Lets bake the cake! " + flavor + " with " + slices + " slices yippeeee ");
  }

  public void yummyFrosting() {
    if (frosting) {
      frosting = true;
    } else {
      System.out.println(" This " + flavor + "cake has frosting! ");
    }
  }

  public void munchiesSlices() {
    if (slices > 0) {
      slices--;
      System.out.println("Slice eaten! Slices left:" + slices);
    } else {
      System.out.println("no slices left of" + flavor + "cake :(((");
    }
  }

  public void server() {
    System.out.println(
        "serving " + flavor + "cake! " + (frosting ? "with frosting " : "without frosting "));
  }

  public String getFlavor() {
    return flavor;
  }
}
