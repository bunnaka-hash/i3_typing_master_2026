class ResetPasswordService {
    private final UserRepository userRepository;

    ResetPasswordService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    String resetPassword(String username, String newPassword) {
        if (username.isEmpty() || newPassword.isEmpty()) {
            return "Username and new password cannot be empty.";
        }

        if (!userRepository.exists(username)) {
            return "Username does not exist.";
        }

        if (newPassword.length() < 4) {
            return "New password must be at least 4 characters.";
        }

        userRepository.updatePassword(username, newPassword);
        return "Password reset successful.";
    }
}