import java.util.Scanner;
public class prueba {
    public static void main(String[] args) {
        // Ask the user for the input
        System.out.print("Enter an input:");
        Scanner s = new Scanner(System.in);
        int digit = s.nextInt();
        // Ask the user for the radix
        System.out.print("Enter the radix:");
        int radix = s.nextInt();
        char result = Character.forDigit(digit, radix);
        System.out.println("The character representation using radix \'" + radix + "\' for digit " + digit + "  is : " + result);
    }
}