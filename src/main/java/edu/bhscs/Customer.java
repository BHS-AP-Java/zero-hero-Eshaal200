package edu.bhscs;

public class Customer {
  String name;

  public Customer(String name) {
    this.name = name;
    return;
  }

  public void eatCake(Cake cake, PTSA ptsa) {
    System.out.println(name + " is buying a slice... ");
    System.out.println(name + " ate a slice of " + cake.flavor + " cake! ");
    cake.Slices();
    ptsa.recieveMoney(2.0);
  }

  public int pay(int price) {
    return price;
  }

  public void takeCake(Cake bakeCake) {}
}
