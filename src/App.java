class WelcomeScreen {

    void show() {
        while (true) {
            System.out.println("===== WELCOME TO TYPING TEST SYSTEM =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Reset Password");
            System.out.println("4. About Us");
            System.out.println("5. Exit");

            System.out.print("Choose: ");
            int choice = InputReader.readInt();

            switch (choice) {
                case 1 -> new RegisterScreen().show();
                case 2 -> new LoginScreen().show();
                case 3 -> new ResetPasswordScreen().show();
                case 4 -> new AboutScreen().show();
                case 5 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }

            System.out.println();
        }
    }
}