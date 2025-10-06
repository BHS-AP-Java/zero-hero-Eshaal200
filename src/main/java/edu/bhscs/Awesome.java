package edu.bhscs;

public class Awesome {
  // fields properties / this is the stuff AWESOME HAS!!!!!
  String name;
  String knowledge;

  // we need to CONSTRUCT something awesome
  Awesome(String name) {
    System.out.println("I am Awesome!" + name);
    this.name = name;
  }

  // methods are the ability of the class/type
  String getName() {
    return this.name;
  }

  void learnSomething(String knowledge) {
    this.knowledge = knowledge;
  }

  String getKnowledge() {
    return this.knowledge;
  }
}
