package edu.bhscs;

public class cup {

  int height = 8;
  int width = 15;



// rim of the cup
public void  draw(){
for( int i = 0; i < width; i++){
  System.out.print("-");
}
System.out.println();

// length of the cup
for(int i = 0; i < height; i++){
  System.out.print("|");
  System.out.println();
}
// bottom of the cup

for(int i = 0; i < width; i++);{
  System.out.print("-");
}

}

}




