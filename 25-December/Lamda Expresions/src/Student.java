public class Student {
    private String name;
    private String ID;
    private int age;

    public Student(String name, String ID, int age){
        this.name = name;
        this.age = age;
        this.ID= ID;
    }

    public String getID() {
        return ID;
    }
    public int getAge(){
        return  age;
    }
    public String getName(){
        return name;
    }
}
