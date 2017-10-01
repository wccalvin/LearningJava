import java.io.Console;

public class StringComparison {
    public static void main(String[] args) {
        Console console = System.console();

        String nameA = "clayton";
        String nameB = "clayton";
        String nameC = "CLAYTON";

        if (nameA.equals(nameB)) {
            console.printf("Name A and Name B are same.\n");
        }
        if (nameA.equalsIgnoreCase(nameC)) {
            console.printf("Name A and Name C are same ignoring case.\n");
        }
    }
}
