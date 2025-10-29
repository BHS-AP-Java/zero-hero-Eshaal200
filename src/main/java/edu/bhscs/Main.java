// Eshaal Khan
// P2
// ITERATION
// 10/28/2025

/*
 * DESCRIPTION: An iteration that prints out slices of cake (and quality of cake) based on what you
 * want INPUT: number of slices, whatever baker you want OUTPUT: cake based off of slices and baker
 * EDGE CASE: Quality?
 */

package edu.bhscs;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    System.out.println("Welcome to Baking Goods!");

    // player input

    Player player = new Player("User");

    Bakers baker1 = new Bakers("Mr. Smith", 1, 0);
    Bakers baker2 = new Bakers("Mrs. Aimee", 2, 20);
    Bakers baker3 = new Bakers("Mr. John", 3, 40);
    ArrayList<Bakers> bakers = new ArrayList<>();
    bakers.add(baker1);
    bakers.add(baker2);
    bakers.add(baker3);

    System.out.println("Bakers available:");
    for (Bakers b : bakers) {
      System.out.println(
          "- " + b.name + " (Skill " + b.getskill() + ", upgrade cost $" + b.costUpgrade() + ")");
    }

    String bakersChoice = player.giveAnswer("Which baker would you like to hire?");
    Bakers chosenBaker = bakers.get(0); // default to the first baker

    System.out.println("Bakers available");
    for (Bakers b : bakers) {
      if (b.name.equalsIgnoreCase(bakersChoice)) {
        chosenBaker = b;
        break;
      }
    }

    System.out.println("You hired " + chosenBaker.name + "!\n");

    ArrayList<Cake2> bakedCakes = new ArrayList<>();
    // choose a cake
    System.out.println(
        "Available Cakes: Chocolate cake, Vanilla cake, Strawberry Cake, Rubarb Cake ");
    String cakeChoice = player.giveAnswer("Which cake ya want");
    System.out.println("You chose " + cakeChoice);

    int slices = Integer.parseInt(player.giveAnswer("How many slices?"));
    Cake2 cake = chosenBaker.bakeCake(cakeChoice, 3, 2, "all-purpose", slices);

    System.out.println("Your cake is ready!");
    System.out.println("Flavor: " + cake.getflavor());
    System.out.println("Slices: " + cake.getslices());
    System.out.println("Quality multiplier: " + cake.getQualityMultiplier());
    System.out.println();

    cake.Cakedraw();
  }
}
