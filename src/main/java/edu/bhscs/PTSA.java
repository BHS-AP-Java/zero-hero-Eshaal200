package edu.bhscs;

public class PTSA {
  double funds = 0;

  public void recieveMoney(double amount) {
    funds += amount;
    System.out.println("PTSA recieved $" + amount + ".Total: $" + funds);
  }
}
