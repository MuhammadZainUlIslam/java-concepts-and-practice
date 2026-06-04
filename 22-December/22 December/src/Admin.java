public class Admin implements AdminFeatures{
    private String admin_user_Name;
    private char[] adminPassword;


    public void setAdmin_user_Name(String admin_user_Name) {
        this.admin_user_Name = admin_user_Name;
    }

    public void setAdminPassword(char[] adminPassword) {
        this.adminPassword = adminPassword;
    }
    public String getAdmin_user_Name() {
        return admin_user_Name;
    }

    public char[] getAdminPassword() {
        return adminPassword;
    }



    @Override
    public void displayStudentRecord(String f_Name, String l_Name, String reg_No, int age, String section) {
        System.out.println("Student First Name: "+f_Name);
        System.out.println("Student Last Name: "+l_Name);
        System.out.println("Student Reg No Name: "+reg_No);
        System.out.println("Student Section: "+section);
        System.out.println("Student First Name: "+f_Name);
        System.out.println("Student Age: "+age);


    }

    @Override
    public void displayTeacherRecord(String f_Name, String l_Name, String t_Class) {

    }

    @Override
    public void searchStudentRecord() {

    }

    @Override
    public void searchTeacherRecord() {

    }

    @Override
    public void updateStudentRecord() {

    }

    @Override
    public void updateTeacherRecord() {

    }
}
