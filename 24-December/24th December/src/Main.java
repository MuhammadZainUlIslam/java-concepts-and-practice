import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Person");
            System.out.println("2. View Personal Details");
            System.out.println("3. Apply For National ID Card");
            System.out.println("4. Apply For Driving Licence");
            System.out.println("5. Apply For Sports Club");
            System.out.println("6. Apply For Senior Citizenship Program");
            System.out.println("7. Exit");

            System.out.print("Choose option: ");
            int choice = input.nextInt();
            input.nextLine();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter Name: ");
                        String name = input.nextLine();

                        System.out.print("Enter Registration ID: ");
                        String regID = input.nextLine();

                        System.out.print("Enter Age: ");
                        int age = input.nextInt();

                        System.out.print("Enter Driving Test Score: ");
                        int dvScore = input.nextInt();

                        System.out.print("Enter Fitness Score: ");
                        int ftScore = input.nextInt();
                        input.nextLine(); // clear buffer

                        PersonDTO dto = new PersonDTO(name, regID, age, dvScore, ftScore);
                        Person person = new Person(dto);
                        persons.add(person);

                        System.out.println("Person added successfully!");
                        break;

                    case 2:
                        if (persons.isEmpty()) {
                            System.out.println("No records found.");
                        } else {
                            input.nextLine(); // clear buffer

                            System.out.print("Please Enter Your ID: ");
                            String id = input.nextLine();

                            Person found = null;

                            for (Person p : persons) {
                                if (p.equals(id)) {
                                    found = p;
                                    break;
                                }
                            }

                            if (found != null) {
                                found.displayRecord();
                            } else {
                                System.out.println("Person with ID " + id + " not found.");
                            }
                        }

                        break;

                    case 3:
                        for (Person p : persons) {
                            p.registerForNationalRecord();
                        }
                        break;

                    case 4:
                        for (Person p : persons) {
                            p.getDrivingLicence();
                        }
                        break;

                    case 5:
                        for (Person p : persons) {
                            p.registerToSportsClub();
                        }
                        break;

                    case 6:
                        for (Person p : persons) {
                            p.registerForSeniorCitizenship();
                        }
                        break;

                    case 7:
                        exit = true;
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        input.close();
    }
}
