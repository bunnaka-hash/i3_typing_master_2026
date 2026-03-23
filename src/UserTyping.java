import java.util.Scanner;

class TypingScreen {

    User user;

    TypingScreen(User user) {
        this.user = user;
    }

    void show() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type this sentence:");
        String text = "Java is a powerful programming language";

        System.out.println(text);
        long start = System.currentTimeMillis();

        String input = sc.nextLine();
        long end = System.currentTimeMillis();

        int mistakes = calculateMistakes(text, input);
        int time = (int)((end - start) / 1000);

        int wpm = (input.length() / 5) * 60 / (time == 0 ? 1 : time);

        Result result = new Result(user.username, wpm, mistakes);

        ResultScreen.addResult(result);

        new ResultScreen().show(user);
    }

    int calculateMistakes(String original, String typed) {
        int mistakes = 0;
        for (int i = 0; i < Math.min(original.length(), typed.length()); i++) {
            if (original.charAt(i) != typed.charAt(i)) {
                mistakes++;
            }
        }
        return mistakes;
    }
}
