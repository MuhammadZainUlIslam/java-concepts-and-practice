public class PersonDTO {
    private String name;
    private String perosnID;
    private int age;
    private int testScore;
    private int fitnessScore;

    public PersonDTO(String name, String perosnID, int age,int TestScore, int fitnessScore){
        this.name = name;
        this.perosnID=perosnID;
        this.age=age;
        this.testScore=TestScore;
        this.fitnessScore=fitnessScore;

    }


    public PersonDTO(){
    }


    public String getPerosnID() {
        return perosnID;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getTestScore() {
        return testScore;
    }

    public int getFitnessScore() {
        return fitnessScore;
    }
}
