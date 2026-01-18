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

public class Main3 {

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

    // choose a cake
    kake.menu();
    String cakeChoice = player.giveAnswer("Which cake ya want");
    System.out.println("You chose " + cakeChoice);

    int slices = Integer.parseInt(player.giveAnswer("How many slices?"));
    if (slices > 20) {
      System.out.println("Whoa too many slices #DIABETESISCALLING (try again with less than 20) ");

      return;
    }



    kake cake = chosenBaker.bakeCake(cakeChoice, 3, 2, "all-purpose", slices);

    int totalPrice = chosenBaker.calculatedPrice(cake);

    System.out.println();
    System.out.println("please answer the following with yes/no ");
    System.out.println();

    String eggAllergy = player.giveAnswer("Are you allergic to eggs? ");
    String flourAllergy = player.giveAnswer("Are you allergic to flour? ");
    String milkAllergy = player.giveAnswer("Are you allergic to milk? ");

    chosenBaker.hasAllergies(eggAllergy, flourAllergy, milkAllergy);

    System.out.println();
    player.giveAnswer("Your cake is ready!: ");

    System.out.println("Flavor: " + cake.getflavor());
    System.out.println("Slices: " + cake.getslices());
    chosenBaker.IngredientsInfo();
    System.out.println();
    System.out.println("Quality multiplier: " + cake.getQualityMultiplier());
    System.out.println("Price: " + totalPrice + "$");

    cake.Cakedraw();
    System.out.println();
    System.out.println(
        "here is your "  + cakeChoice  + " baked by " + chosenBaker.name + " with a payment of " + totalPrice    + "$");
    System.out.println();
  }
}
