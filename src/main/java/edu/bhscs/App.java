package edu.bhscs;

public class App {

  // Eshaal Khan
  // P2
  // drawing a table
  // 10/28/2025

  /*
   * DESCRIPTION: Drawing a table that fits within whats in the app class
   * INPUT: drawing using 4 loops in the table class (iteration)
   * OUTPUT: a very very simple table (will probably be altered to look more like a table later)
   * EDGE CASE: I still kinda dont know what an edge case is
   */

  public static void main(String[] args) {
    date10_28();
  }

  public static void date10_28() {
    Baker bob = new Baker("Bob");
    Table t = new Table(3, 15);
    Cake bDay = bob.bakes(5, "Suzzie");
    bDay.draw(t);


  }
}
