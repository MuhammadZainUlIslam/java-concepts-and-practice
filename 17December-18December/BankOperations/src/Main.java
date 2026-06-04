import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    AdminOperations adminService = new AdminManagement();

    boolean runningApp = true;

    System.out.println("Welcome to the Banking System!");
    System.out.print("Are you an Admin or Bank User? (Enter 'admin' or 'user'): ");
    String role = input.nextLine().trim().toLowerCase();

    if (role.equals("admin")) {
      // --- Admin Menu ---
      boolean runningAdmin = true;
      while (runningAdmin) {
        System.out.println("\n--- Admin Menu ---");
        System.out.println("1. Add User");
        System.out.println("2. Edit User");
        System.out.println("3. Delete User");
        System.out.println("4. Display All Users");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        input.nextLine(); // clear buffer

        switch (choice) {
          case 1:
            System.out.print("Enter User ID: ");
            int id = input.nextInt();
            input.nextLine(;

            System.out.print("Enter Username: ");
            String name = input.nextLine();

            System.out.print("Enter Password: ");
            char[] password = input.nextLine().toCharArray();

            adminService.addUser(id, name, password);
            break;

          case 2:
            System.out.print("Enter User ID to edit: ");
            int editId = input.nextInt();
            input.nextLine();

            System.out.print("Enter new username: ");
            String newName = input.nextLine();

            adminService.editUserProfile(editId, newName);
            break;

          case 3:
            System.out.print("Enter User ID to delete: ");
            int delId = input.nextInt();
            input.nextLine();
            adminService.deleteUser(delId);
            break;

          case 4:
            ((AdminManagement) adminService).displayAllUsers();
            break;

          case 5:
            runningAdmin = false;
            System.out.println("Exiting admin menu.");
            break;

          default:
            System.out.println("Invalid choice!");
        }
      }
    } else if (role.equals("user")) {
      // --- Banking Menu ---
      System.out.println("\nCreating your account...");
      System.out.print("Enter Account Holder Name: ");
      String accName = input.nextLine();
      System.out.print("Enter Account Number: ");
      String accNo = input.nextLine();
      System.out.print("Enter Initial Balance: ");
      double initialBalance = input.nextDouble();
      input.nextLine(); // clear buffer

      UserAccount myAccount = new UserAccount(accName, accNo, initialBalance);

      System.out.println("\nCreating another account for transfer demonstration...");
      UserAccount otherAccount = new UserAccount("Ali", "ACC1002", 5000);

      boolean runningUser = true;
      while (runningUser) {
        System.out.println("\n--- Banking Menu ---");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Transfer");
        System.out.println("5. Print Statement");
        System.out.println("6. Account Holder Details");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        input.nextLine(); // clear buffer

        switch (choice) {
          case 1:
            System.out.print("Enter amount to deposit: ");
            double dep = input.nextDouble();
            myAccount.deposit(dep);
            break;

          case 2:
            System.out.print("Enter amount to withdraw: ");
            double wd = input.nextDouble();
            myAccount.withdraw(wd);
            break;

          case 3:
            myAccount.checkBalance();
            break;

          case 4:
            System.out.print("Enter amount to transfer to Ali's account: ");
            double tr = input.nextDouble();
            myAccount.transfer(otherAccount, tr);
            break;

          case 5:
            myAccount.printStatement();
            break;

          case 6:
            myAccount.displayUser();
            break;

          case 7:
            runningUser = false;
            System.out.println("Thank you for banking with us!");
            break;

          default:
            System.out.println("Invalid choice!");
        }
      }
    } else {
      System.out.println("Invalid role entered. Exiting application.");
    }

    input.close();
  }
}