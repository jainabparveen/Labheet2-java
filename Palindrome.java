import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Not a palindrome.");
        } else {
            int temp = n;
            int reverse = 0;

            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp /= 10;
            }

            if (n == reverse) {
                System.out.println("Palindrome number.");
            } else {
                System.out.println("Not a palindrome.");
            }
        }

        sc.close();
    }
}