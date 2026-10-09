import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int minLength = Math.min(s1.length(), s2.length());
        int result = 0;

        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                result = -1;
                break;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                result = 1;
                break;
            }
        }

        if (result == 0) {
            if (s1.length() < s2.length()) {
                result = -1;
            } else if (s1.length() > s2.length()) {
                result = 1;
            }
        }

        if (result < 0) {
            System.out.println(s1 + " comes before " + s2);
        } else if (result > 0) {
            System.out.println(s1 + " comes after " + s2);
        } else {
            System.out.println("Both strings are equal.");
        }

        sc.close();
    }
}