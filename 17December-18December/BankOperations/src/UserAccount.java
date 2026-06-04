import java.util.ArrayList;

public class UserAccount implements AccountOperations {

    private String accountHolder;
    private String accountNo;
    private double balance;
    private ArrayList<String> transactions; // stores transaction history

    public UserAccount(String accountHolder, String accountNo, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNo = accountNo;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        transactions.add("Account created with balance: " + initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: " + amount);
        System.out.println(amount + " deposited successfully.");
    }

    @Override
    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            transactions.add("Withdrawn: " + amount);
            System.out.println(amount + " withdrawn successfully.");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    @Override
    public void transfer(UserAccount toAccount, double amount) {
        if(amount > balance) {
            System.out.println("Insufficient balance to transfer!");
        } else {
            balance -= amount;
            toAccount.balance += amount;
            transactions.add("Transferred " + amount + " to " + toAccount.accountNo);
            toAccount.transactions.add("Received " + amount + " from " + this.accountNo);
            System.out.println(amount + " transferred successfully to " + toAccount.accountHolder);
        }
    }

    @Override
    public void printStatement() {
        System.out.println("\n--- Account Statement for " + accountHolder + " ---");
        for(String t : transactions) {
            System.out.println(t);
        }
        System.out.println("Current Balance: " + balance);
    }
    @Override
    public void displayUser(){
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNo);
        System.out.println("Total Balance: "+balance);
    }



}
