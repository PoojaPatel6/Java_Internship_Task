
public class BankAccount {
    public static void main(String[] args){
    double balance = 1000.75;
    double amountToWithdraw = 260;
    double updatedBalance = balance-amountToWithdraw;
    double amountForEachFriend = updatedBalance/3;


    boolean canPurchaseTicket = amountForEachFriend>260;
    System.out.println(canPurchaseTicket);

    System.out.println("I gave each friend" +" "+ amountForEachFriend);
  }       
}
