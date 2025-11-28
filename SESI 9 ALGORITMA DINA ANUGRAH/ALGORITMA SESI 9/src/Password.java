import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctPassword = "admin";
        int attempts = 0;
        String userInput;

        do {
            System.out.print("Enter password: ");
            userInput = input.nextLine();

            if (userInput.equals(correctPassword)) {
                System.out.println("Login Successful!");
                return;
            } else {
                attempts++;
                System.out.println("Wrong Password! Attempts left: " + (3 - attempts));
            }
        } while (attempts < 3);
        System.out.println("Account Locked!");
    }
}
