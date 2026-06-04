import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        conditions c = new conditions();

        System.out.println("-----------Practice App---------");
        System.out.println("1. Check greater value");
        System.out.println("2. Check temperature");
        System.out.println("3. Enter personal records");
        System.out.println("4. View personal records");

        System.out.print("Enter here: ");
        int choice = input.nextInt();
        input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Value Of X: ");
                    int x = input.nextInt();

                    System.out.print("Enter Value Of Y: ");
                    int y = input.nextInt();

                    c.checkGreater(x, y);
                    break;

                case 2:
                    System.out.print("Enter Temperature: ");
                    int temperature = input.nextInt();

                    c.checkTemperature(temperature);
                    break;

                case 3:
                    System.out.print("How many persons? ");
                    int n = input.nextInt();
                    input.nextLine();

                    String[] names = new String[n];
                    String[] ages = new String[n];

                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter name of person " + (i + 1) + ": ");
                        names[i] = input.nextLine();

                        System.out.print("Enter age of person " + (i + 1) + ": ");
                        ages[i] = input.nextLine();
                    }

                    c.saveRecords(names, ages);
                    break;

                case 4:
                    c.displayRecords();
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            input.close();

    }
}
