import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AdminManagement implements AdminOperations {

    private List<User> users = new ArrayList<>();
    private static final String FILE_NAME = "Users.csv";

    // Constructor loads users from file if it exists
    public AdminManagement() {
        loadUsersFromFile();
    }

    @Override
    public void addUser(int userId, String userName, char[] userPassword) {
        if (userName == null || userName.isEmpty()) {
            System.out.println("Username cannot be empty");
            return;
        }
        if (userPassword == null || userPassword.length < 6) {
            System.out.println("Password must be at least 6 characters");
            return;
        }
        for (User u : users) {
            if (u.getUserId() == userId) {
                System.out.println("User ID already exists!");
                return;
            }
        }

        User newUser = new User(userId, userName, userPassword);
        users.add(newUser);
        saveUserToFile(newUser); // Save immediately to file
        System.out.println("User added successfully");
    }

    @Override
    public void deleteUser(int userId) {
        boolean userFound = false;

        for (User u : users) {
            if (u.getUserId() == userId) {
                userFound = true;
                break;
            }
        }

        if (userFound) {
            users.removeIf(u -> u.getUserId() == userId);
            saveAllUsersToFile(); // Update the file
            System.out.println("User deleted successfully.");
        } else {
            System.out.println("Invalid User ID! No user found with this ID.");
        }
    }

    @Override
    public void editUserProfile(int userId, String newName) {
        for (User u : users) {
            if (u.getUserId() == userId) {
                u.setUserName(newName);
                saveAllUsersToFile(); // Update file
                System.out.println("User name updated successfully");
                return;
            }
        }
        System.out.println("User not found!");
    }

    @Override
    public void editAdminProfile() {
        // Implement if needed
    }

    @Override
    public void displayAllUsers() {
        for (User u : users) {
            u.displayUser();
            System.out.println("-----------");
        }
    }

    // ================= File Handling =================

    private void loadUsersFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            boolean isFirstLine = true; // flag for header
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false; // skip header
                    continue;
                }
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    char[] password = parts[2].toCharArray();
                    users.add(new User(id, name, password));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading user file: " + e.getMessage());
        }
    }

    private void saveUserToFile(User user) {
        boolean fileExists = new File(FILE_NAME).exists();
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            if (!fileExists) {
                // Write header if file didn't exist
                bw.write("UserID,UserName,Password");
                bw.newLine();
            }
            bw.write(user.getUserId() + "," + user.getUserName() + "," + new String(user.getUserPassword()));
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error saving user: " + e.getMessage());
        }
    }

    private void saveAllUsersToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            // Write header
            bw.write("UserID,UserName,Password");
            bw.newLine();
            for (User u : users) {
                bw.write(u.getUserId() + "," + u.getUserName() + "," + new String(u.getUserPassword()));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving users: " + e.getMessage());
        }
    }
}
