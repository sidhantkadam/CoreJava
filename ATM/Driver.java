package ATM;

import java.util.Scanner;

class Atm
{
    Integer Balance = 80000;
    public String checkBalance(Integer amount)
    {
        if(amount > Balance || amount == 0)
        {
            throw new FailedToWithdrawAmountException("Can't withdraw a money, please check amount to withdraw or account balance : " + Balance);
        }
        Balance-= amount;
        return "Account Balance after withdraw " + amount + "\nAccount Balance: " + Balance;
    }
}

public class Driver
{
    public static void main(String[] args)
    {
        Atm atm = new Atm();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        try
        {
            System.out.println(atm.checkBalance(sc.nextInt()));
        }
        catch(FailedToWithdrawAmountException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
