package edu.bhscs;

// this is the class baker, we want the baker to know who he is and how to make cake.
// a class needs three things in it. Fields and properties, a constructor, and a method.
public class Bakers {

  public String flavor;
  public int slices;
  public String flourIngredients = "flour";
  public String eggsIngredients = "eggs";
  public String milkIngredients = "milk";
  public int qualityMultiplier; // the field
  public int price;

  Player p;
  String name;
  int skill;
  int costUpgrade;

  // fields and properties
  // constructor
  // methods
  kake bakeCake(
      Player p, String flour, String milk, String eggs, int price, int slices, String flavor) {
    this.p = p;
    this.flourIngredients = flour;
    this.eggsIngredients = eggs;
    this.milkIngredients = milk;
    this.price = price;
    this.slices = slices;
    this.flavor = flavor;

    return new kake(p.giveAnswer("What cake ya want?"), eggs, flour, milk, flavor);
  }

  // this is the fields, we have public String fields of flavor and flour and name
  // our ints are milk, slices, and eggs

  // we put the string name into a constructor, now name has the instructions of what it should do
  public Bakers(Player player) {
    this.name = "unamed baker";
    return;
  }

  Bakers(String name, int skill, int costUpgrade) {
    this.name = name;
    this.skill = skill;
    this.costUpgrade = costUpgrade;
  }

  // this is our method, we are giving life to our types, now they know what to do in the terminal.
  // this is all done in a constructor, note: the types must go in the correct order that it was
  // made in or else it will not wor

  public kake bakeCake(String flavor, int eggs, int milk, String flour, int slices) {
    System.out.println(
        name
            + " (Skill "
            + skill
            + ") is baking a "
            + flavor
            + " cake with "
            + slices
            + " slices...");

    int qualityMultiplier = 1 + (skill - 1) * 2;

    return new kake(flavor, slices, qualityMultiplier);
  }

  //
  public int calculatedPrice(kake cake) {
    int cakePrice = 4;
    return (cakePrice * cake.getslices() * cake.getQualityMultiplier()) + costUpgrade;
  }


  public void hasAllergies(String eggAllergy, String flourAllergy, String milkAllergy) {

    if (eggAllergy.equalsIgnoreCase("yes")) {
      eggsIngredients = "Yogurt (subsitute)";
    }

    if (flourAllergy.equalsIgnoreCase("yes")) {
      flourIngredients = "almond flour (subsitute)";
    }

    if (milkAllergy.equalsIgnoreCase("yes")) {
      milkIngredients = "sweetened condensed milk (subsitute)";
    }
  }

  public void IngredientsInfo() {
    System.out.println("Ingredients: ");
    System.out.println();
    System.out.println(eggsIngredients);
    System.out.println(flourIngredients);
    System.out.println(milkIngredients);
  }

  public int getskill() {
    return skill;
  }

  public int costUpgrade() {
    return costUpgrade;
  }

  public int getQualityMultiplier() {
    return qualityMultiplier;
  }
}
