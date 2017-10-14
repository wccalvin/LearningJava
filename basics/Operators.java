// Relational operators: < > <= >= [less than | greater than | less than or equal to |
// greater than or equal to]
// Equality operators: == != [equal | not equal]
// Boolean operators: && || ! [and | or | not]

public class Operators {
    public static void main(String[] args) {
        // Relational and Equality operators
        System.out.println(10 > 5);  // returns true
        System.out.println(10 == 5);  // returns false
        System.out.println(10 != 5);  // returns true
        System.out.println(10 < 5);  // returns false
        System.out.println(10 >= 5);  // returns true
        System.out.println(10 <= 5);  // returns false

        // Boolean operators example
        System.out.println(true && true);  // returns true
        System.out.println(true && false);  // returns false
        System.out.println(true || true);  // returns true
        System.out.println(true || false);  // returns true
        System.out.println(!false);  // returns true
        System.out.println(!true);  // returns false
        System.out.println(!(2 > 1 && 3 < 4));  // returns false
    }
}
