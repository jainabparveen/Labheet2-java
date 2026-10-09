import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        int i = 1;

        if (n > 0) {
            do {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            } while (i <= n);
        } else {
            System.out.println("Please enter a positive number.");
        }

        sc.close();
    }
}