 public class deposit extends details 
{
    private double dep;
     private double oldBalance;

    public deposit(String name, double balance, double dep) 
    {
        super(name, balance);
          this.oldBalance = balance;
             this.dep = dep;
               addBalance(dep);
    }  
    public double setDep() 
    {
         return dep;
    }    
    public void getDep(double dep)
    {
        this.dep = dep;
    }
    public void addBalance(double amount)
    {
        if (amount > 0) 
        {
            setBalance(getBalance() + amount);
        }else 
        {
            System.out.println("Invalid deposit amount!");
        }
    }
    @Override
    public void displayDetails() 
    {
     super.displayDetails();

    System.out.println("\n========== DEPOSIT DETAILS ==========");
        System.out.println("\nOld Balance: "+ oldBalance);
         System.out.println("Deposit Amount: "+ dep);
          System.out.println("Latest Amount: "+ getBalance());
    System.out.println("=====================================");
    }
}