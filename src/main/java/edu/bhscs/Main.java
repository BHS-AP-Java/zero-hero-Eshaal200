// Eshaal Khan
// P2
// Bake Sale
// 9/29/2025

/*
 * DESCRIPTION: the goal of my bakesale is to make, bake, and frost cakes for npcs to enjoy.
 * INPUT: baking cool cakes
 * // code must contain a baker, a customer, and the dontation of money to PTSA
 * OUTPUT: some cakes that are gonna be comsumed
 * EDGE CASE: (I dont really understand what a edge case is :")")
 */
// this is an example of 'char' constant
// because it is global, it should be capitalised

package edu.bhscs;

import java.util.Scanner;

class Main {

  // public static String pushup(String food) {
  //  return "sweat" + food;
  // }

  // scanner input
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.println();
    System.out.println();
    System.out.println();
    // objects defined (characters)
    System.out.println("The baker is here time to make cakes!");
    Baker baker = new Baker("Mr. Smith");
    Customer aliyah = new Customer("aliyah");
    Customer jeanna = new Customer("jeanna");
    PTSA ptsa = new PTSA();
    // using the baker class to execute making a cake
    Cake chocolateCake = baker.bakeCake("Chocolate", 6, 3, "vanilla", 6);
    Cake vanillaCake = baker.bakeCake("Vanilla", 8, 3, "chocolate", 5);
    System.out.println("cakes has been made for eating!:");
    System.out.println();
    System.out.println("\n Press Enter to frost the cakes");
    System.out.println();
    scanner.nextLine();
    chocolateCake.yummyFrosting();
    vanillaCake.yummyFrosting();
    // using the type munchiesSlices to execute the class customers eating cake
    System.out.println("\n Munch on some slices......heh");
    scanner.nextLine();
    System.out.println();
    aliyah.eatCake(chocolateCake, ptsa);
    System.out.println();
    System.out.println("Aliyah donated to the PTSA!");
    System.out.println();
    scanner.nextLine();
    aliyah.eatCake(vanillaCake, ptsa);
    System.out.println();
    System.out.println("Aliyah donated to the PTSA!");
    System.out.println();
    scanner.nextLine();
    jeanna.eatCake(chocolateCake, ptsa);
    System.out.println();
    System.out.println(" Jeanna donated to the PTSA!");
    System.out.println();
    scanner.nextLine();
    jeanna.eatCake(chocolateCake, ptsa);
    System.out.println();
    System.out.println("Jeanna donated to the PTSA!");
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
