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

  // I passed the kake object as a parameter in the cakePrice method to use its properties slices
  // and qualityMultiplier. I also use the costUpgrade from the baker class to add to slices *
  // multiplier. I did not pass slices and qualityMultiplier as parameters because that would
  // duplicate information and would be just duplicate information. So let's start with the
  //
  // parameter kake. This is a class with properties that I need. I first declared slices as an int
  // in kake. It is stored as an integer. Then in the constructors, I do this.slices = slices; the
  // reason why I do this is because I am storing it as memory. this.slices is where slices are
  // stored and now kake remembers how many slices the user asked for, it is stored memory. Same
  // with qualityMultiplier, I first declared it into kake, and I stored that as an int too. Then I
  // wrote this.qualityMultiplier = qualityMultiplier; this is so the memory of qualityMultiplier is
  // remembered by kake and won’t call some random number or no number at all, it will call the
  // number the user inputs.

  // Then I use it in the method cakePrice. Methods are like what happens in
  // the background. It's like how I move my hand to get a drink of water, there are neurons firing
  // messages that I need to pick up my hand and then pick up the drink. So since I need cakePrice I
  // need to multiply the amount of cake slices with quality multiplier PLUS the costUpgrade for
  // each baker.
  
  // This wont happen in main 3 because main 3 is where you implement the method, where
  // you call it. Going back to the brain/human analogy, this is me physically picking up the water.
  // It is the output of my neurons firing to pick up my water. So when I think about it I pick my
  // water. The main codespace is me thinking (where we call our method) and the terminal is the
  // action doing it, so then the price is finally displayed. (with print-lns of course).

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
