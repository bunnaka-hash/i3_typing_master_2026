class LoginService {
    private final UserRepository userRepository;

    LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    String login(String username, String password) {
        if (username.isEmpty() || password.isEmpty()) {
            return "Username and password cannot be empty.";
        }

        boolean isValid = userRepository.isValidCredentials(username, password);
        if (isValid) {
            return "Login successful.";
        }

        return "Invalid username or password.";
    }
}