public class payment extends details 
{
    private int foods;
     private int gcash;
      private int load;
public payment(String name, double balance, int foods, int gcash, int load)
    {
     super(name,balance);
      this.foods = foods;
       this.gcash = gcash;
        this.load = load;
    }
public int setFoods()
    { 
     return foods;
    }
public int setGcash()
    {
     return gcash;
    }
public int setLoad()
    {
     return load;
    }     
public void getFoods(int foods)
    {
     this.foods = foods;
    }
public void getGcash(int gcash)
    {
     this.gcash = gcash;
    }
public void getLoad(int load)
    {
     this.load = load;
    }     
public void processPayment(double amount)
    {
     if(amount <= 0)
        {
          System.out.print("Invalid Payment Amount. ");
        }else if
         (amount > getBalance())
        {
         System.out.print("Insufficient Amount! Current Balance : "+ getBalance());        
        }else
        { 
         setBalance(getBalance() - amount);
         System.out.print("Payment of "+ amount + " Succesful. \nRemaining balance: "+ getBalance());
        }
    }
public void addBalance(double amount)
    {
     if(amount > 0)
        {
         setBalance(getBalance() + amount);
         System.out.print("Added "+ amount + " to balance. New balance: " + getBalance());
        }
    } 
public void payFood() 
    {
     System.out.println("\nProcessing Food Payment...");
     processPayment(this.foods);
    }
public void payGCash() 
    {
     System.out.println("\nProcessing GCash Transfer...");
     processPayment(this.gcash);
    }
public void payLoad() 
    {
     System.out.println("\nProcessing Load Purchase...");
     processPayment(this.load);
    }
@Override
public void displayDetails() 
    {
     super.displayDetails();
      System.out.println("Food Payment: " + foods);
       System.out.println("GCash Payment: " + gcash);
        System.out.println("Load Payment: " + load);
    }
}