import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> s1 = new ArrayList<>();
        Scanner input= new Scanner(System.in);

        while(true) {
            System.out.println("---------Campus Management System--------");
            System.out.println("1-Enter Student Record");
            System.out.println("2-Display Student Record");
            System.out.println("3-Delete Student Record");
            System.out.println("4-Exit");
            System.out.print("Select Option: ");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("How Many Student Record You Want To Enter");
                    int n = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter Record Of Student: " + (i + 1));
                        System.out.print("Name: ");
                        String Name = input.nextLine();
                        System.out.print("Registration No: ");
                        String Registration = input.nextLine();
                        System.out.print("Section No: ");
                        String Section = input.nextLine();
                        System.out.print("Age: ");
                        int Age = input.nextInt();
                        input.nextLine();
                        s1.add(new Student(Name, Registration, Section, Age));
                        System.out.println("Student " + (i + 1) + " Record Updated Successful ");
                    }
                    break;

                case 2:
                    System.out.println("----------Student Record---------");
                    if (s1.isEmpty()) {
                        System.out.println("No Record Found");
                    } else {
                        for (Student s : s1) {
                            s.displayStudentRecord();
                        }
                    }
                    break;
                case 3:
                    if (s1.isEmpty()) {
                        System.out.println("No Record to Delete");
                        break;
                    }

                    input.nextLine(); // consume newline
                    System.out.print("Enter Registration Number To Delete A Record: ");
                    String delete = input.nextLine();

                    Iterator<Student> iterator = s1.iterator();
                    boolean found = false;

                    while (iterator.hasNext()) {
                        Student s = iterator.next();
                        if (s.Reg_No != null && s.Reg_No.equalsIgnoreCase(delete)) {
                            iterator.remove();
                            found = true;
                            System.out.println("Record Deleted Successfully");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Record Not Found");
                    }
                    break;


                case 4:
                    System.out.println("Exiting Program");
                    return;


            }
        }

    }
}