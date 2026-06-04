public class User {
    private int userId;
    private String userName;
    private char[] userPassword;

    public User(int userId, String userName, char[] userPassword) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public int getUserId() { return userId; }
    public String getUserName() { return userName; }
    public char[] getUserPassword() { return userPassword; }

    public void setUserName(String newName) { this.userName = newName; }

    public void displayUser() {
        System.out.println("User ID: " + userId);
        System.out.println("Username: " + userName);
    }
}
