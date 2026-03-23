class RegisterScreen {
    private final RegisterService registerService = new RegisterService(UserStore.REPOSITORY);

    void show() {
        System.out.println("===== REGISTER =====");

        System.out.print("Enter username: ");
        String username = InputReader.readLine();

        System.out.print("Enter password: ");
        String password = InputReader.readLine();

        String result = registerService.registerUser(username, password);
        System.out.println(result);
    }
}
