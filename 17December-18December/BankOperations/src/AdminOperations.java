public interface AdminOperations {
    void addUser(int userId, String userName, char[] userPassword);
    void deleteUser(int userId);
    void editUserProfile(int userId, String newName);
    void displayAllUsers();
    void editAdminProfile();
}
