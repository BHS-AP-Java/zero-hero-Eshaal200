package edu.bhscs;

public class cake {

  public char[] flavor;

  // this is a method
  void draw(String icing, int x, int y) {
    for (int count = 0; count < x; count++) {

      for (int i = 0; i < y + count; i++) {
        System.out.println(this.flavor);
      }
      System.out.println("more cake " + (count * count));
    }

    System.out.println();
  }
}

// cake.Cakedraw();

// thnew cake().draw("yummy!",5,12);}}
