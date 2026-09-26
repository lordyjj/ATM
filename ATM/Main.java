import java.util.Scanner;

public class Main 
{
public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
    
        // Initial setup for the account
        System.out.println("=== AUTOMATED TELLER MACHINE [ATM] ===");
        System.out.print("Account Email: ");
        String name = input.nextLine();

        System.out.print("Account PassWord: ");
        String pass = input.nextLine();
        
          // PassWord And Email Of User
        String accountName = "_ChAng3_m3_";
        String passWord = "*_Change_Me*";

        //   current Balance of user
        double currentBalance = 1000.00; 
        boolean running = true;

        //  condition that user email and password will check if correct
      if(!name.equals(accountName) || !pass.equals(passWord))
        {
         System.out.println("\nInvalid email or password! ");
          System.out.println("Access Denied. ");
           System.out.println("You cannot withdraw, deposit, or make payments. ");
         input.close();
          return;
        }
        System.out.print("\nWelcome, "+ name + "!");

         while (running) 
        {
         System.out.println("\n==================================");
          System.out.println(" [1] Check Balance");
           System.out.println(" [2] Withdraw");
            System.out.println(" [3] Payment");
             System.out.println(" [4] Deposit");
              System.out.println(" [5] Exit");
               System.out.print("Please Enter a Number: ");
            
         int choice = input.nextInt();

         switch (choice) 
            {
            case 1:
                checkBalance check = new checkBalance(name, currentBalance);
                 check.displayDetails();
                  break;

            case 2:
                System.out.print("Enter amount to withdraw: ");
                 double withdrawAmount = input.nextDouble();
                  withDraw withdraw = new withDraw(name, currentBalance, withdrawAmount);
                   currentBalance = withdraw.getBalance();
                    break;

            case 3:
                System.out.print("Enter Food payment amount: ");
                 int food = input.nextInt();
                  System.out.print("Enter GCash amount: ");
                   int gcash = input.nextInt();
                    System.out.print("Enter Load amount: ");
                     int load = input.nextInt();

                payment payment = new payment(name, currentBalance, food, gcash, load);
                 payment.payFood();
                  payment.payGCash();
                   payment.payLoad();
                    currentBalance = payment.getBalance(); 
                     break;

            case 4:
                System.out.print("Enter deposit amount: ");
                 double depAmount = input.nextDouble();
                  deposit deposit = new deposit(name, currentBalance, depAmount);
                   deposit.displayDetails();
                    currentBalance = deposit.getBalance();
                     break;

            case 5:
                System.out.println("Thank you for using our ATM! Goodbye.");
                 running = false;
                  break;

                default:
                 System.out.println("Invalid selection! Please choose between 1 and 5.");
                  break;
            }
        }
        input.close();
    }
}