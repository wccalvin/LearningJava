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
        String noun = console.readLine("Enter a noun: ");
        // comparing words to impose restriction
        if (noun.equalsIgnoreCase("stupid")) {
            console.printf("That language is not allowed. Exiting ... \n");
            System.exit(0);
        }
        console.printf("%s is %s %s.\n", name, adjective, noun);
    }
}
