package edu.bhscs;

public class App {

  // Eshaal Khan
  // P2
  // CODE: Iteration with Methods on Objects
  // 10/22/2025

  /*
   * DESCRIPTION: the goal of my code today is to make a cake for name and age
   * INPUT: typing out name and age, and then drawing a cake for them
   * OUTPUT: a cake with a certain number of candles on it will be drawn
   * EDGE CASE: the candle count is based on the age number
   */

  public static void main(String[] args) {
    date_10_21();
  }

  public static void date_10_21() {

    // fields and properties

    // Player user = new Player("Usario P. Player");

    // constructors
    String name = "Eshaal";
    String ageInput = "9";

    // constructors

    int age = 0;

    try {

      age = Integer.parseInt(ageInput);
    } catch (NumberFormatException e) {
      System.out.println("Thats not a number! age automatically a 0.........baby...");
    }
    // methods
    Cake myCake = new Cake(name, age);
    myCake.Cakedraw("---------------", "///////////////");
  }
}
