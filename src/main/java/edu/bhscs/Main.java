package edu.bhscs;

public class Main {

  public static void main(String[] args) {

    Player user = new Player("Usario P. Player");

    String name = user.giveAnswer("What is your name?");
    String ageInput = user.giveAnswer("How old are you?");

    int age = 0;

    try {

      age = Integer.parseInt(ageInput);
    } catch (NumberFormatException e) {
      System.out.println("Thats not a number! age automatically a 0.........baby...");
    }

    Cake myCake = new Cake(name, age);
    myCake.Cakedraw();
  }
}

class Cake {
  String name;
  int age;

  public Cake(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void Cakedraw() {
    int width = 10 + age; // cake width depends on age
    int height = 4;
    int candleCount = Math.min(age, 10);

    if (candleCount > 0) {
      int totalSpacing = width - candleCount; // total spaces between candles
      int spaceBetween = totalSpacing / (candleCount + 1);

      int spacing = (width - candleCount) / (candleCount + 1);

      for (int i = 0; i < candleCount; i++) {
        for (int s = 0; s < spaceBetween; s++) System.out.print(" ");
        System.out.print("*");
      }

      for (int i = 0; i < candleCount; i++) {
        for (int s = 0; s < spaceBetween; s++) System.out.print(" ");
        System.out.print("|");
      }

      System.out.println();
    }

    for (int i = 0; i < width; i++) System.out.print("*");
    System.out.println();

    for (int i = 0; i < height; i++) {
      System.out.print("*");
      for (int j = 0; j < width - 2; j++) System.out.print(" ");
      System.out.println("*");
    }

    for (int i = 0; i < width; i++) System.out.print("*");
    System.out.println();

    System.out.println("This cake is for... " + name + " who is " + age + " years old! ");
  }
}


