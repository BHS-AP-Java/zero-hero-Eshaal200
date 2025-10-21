package edu.bhscs;

import java.util.Scanner;

// fields and properties

public class Player {
  String name;
  Scanner s;
  Cake userCake;
  int accomplishments;

  public Player(String name) {
    this.name = name;
    this.s = new Scanner(System.in);
  }

  public void answerQuestions() {
    System.out.println("Whats your question?");
    String question = this.s.nextLine();
    System.out.println(question + "here you go!");
  }

  public void accomplish(int amount) {
    this.accomplishments += amount;
  }

  public String giveAnswer(String question) {
    System.out.println(question);
    return s.nextLine();

    // return "yes";

  }

  public void payForCake(Cake cake) {
    System.out.println(name + " gives $" + cake.getPrice() + " to the baker.");
  }
}
