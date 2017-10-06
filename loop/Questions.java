import java.io.Console;

public class Questions {
    public static void main(String[] args) {
        Console console = System.console();

        String anyQuestions = console.readLine("Are there any questions? ");
        while (anyQuestions.equalsIgnoreCase("yes")) {
            String question = console.readLine("What is your question? ");
            console.printf("I don't understand... %s\n", question);
            anyQuestions = console.readLine("Are ther any more questions? ");
        }
    }
}
