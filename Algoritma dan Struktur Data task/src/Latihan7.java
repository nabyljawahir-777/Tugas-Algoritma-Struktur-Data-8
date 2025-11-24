import java.util.Scanner;
import java.util.ArrayList;

public class Latihan7 {

     static ArrayList<String> usernames = new ArrayList<>();
     static ArrayList<String> passwords = new ArrayList<>();

    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=====LOGIN=====");
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    signUp(input);
                    break;
                case 2: 
                    signIn(input);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1 - 3.");
                    break;
            }
        } while (choice != 3);

        input.close();
        
    }

    static void signUp(Scanner input) {
        System.out.println("\n=====SIGN UP=====");
        System.out.println("Enter new username: ");
        String newUsername = input.nextLine();
        
        if (usernames.contains(newUsername)) {
            System.out.println("Username already exist!");
            return;
        }

        System.out.println("Enter new password: ");
        String newPassword = input.nextLine();

        usernames.add(newUsername);
        passwords.add(newPassword);

        System.out.println("Account created succesfully!");
    }

    static void signIn(Scanner input) {
        System.out.println("\n=====SIGN IN=====");
        System.out.println("Enter username: ");
        String enteredUsername = input.nextLine();

        System.out.println("Enter password: ");
        String enteredPassword = input.nextLine();

        boolean valid = false;

        for (int i = 0; i < usernames.size(); i++) {
            if (enteredUsername.equals(usernames.get(i)) && enteredPassword.equals(passwords.get(i))) {
                valid = true;
                break;
            }
        }  
        
        if (valid) {
            System.out.println("Username and password valid, you can login into the dashboard.");
        } else {
            System.out.println("Wrong username and password.");
        }
    }
}