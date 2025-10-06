package edu.bhscs;

public class Bakery {

  // fields and properties
  String menu = "Chocolate Cake, Strawberry cake, Rubarb cake";
  Baker baker;
  String name;
  Cake chocolate;
  Cake strawberry;
  Cake rubarb;
  int money;
  int quality = 5;

  // constructors
  public Bakery() {
    System.out.println(menu);
    this.money = 5;
  }

  // methods
  public void higheraBaker(Baker b) {
    this.baker = b;
  }

  // method
  public Cake sellCakes(int money) {
    this.money += money;
    Cake cakeBox = this.chocolate;
    this.chocolate = null;
    return cakeBox;
  }
}
