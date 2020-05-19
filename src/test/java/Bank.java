public abstract class Bank {

   int amt = 100;
   final int rate = 10;
   static int loanRate = 5;


public abstract void loan(); // abstract method - does not have any method body - no method body
public void credit() {
    System.out.println("credit method");
}
public void debit() {
    System.out.println("Debit");
}

}
