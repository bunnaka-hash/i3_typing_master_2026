class LoginScreen {
    void show() {
        System.out.println("===== LOGIN =====");

        System.out.print("Enter username: ");
        String username = InputReader.readLine();

        System.out.print("Enter password: ");
        String password = InputReader.readLine();

        boolean isValid = UserStore.REPOSITORY.isValidCredentials(username, password);
        if (isValid) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
