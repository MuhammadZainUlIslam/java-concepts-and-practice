public class Employe {
    private String name;
    private String department;
    private int salary;
    private int age;
    private int exp;

    public Employe(String name, String department, int salary, int age, int exp){
        this.name = name;
        this.department = department;
        this.salary =salary;
        this.age = age;
        this.exp = exp;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public int getAge(){
        return age;
    }
    public int getSalary(){
        return salary;
    }
    public int getExp(){
        return exp;
    }

    public String toString(){
        return "Employe{"+
                "Name='"+name + '\''  +
                "Department='"+department + '\''  +
                "Salary='"+salary + '\''  +
                "Age='"+age + '\''  +
                "Experience='"+exp + '\''+
                '}';


    }
}
