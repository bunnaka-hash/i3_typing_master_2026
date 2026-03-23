import java.util.HashMap;
import java.util.Map;

class UserRepository {
    private final Map<String, String> users = new HashMap<>();

    boolean exists(String username) {
        return users.containsKey(username);
    }

    void save(String username, String password) {
        users.put(username, password);
    }

    void updatePassword(String username, String newPassword) {
        users.put(username, newPassword);
    }

    boolean isValidCredentials(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}
