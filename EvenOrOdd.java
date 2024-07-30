import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        String result = checkEvenOdd(num);
        System.out.println("The number " + num + " is " + result + ".");
    }

    /**
     * Checks if a number is even or odd.
     *
     * @param num the number to check
     * @return "Even" if the number is even, "Odd" otherwise
     */
    public static String checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}