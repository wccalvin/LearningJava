// More about format in the below doc
// https://docs.oracle.com/javase/tutorial/java/data/numberformat.html

public class Math {
    public static void main(String[] args) {
        int sum = 2 + 2;
        int difference = 5 - 4;
        int product = 2 * 2;
        int quotient = 15 / 3;
        int remainder = 7 % 3;

        System.out.printf("sum: %d\ndifference: %d\nproduct: %d\nquotient: %d\nremainder: %d\n",
            sum, difference, product, quotient, remainder);
    }
}
