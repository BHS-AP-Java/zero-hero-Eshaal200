package edu.bhscs;

public class Awesome {
  // fields properties / this is the stuff AWESOME HAS!!!!!
  String name;


// we need to CONSTRUCT something awesome
Awesome(String name){
  System.out.println("I am Awesome!" + name);
  this.name = name;
}
String getName(){
  return this.name;

}

}