// Eshaal Khan
// P2
// Bake Sale
// 9/29/2025

/*
 * DESCRIPTION: the goal of my bakesale is to make, bake, and frost cakes for npcs to enjoy.
 * INPUT: baking cool cakes
 * // code must contain a baker, a customer, and the dontation of money to PTSA
 * OUTPUT: some cakes that are gonna be comsumed
 * EDGE CASE: they all are all edge cases
 */
// this is an example of 'char' constant
// because it is global, it should be capitalised

package edu.bhscs;

import java.util.Scanner;

class Main {

  // public static String pushup(String food) {
  //  return "sweat" + food;
  // }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // System.out.println("A");
    // System.out.println(pushup("Garlic"));
    // System.out.println(pushup("Garlic"));
    // System.out.println(pushup("Garlic"));
    // System.out.println(pushup("Garlic"));
    // System.out.println(pushup("Garlic"));
    // System.out.println("");
    // System.out.println("chocolate");

    // pushup("Garlic");
    // pushup("Garlic");
    // pushup("Garlic");
    // System.out.println();
    // pushup("Garlic");
    // pushup("Garlic");
    // pushup("Garlic");
    // pushup("Garlic");
    // pushup("Garlic");
    // pushup("Garlic");

    // Awesome steve = new Awesome("Steve");

    // ignore all of this

    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("The baker is here time to make cakes!");
    Baker baker = new Baker("Mr. Smith");
    Customer alice = new Customer("Alice");
    Customer bob = new Customer("Bob");
    PTSA ptsa = new PTSA();
    Cake chocolateCake = baker.bakeCake("Chocolate", 6);
    Cake vanillaCake = baker.bakeCake("Vanilla", 8);
    System.out.println("cakes has been made for eating!:");
    System.out.println();
    System.out.println("\n Press Enter to frost the cakes");
    System.out.println();
    scanner.nextLine();
    chocolateCake.yummyFrosting();
    vanillaCake.yummyFrosting();
    System.out.println("\n Munch on some slices......heh");
    scanner.nextLine();
    System.out.println();
    alice.eatCake(chocolateCake, ptsa);
    System.out.println();
    System.out.println("Alice donated to the PTSA!");
    System.out.println();
    scanner.nextLine();
    alice.eatCake(vanillaCake, ptsa);
    System.out.println();
    System.out.println("Alice donated to the PTSA!");
    System.out.println();
    scanner.nextLine();
    bob.eatCake(chocolateCake, ptsa);
    System.out.println();
    System.out.println(" Bob donated to the PTSA!");
    System.out.println();
    scanner.nextLine();
    bob.eatCake(chocolateCake, ptsa);
    System.out.println();
    System.out.println("Bob donated to the PTSA!");
    System.out.println();
    scanner.nextLine();
    System.out.println("\n Press enter to serve more slices...");
    scanner.nextLine();
    chocolateCake.server();
    System.out.println();
    vanillaCake.server();
    System.out.println();
    scanner.close();
  }
}
