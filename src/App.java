import java.util.Scanner;

class WelcomeScreen {

    void show() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== WELCOME TO TYPING TEST SYSTEM =====");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. About Us");
        System.out.println("4. Exit");

        System.out.print("Choose: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                new RegisterScreen().show();
                break;
            case 2:
                new LoginScreen().show();
                break;
            case 3:
                new AboutScreen().show();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Invalid choice");
        }
    }
}