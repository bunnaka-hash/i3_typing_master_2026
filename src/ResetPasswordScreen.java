class ResetPasswordScreen {
    private final ResetPasswordService resetPasswordService = new ResetPasswordService(UserStore.REPOSITORY);

    void show() {
        System.out.println("===== RESET PASSWORD =====");

        System.out.print("Enter username: ");
        String username = InputReader.readLine();

        System.out.print("Enter new password: ");
        String newPassword = InputReader.readLine();

        String result = resetPasswordService.resetPassword(username, newPassword);
        System.out.println(result);
    }
}