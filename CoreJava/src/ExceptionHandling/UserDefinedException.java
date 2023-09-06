package ExceptionHandling;

import java.util.Scanner;

public class UserDefinedException {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Account account=new Account(501,5000);
        account.showBalance();
        System.out.println("Enter the amount you want to withdraw: ");
            try {
                account.withDrawMoney(scanner.nextInt());
            }
            catch (InsufficintBalance e)
            {
                System.out.println(e.getMessage());
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
             account.showBalance();
    }
}
class Account{
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withDrawMoney(int ammount)throws InsufficintBalance,Exception {
        if (balance<ammount)
        {
            throw new InsufficintBalance("Balance is not sufficient.");
        }
        balance=balance-ammount;
    }

    public void addBalance(double amount) {
        balance = balance+amount;
    }

    public void showBalance()
    {
        System.out.println("Balance :"+balance);
    }

}
