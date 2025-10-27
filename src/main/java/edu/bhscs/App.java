package edu.bhscs;

public class App {

  // Eshaal Khan
  // P2
  // Errors, Encapsulation, and Signatures
  // 10/27/2025

  /*
   * DESCRIPTION: we fixed errors on this coe given to us. We had to fix where baker was defined, how to implement a draw method for the table in cake
   * and what the baker is baking
   * INPUT: made a new Table class, and defined baker and draw in Cake.
   * OUTPUT: We havent exactly done any iteration to make a drawing in the terminal yet.
   * EDGE CASE: I dont exactly know what an edge case is yet.
   */

  public static void main(String[] args) {
    date10_27();
  }

  public static void date10_27() {
    Baker bob = new Baker("Bob");
    Table t = new Table(3, 15);
    Cake bDay = bob.bakes(5, "Suzzie");
    bDay.draw(t);
  }
}