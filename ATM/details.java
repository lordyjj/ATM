public class details
{
 private String name;
   private double balance;
public details(String name, double balance)
    {
    this.name  = name;
     this.balance = balance;
    }
public String getName()
    {
     return name;
    } 
public double getBalance()
    {
     return balance;
    }
public void setName(String name)
    {
     this.name = name;
    }
public void setBalance(double balance)
    {
     this.balance = balance;
    }
public void displayDetails() 
    {
     System.out.print("Name: "+getName() + "\nBalance: "+ getBalance());
    }
}