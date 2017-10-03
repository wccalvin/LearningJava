import java.io.Console;

public class StoryRestricted {
    public static void main(String[] args) {
        Console console = System.console();
        String ageAsString = console.readLine("How old are you? ");
        // converting string to integer
        int age = Integer.parseInt(ageAsString);
        if (age < 13) {
            console.printf("Sorry, you must be at least 13 years old to use this program.\n");
            System.exit(0);
        }
        String name = console.readLine("Enter your name: ");
        String adjective = console.readLine("Enter an adjective: ");
        String noun;
        boolean isInvalidWord;
        do {
            noun = console.readLine("Enter a noun: ");
            isInvalidWord = (noun.equalsIgnoreCase("stupid") ||
                             noun.equalsIgnoreCase("idiot") ||
                             noun.equalsIgnoreCase("fool"));
            if (isInvalidWord) {
                console.printf("That language is not allowed. Try again ...\n\n");
            }
        } while (isInvalidWord);
        console.printf("%s is %s %s.\n", name, adjective, noun);
    }
}
