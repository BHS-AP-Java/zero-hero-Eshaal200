package edu.bhscs;

public class Baker {
  // properties and fields
  Player p;
  Flour f;
  Store placeOfWork;
  int cash;
  String name;
  int skill;

  // CONSTRUCTOR
  public Baker(String name) {
    this.name = name;
  }

  public Baker(Player p) {
    this.p = p;
  }

  // METHODS

  void takeOrder(int price, Customer c) {
    cash += c.pay(price);
    c.takeCake(bakeCake());
  }

  public void learn(int amount) {
    this.skill += amount;
  }

  kake bakeCake() {
    String answer = this.p.giveAnswer("what cake do you want?");

    if (this.skill < 0) {
      System.out.println("Sorry! you get a bad cake");
    } else if (this.skill > 0) {
      System.out.println("Wow! You get a great cake");
    } else {
      System.out.println("you get an okay cake");
    }

    return new kake(answer, this.f, this.skill);
  }

  void takeJob(Store bakery) {
    String doYouWantToWorkHere = this.p.giveAnswer("Do you want to work at " + bakery.getName());
    if (doYouWantToWorkHere.equals("y")) {
      this.placeOfWork = bakery;
      System.out.println(this.name + " now works at " + bakery.getName());
    }
  }

  public Cake bakes(int age, String name) {

    return new Cake(null, name, age);
  }
}
