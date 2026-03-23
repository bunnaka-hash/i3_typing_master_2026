import java.util.Scanner;

class InputReader {
    private static final Scanner SCANNER = new Scanner(System.in);

    private InputReader() {
    }

    static String readLine() {
        return SCANNER.nextLine().trim();
    }

    static int readInt() {
        String input = readLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
