package edu.bhscs;

// this is the class baker, we want the baker to know who he is and how to make cake.
// a class needs three things in it. Fields and properties, a constructor, and a method.
public class Bakers {

  public String flavor;
  public int slices;
  public String flour;
  public int eggs;
  public int milk;
  public int qualityMultiplier; // the field

  Player p;
  String name;
  int skill;
  int costUpgrade;

  // fields and properties
  // constructor
  // methods
  Cake2 bakeCake(Player p) {
    this.p = p;
    return new Cake2(p.giveAnswer("What cake ya want?"), eggs, eggs, flavor, eggs);
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

  public Cake2 bakeCake(String flavor, int eggs, int milk, String flour, int slices) {
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

    return new Cake2(flavor, slices, qualityMultiplier);
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
