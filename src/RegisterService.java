class RegisterService {
    private final UserRepository userRepository;

    RegisterService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    String registerUser(String username, String password) {
        if (username.isEmpty() || password.isEmpty()) {
            return "Username and password cannot be empty.";
        }

        if (username.length() < 3) {
            return "Username must be at least 3 characters.";
        }

        if (password.length() < 4) {
            return "Password must be at least 4 characters.";
        }

        if (userRepository.exists(username)) {
            return "Username already exists.";
        }

        userRepository.save(username, password);
        return "Registration successful.";
    }
}
