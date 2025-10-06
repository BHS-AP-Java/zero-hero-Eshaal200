package edu.bhscs;

// this is the class baker, we want the baker to know who he is and how to make cake.
// a class needs three things in it. Fields and properties, a constructor, and a method.
public class Baker {
  // fields and properties
  // constructor
  // methods

  // this is the fields, we have public String fields of flavor and flour and name
  // our ints are milk, slices, and eggs
  String name;
  public String flavor;
  public int slices;
  public String flour;
  public int eggs;
  public int milk;

  // we put the string name into a constructor, now name has the instructions of what it should do
  public Baker(String name) {
    this.name = name;
    return;
  }

  // this is our method, we are giving life to our types, now they know what to do in the terminal.
  // this is all done in a constructor, note: the types must go in the correct order that it was
  // made in or else it will not wor

  public Cake bakeCake(String flavor, int eggs, int milk, String frosting, int munchiesSlices) {
    System.out.println(
        name
            + " baked a "
            + flavor
            + " cake with "
            + munchiesSlices
            + " slices! "
            + "Made with.. "
            + eggs
            + " eggs "
            + " and "
            + milk
            + " cups of milk ");
    return new Cake(flavor, 2, 3, frosting, munchiesSlices);
  }
}
