package edu.bhscs;

public class Cake {
  // I have to make a constructor

  public String flavor;
  public int slices;
  Flour flour;
  public boolean frosting;

  public Cake(String flavor, int slices) {
    this.flavor = flavor;
    this.slices = slices;
    this.frosting = false;
  }



  public void flavor() {
    System.out.println("This cake was made with" + flour + "this cake has..." + flavor);
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
