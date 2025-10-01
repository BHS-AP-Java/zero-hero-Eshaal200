package edu.bhscs;

public class Baker {
  // fields and properties
  // constructor
  // methods

  String name;
  public String flavor;
  public int slices;
  public String flour;
  public int eggs;
  public int milk;


  public Baker(String name) {
    this.name = name;
    return;
  }

  public Cake bakeCake(String flavor, int eggs, int milk, String frosting, int munchiesSlices) {
    System.out.println(name + " baked a " + flavor + " cake with " + munchiesSlices + " slices! ");
    return new Cake(flavor, 2, 3, frosting,  munchiesSlices );
  }
}
