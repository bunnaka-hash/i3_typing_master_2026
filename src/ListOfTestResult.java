import java.util.Scanner;

class TypingTest {

    int charSpeed;
    int wordSpeed;
    int totalChars;
    int mistakes;

    // Constructor
    TypingTest(int charSpeed, int wordSpeed, int totalChars, int mistakes) {
        this.charSpeed = charSpeed;
        this.wordSpeed = wordSpeed;
        this.totalChars = totalChars;
        this.mistakes = mistakes;
    }

    // Method to display result
    void displayResult() {
        System.out.println("--------------- Typing Test Level 1 Result --------------");
        System.out.println("Speed (characters/min): " + charSpeed);
        System.out.println("       (words/min): " + wordSpeed);
        System.out.println("Total input characters: " + totalChars);
        System.out.println("Total mistakes: " + mistakes);
        System.out.println("--------------------------------------------------------");
    }

    // Method to show menu
    void showMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Next level");
        System.out.println("2. Logout");
        System.out.println("3. Exit");

        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Starting next level...");
                break;
            case 2:
                System.out.println("Logging out...");
                break;
            case 3:
                System.out.println("Exiting program...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

// Main class
public class ListOfTestResult {
    public static void main(String[] args) {

        TypingTest test = new TypingTest(60, 40, 200, 8);

        test.displayResult();
        test.showMenu();
    }
}