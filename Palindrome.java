import java.util.Scanner;

/**
 * This program checks if a given integer is a palindrome.
 * A palindrome is a number that reads the same forwards and backwards.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner to take user input

        // Prompt user to enter a number
        System.out.print("Enter number: ");
        int a = input.nextInt();  // Store the input number
        input.close();  // Close the scanner to prevent resource leak

        int digit;  // Variable to hold each digit of the number
        String b = "";  // String to store the reversed number
        String c = Integer.toString(a);  // Convert original number to string for comparison

        // Loop to reverse the digits of the number
        for (int i = a; i > 0; i = i / 10) {
            digit = i % 10;  // Extract the last digit
            b += Integer.toString(digit);  // Append it to the reversed string
        }

        // Check if the original string and reversed string are the same
        if (c.equals(b)) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not a palindrome");
        }
    }
}
