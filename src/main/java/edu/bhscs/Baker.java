package edu.bhscs;

public class Baker {
  // fields and properties
  // constructor
  // methods

  String name;

  public Baker(String name) {
    this.name = name;
    return;
  }

  public Cake bakeCake(String flavor, int munchiesSlices) {
    System.out.println(name + " baked a " + flavor + " cake with " + munchiesSlices + " slices! ");
    return new Cake(flavor, munchiesSlices);
  }
}
