import java.util.Scanner;
class UserAccount
{
    private double balance;
    UserAccount(double initialBal)
    {
        this.balance=initialBal;
    }
    public double getBal()
    {
        return balance;
    }
    void deposit(double amount)
    {
        if(amount>0)
        {
            balance=balance+amount;
            System.out.println("Deposit Successfully . New balance: "+balance);
        }
        else
        {
            System.out.println(" Invalid Amount");
        }
    
    }
    void withdraw(double amount)
    {
        if(amount>0&&amount<=balance)
        {
            balance = balance-amount;
            System.out.println("Withdrawal Successfully . Balance left: "+balance);
        }
        else
        {
            System.out.println("Invalid or Insufficient amount for withdrawal");
        }
    }
}
class Atm
{
UserAccount ac;
Atm(UserAccount account)
{
    this.ac=account;
}
void menu()
{
    Scanner sc=new Scanner(System.in);
    while(true)
    {
        System.out.println("\n....Atm Interface....");
        System.out.println("1. Check Balance");
        System.err.println("2. Money Deposit");
        System.err.println("3. Money Withdraw");
        System.err.println("4. Exit");
        System.err.println("Choose one option: ");

        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Your Balance: "+ac.getBal());
            break;
            case 2:
            System.out.println("Enter deposited amount: ");
            double depAmt=sc.nextDouble();
            ac.deposit(depAmt);
            break;
            case 3:
            System.out.println("Enter amount for withdrawal: ");
            double withAmt=sc.nextDouble();
            ac.withdraw(withAmt);
            break;
            case 4:
            System.out.println("Thank you . Visit again !");
            sc.close();
            return;
            default:
            System.out.println("Invalid choice");
        }
    }
}
}
public class Task3
{
    public static void main(String[] args)
    {
        UserAccount ac= new UserAccount(1000.0);
        Atm atm= new Atm(ac);
        atm.menu();
    }
}