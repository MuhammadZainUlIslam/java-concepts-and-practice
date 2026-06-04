import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Shape shape = null;

        System.out.println("Choose shape to calculate area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");

        System.out.print("Enter choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter length: ");
                double length = input.nextDouble();
                System.out.print("Enter width: ");
                double width = input.nextDouble();
                shape = new Rectangle(length, width);
                break;

            case 2:
                System.out.print("Enter radius: ");
                double radius = input.nextDouble();
                shape = new Circle(radius);
                break;

            case 3:
                System.out.print("Enter base: ");
                double base = input.nextDouble();
                System.out.print("Enter height: ");
                double height = input.nextDouble();
                shape = new Triangle(base, height);
                break;

            default:
                System.out.println("Invalid choice!");
                input.close();
                return;
        }

        System.out.println("Area = " + shape.calculateArea());
        input.close();
    }
}
