public class withDraw extends details
{
private double amount;

public withDraw(String name, double balance, double amount)
    {
     super(name, balance);
      this.amount = amount;
       processWithdrawal();
    }
private void processWithdrawal()
    {
     if(amount >= getBalance())
        {
         System.out.println("Transaction Failed: Insufficient Balance! ");
        }else if
         (amount <= 0)
        {
         System.out.println("Transaction Failed: Invalid Withdrawal Amount! ");
        }else
        {
         setBalance(getBalance() - amount);
          System.out.println("Amount WithDrawn: "+ amount+ "\n=== Withdrawal Successfully! === ");
           System.out.println("Available Balance: "+ getBalance());
        }
    }
public double setAmount()
    {
     return amount;
    }
public void getAmount(double amount)
    {
     this.amount = amount;
    }
@Override
public void displayDetails()
    {
     super.displayDetails();
     System.out.println("Withdrawn Amount: " + amount);
}
}