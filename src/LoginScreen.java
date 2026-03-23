class LoginScreen {
    private final LoginService loginService = new LoginService(UserStore.REPOSITORY);

    void show() {
        System.out.println("===== LOGIN =====");

        System.out.print("Enter username: ");
        String username = InputReader.readLine();

        System.out.print("Enter password: ");
        String password = InputReader.readLine();

        String result = loginService.login(username, password);
        System.out.println(result);
    }
}
