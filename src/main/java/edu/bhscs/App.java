package edu.bhscs;

public class App {

  // Eshaal Khan
  // P2
  // Centering cake on table
  // 10/31/2025

  /*
   * DESCRIPTION: Drawing a table that fits within whats in the app class AND a cake on top of it
   * INPUT: using modules, substring, padding, and iteration have the cake on the table. Padding was a way I used to center the
   * candles and cake on the table.
   * OUTPUT: a cake on a table
   * EDGE CASE: the number of candles, height of cake, height of table(?)
   * // NOTE: Candles arent totally centered I tried messing with the value as much as possible and even tried converting the
   * ints to doubles to use decimal values (it just removed the candles). 
   */

  public static void main(String[] args) {
    date10_31();
  }

  public static void date10_31() {
    Baker bob = new Baker("Bob");
    Table t = new Table(3, 15);
    Cake bDay = bob.bakes(5, "Suzzie");
    bDay.draw(t);
  }
}
