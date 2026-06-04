import java.util.*;

public class Student {
    private String name;
    private String registration_no;
    private String section;
    private int semester;
    private int age;


    private ArrayList<String> subjectList;
    private Set<String> subjectSet;
    private Map<String, Integer> marksMap;


    public Student(String name, String registration_no,String section,int semester, int age){
        this.name= name;
        this.registration_no= registration_no;
        this.section= section;
        this.semester= semester;
        this.age=age;
        this.subjectList = new ArrayList<>();
        this.subjectSet= new HashSet<>();
        this.marksMap= new HashMap<>();

    }
    public String getName(){
        return name;
    }
    public String getRegistrationNo() {
        return registration_no;
    }
    public String getSection(){
        return section;
    }
    public int getAge(){
        return age;
    }
    public int getSemester(){
        return semester;
    }
    public void addSubjects(String subject){
        subjectList.add(subject);
        subjectSet.add(subject);
    }
    public void addMarks(String subject, int marks){
        marksMap.put(subject,marks);
    }

    public void displayStudentRecord(){
        System.out.println("-------Student Record----");
        System.out.println("Name: "+ name);
        System.out.println("Registration No: "+ registration_no);
        System.out.println("Section: "+ section);
        System.out.println("Semester: "+ semester);
        System.out.println("Age: "+ age);
        System.out.println("Subject(ArrayList): "+ subjectList);
        System.out.println("Subject(Set): "+ subjectSet);
        System.out.println("Marks: "+ marksMap);


    }
}


