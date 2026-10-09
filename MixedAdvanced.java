import java.util.Scanner;

class MixedAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        // Check whether n is a power of 4 using shift operators
        int temp = n;

        while (temp > 1 && temp % 4 == 0) {
            temp = temp >> 2;
        }

        if (n > 0 && temp == 1) {
            System.out.println(n + " is a power of 4.");
        } else {
            System.out.println(n + " is not a power of 4.");
        }

        // Toggle the third bit (bit position 2)
        int toggled = n ^ (1 << 2);
        System.out.println("Number after toggling 3rd bit: " + toggled);

        // Multiplication table
        for (int i = 1; i <= 50; i++) {
            if (i % 6 == 0) {
                continue;
            }

            if (i % 48 == 0) {
                break;
            }

            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}