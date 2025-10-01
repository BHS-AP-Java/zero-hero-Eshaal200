package edu.bhscs;

public class Flour {
  // types
  int price;
  int lbs;
  int quality;

  // constructor
  public Flour(int price, int lbs, int quality) {
    this.price = price;
    this.lbs = lbs;
    this.quality = 5;
  }

  // method
  public void goesBad() {
    this.quality = 0;
  }
}
