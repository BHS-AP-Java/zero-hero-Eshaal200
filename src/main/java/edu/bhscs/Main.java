package edu.bhscs;

public class Main {
  public static void main(String[] args) {

    cup cup = new cup();
    cup.draw();

    Table t = new Table(5, 30);

    t.draw();
  }
}
