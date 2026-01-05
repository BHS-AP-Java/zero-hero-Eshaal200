package edu.bhscs;

import java.util.Scanner;

public class CastingToInt {

  public static void main(String[] args) {

    System.out.println("How much of your goal did you meet?:");

    System.out.println("What was your actual goal?:");

    Scanner s = new Scanner(System.in);

    int m = s.nextInt();
    int r = s.nextInt();

    boolean metGoal = m == r;
    System.out.println("You met your goal exactly " + metGoal);

    boolean metGoal2 = m > r;
    System.out.println("You went over your goal " + metGoal2);

    boolean metGoal3 = m < r;
    System.out.println("You did not meet your goal " + metGoal3);

    s.close();
  }
}
