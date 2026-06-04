public class Person implements PersonAttributes {
    private String name;
    private String personID;
    private int age;
    private int testScore;
    private int fitnessScore;

public Person(PersonDTO person){
    this.name =person.getName();
    this.personID=person.getPerosnID();
    this.age=person.getAge();
    this.testScore=person.getTestScore();
    this.fitnessScore=person.getFitnessScore();
}

    @Override
    public void registerForNationalRecord() {
    PersonDTO personDTO = new PersonDTO();
        if(age<18){
            throw new IllegalStateException("Not Eligible To Apply For ID Card: ");
        }
        else {
            System.out.println("---------------------");
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Registration No: "+personID);
            System.out.println("Successfully Applied");
        }

    }

    @Override
    public void getDrivingLicence() {

    if(age<18||age>80){
        throw new IllegalStateException("Not Eligible.....! ");
    }
    else if(testScore>100){
        throw new IllegalStateException("Invalid Input");

    }
    else if(testScore<50){
        throw new IllegalArgumentException("Failed To Qualify");

    }
    else {
        System.out.println("---------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Test Score: " + testScore);
        System.out.println("Successfully Applied");
    }
    }


    @Override
    public void registerToSportsClub() {
    if(age>50||fitnessScore<70){
        throw new IllegalStateException("Not Eligible......!");
    }
    else if(fitnessScore<0||fitnessScore>100){
        throw new IllegalStateException("Invalid input");
    }
        System.out.println("---------------------");
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Test Score: "+testScore);
            System.out.println("Successfully Applied");
    }


    @Override
    public void displayRecord() {
        System.out.println("---------------Record-------------");
        System.out.println("Name: " +name);
        System.out.println("ID: "+personID);
        System.out.println("Person Age: "+age);
        System.out.println("Test Score: "+testScore);
        System.out.println("Person Fitness Score: "+fitnessScore);
    }

    public void registerForSeniorCitizenship(){
    if( age>0 && age<60){
       throw new IllegalArgumentException ("Not Eligible to Apply........! ");
    }
    else if (age<0){
        throw new IllegalStateException("Invalid Input......");
    }
    else {

        System.out.println("Name: " + name);
        System.out.println("ID: " + personID);
        System.out.println("Person Age:" + age);
        System.out.println("Successfully Applied");
    }
    }




    @Override
    public void addRecord() {

    }
}
