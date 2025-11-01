package edu.bhscs;

import java.util.ArrayList;

public class bakery {

  // fields and properties
  String menu = "Chocolate Cake, Strawberry cake, Rubarb cake, Vanilla cake";
  Bakers baker;
  String name;
  kake chocolate;
  kake strawberry;
  kake rubarb;
  int money;
  int quality = 5;
  public ArrayList<kake> Cakes;
  Chocolate Vanilla;

  // constructors

  public bakery(String name) {
    this.name = name;
    this.Cakes = new ArrayList<>();
  }

  public bakery() {
    System.out.println(menu);
    this.money = 5;
  }

  // methods
  public void higheraBaker(Bakers b) {
    this.baker = b;
  }

  // method
  public kake sellCakes(int money) {
    this.money += money;
    kake cakeBox = this.chocolate;
    this.chocolate = null;
    return cakeBox;
  }

  public void Bakery(String name) {
    this.name = name;
    this.Cakes = new ArrayList<>(); // initialize the list
    this.money = 5;
  }

  public void addCake(kake c) {
    this.Cakes.add(c);
    System.out.println(c.getflavor() + " cake has been added to the bakery!");
  }

  public void hireBaker(Bakers baker) {
    throw new UnsupportedOperationException("Unimplemented method 'hireBaker'");
  }

  public void showCakes() {
    throw new UnsupportedOperationException("Unimplemented method 'showCakes'");
  }
}
