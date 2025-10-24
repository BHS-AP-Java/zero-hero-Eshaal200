package edu.bhscs;

public class App {

  // Eshaal Khan
  // P2
  // CODE: Iteration with Methods on Objects
  // 10/22/2025

  /*
   * DESCRIPTION: the goal of my code today is to make a cake for name and age and flavor and icing
   * you can eat some slices and it will shrink the cake
   * INPUT: typing out name, age, flavor, and icing and then drawing a cake for them
   * OUTPUT: a cake with a certain number of candles on it will be drawn
   * EDGE CASE: the candle count is based on the age number
   */

  public static void main(String[] args) {
    date_10_23();
  }

  public static void date_10_23() {

    // fields and properties

    // Player user = new Player("Usario P. Player");

    // constructors
    String name = "Eshaal";
    String ageInput = "7";
    String flavor = "chocolate";
    String icing = "vanilla";

    // flavors you can do: vanilla, strawberry, red velvet, mint ---- same for icing

    // constructors

    // DISCLAIMER --- yes I did use the lazy version of the scanner for this

    int age = 0;

    try {

      age = Integer.parseInt(ageInput);
    } catch (NumberFormatException e) {
      System.out.println("Thats not a number! age automatically a 0.........baby...");
    }
    // methods
    Cake myCake = new Cake(name, age, flavor, icing);
    int slicesEaten = 0;
    int fullHeight = 7;

    myCake.Cakedraw(slicesEaten);

    // Scanner scanner = new Scanner(System.in);

    while (slicesEaten < fullHeight) {
      System.out.println("\n press enter to eat a slice...");
      String theStringINeed = "the user said something"; // scanner.nextLine();
      slicesEaten++;

      // slices getting eaten

      if (slicesEaten >= fullHeight) {
        System.out.println("\nOh no! You ate all the cake");
        myCake.Cakedraw(fullHeight);
        break;

      } else {
        myCake.Cakedraw(slicesEaten);
      }
    }

    // scanner.close();
  }
}
