import java.io.*;

public class ATM_interface {
    // Java Program to Display the ATM Transaction

    // Display current balance in account
    public static void displayBalance(int balance) {
        System.out.println("Your Current Balance is: " + balance);
        System.out.println();
    }

    // Withdraw amount and update the balance
    public static int amountWithdrawing(int balance,
            int withdrawAmount) {
        System.out.println("Withdrawn Operation:");
        System.out.println("Withdrawing Amount : "
                + withdrawAmount);
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println(
                    "Please collect your money and collect the card..Visit Again");
            displayBalance(balance);
        } else {
            System.out.println("Sorry! Insufficient Balance...Visit Again ");
            System.out.println();
        }
        return balance;
    }

    // Deposit amount and update the balance
    public static int amountDepositing(int balance,
            int depositAmount) {
        System.out.println("Deposit Operation:");
        System.out.println("Depositing Amount : "
                + depositAmount);
        balance = balance + depositAmount;
        System.out.println(
                "Your Money has been successfully deposited...Visit Again");
        displayBalance(balance);
        return balance;
    }

    public static void main(String args[]) {

        int balance = 100000;
        int withdrawAmount = 50000;
        int depositAmount = 20000;

        // calling display balance
        displayBalance(balance);
        // withdrawing amount
        balance = amountWithdrawing(balance, withdrawAmount);
        // depositing amount
        balance = amountDepositing(balance, depositAmount);
    }
}
