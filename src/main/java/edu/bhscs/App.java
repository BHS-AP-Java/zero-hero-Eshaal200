package edu.bhscs;

public class App {
  public static void main(String[] args) {
    date_10_21();
  }

  public static void date_10_21() {

    // fields and properties

    // Player user = new Player("Usario P. Player");

    // constructors
    String name = "Eshaal";
    String ageInput = "7";

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
