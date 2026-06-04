public interface AccountOperations {
    void deposit(double amount);      // Deposit money
    void withdraw(double amount);     // Withdraw money
    void checkBalance();              // Show current balance
    void transfer(UserAccount toAccount, double amount);  // Transfer to another account
    void printStatement();            // Print account statement
    void displayUser();
}
