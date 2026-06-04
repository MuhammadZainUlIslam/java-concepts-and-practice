import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number plate: ");
            String input = scanner.nextLine();

            String normalizedInput = input.toUpperCase();

            boolean isValid = NumberPlateValidator.validate(normalizedInput);

            if (isValid) {
                System.out.println("Valid Number Plate: " + normalizedInput);
                break;
            } else {
                System.out.println("Invalid Number Plate, try again.");
            }
        }

        scanner.close();
    }
}
