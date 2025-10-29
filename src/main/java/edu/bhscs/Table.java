package edu.bhscs;

public class Table {
  // properties
  int legs;
  int width;
  String leg;
  String top;


  // constrcutors
  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
    this.leg = "|";
    this.top = "=";


    System.out.println("The table is alive!");
  }

  public void draw(int legs, int width) {

  }

  // methods

  public void drawTable(){
    setTop( "=");
    setLegs("|");

  }


  public void draw(){
    for(int row = 0; row < 2; row++){
      System.out.print(top);
       for(int j = 0; j < width; j++){
         System.out.print(top);
         }
           System.out.println(top);
           }



    for(int i = 0; i < 3; i++){
      System.out.print(leg);
      for(int j = 0; j < width; j++){
        System.out.print(" ");
      }
      System.out.println(leg);
    }



  for( int i = 0; i < legs; i++){
    System.out.print(leg);
    for(int j = 0; j < width; j++){
      System.out.print(" ");
    }

    System.out.println(leg);

  }
}

public void setLegs(String leg){
  this.leg = leg;

}

public void setTop(String top){
  this.top = top;
}

}













