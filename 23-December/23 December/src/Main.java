import java.util.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    ArrayList<Student> s = new ArrayList<>();{
        /*
      Student s1 = new Student("Muhammad","96","B",8,22);
      Student s2 = new Student("Ali","88","B",8,23);
      Student s3 = new Student("Adnan","105","B",8,22);
      Student s4 = new Student("Sami","96","B",8,23);
      Student s5 = new Student("Aftab","22","B",8,21);
      s1.addSubjects("OOP");
      s1.addSubjects("DSA");
      s1.addSubjects("Maths");
      s1.addMarks("OOP",75);
      s1.addMarks("DSA",75);
      s1.addMarks("Maths",80);

      s2.addSubjects("OOP");
      s2.addSubjects("DSA");
      s2.addSubjects("Maths");
      s2.addMarks("OOP",75);
      s2.addMarks("DSA",75);
      s2.addMarks("Maths",80);

      s2.addSubjects("OOP");
      s2.addSubjects("DSA");
      s2.addSubjects("Maths");
      s2.addMarks("OOP",75);
      s2.addMarks("DSA",75);
      s2.addMarks("Maths",80);

      s3.addSubjects("OOP");
      s3.addSubjects("DSA");
      s3.addSubjects("Maths");
      s3.addMarks("OOP",75);
      s3.addMarks("DSA",75);
      s3.addMarks("Maths",80);

      s4.addSubjects("OOP");
      s4.addSubjects("DSA");
      s4.addSubjects("Maths");
      s4.addMarks("OOP",75);
      s4.addMarks("DSA",75);
      s4.addMarks("Maths",80);

      s5.addSubjects("OOP");
      s5.addSubjects("DSA");
      s5.addSubjects("Maths");
      s5.addMarks("OOP",75);
      s5.addMarks("DSA",75);
      s5.addMarks("Maths",80);

      s.add(s1);
      s.add(s2);
      s.add(s3);
      s.add(s4);
      s.add(s5);

      s.remove(s3);
      s.remove(s1);
      s.removeIf(st -> st.getRegistrationNo().equals("96"));

          for(Student st: s){
              st.displayStudentRecord();
          }
*/

      Scanner input = new Scanner(System.in);
    boolean exit = false;
    while(!exit){
        System.out.println("-----Student Management System------");
        System.out.println("1. Add Student Details ");
        System.out.println("2. Add Subjects ");
        System.out.println("3. Display Student Record");
        System.out.println("4. Remove Student");
        System.out.println("5. exit");
        int choise = input.nextInt();
        input.nextLine();
        switch (choise){
            case 1:
                System.out.println("How many Student you Want To Add:");
                int ts= input.nextInt();
                input.nextLine();
                for(int i =0;i<ts; i++){
                System.out.println("Enter Student name:");
                String name = input.nextLine();
                System.out.println("Enter Student Registration No:");
                String registration = input.nextLine();
                System.out.println("Enter Student Semster:");
                int semester = input.nextInt();
                input.nextLine();
                System.out.println("Enter Student Section:");
                String section = input.nextLine();
                System.out.println("Enter Student Age:");
                int age = input.nextInt();
                input.nextLine();
                s.add(new Student(name, registration, section, semester, age));
                System.out.println("Student added successfully!");
            }
                break;

            case 2:
                System.out.print("Enter Registration No of student: ");
                String regNoMark = input.nextLine();
                Student stu = null;
                for (Student st : s) {
                    if (st.getRegistrationNo().equalsIgnoreCase(regNoMark)) {
                        stu = st;
                        break;
                    }
                }
                if (stu != null) {
                    System.out.println("How Many Subjects"+stu.getName()+" Is Enrolled In:");
                    int tsubjects= input.nextInt();
                    input.nextLine();
                    for(int i=0; i<tsubjects;i++) {
                        System.out.print("Enter Subject Name: ");
                        String subjectMark = input.nextLine();
                        System.out.print("Enter Marks: ");
                        int marks = input.nextInt();
                        input.nextLine(); // consume newline
                        stu.addMarks(subjectMark, marks);
                        stu.addSubjects(subjectMark);
                        System.out.println("Marks added!");
                    }
                } else {
                    System.out.println("Student not found!");
                }
                break;

            case 3:
                    if(s.isEmpty()) {
                        System.out.println("No Record Found");
                    }
                    else {
                        for(Student st:s){
                        st.displayStudentRecord();
                    }
                }
                break;
            case 4:
                System.out.println("Enter Registration Number to Remove Student");
                String regDel = input.nextLine();
                boolean removed = s.removeIf(st -> st.getRegistrationNo().equalsIgnoreCase(regDel));
                if(removed){
                    System.out.println("Student Removed");
                }
                else {
                    System.out.println("invalid Input");
                }

            case 5:
            {
                System.out.println("Program Exiting...");
                System.out.println("Done");

                break;
            }

        }

    }
    }
}
}