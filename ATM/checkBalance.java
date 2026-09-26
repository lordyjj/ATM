public class checkBalance extends details
{
public checkBalance(String name, double balance)
    {
     super(name, balance);
    }
public void remainingBalance(double remainingBalances)
    {
     double balance = remainingBalances;
      System.out.println("Remaining balance: "+ balance);
    }

@Override
public void displayDetails()
    {
     super.displayDetails();
    }
}