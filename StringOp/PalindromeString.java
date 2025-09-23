package JAVA_DSA_Learning.StringOp;

import java.util.Scanner;

public class PalindromeString {
    // time complexity is O(n/2)
    public static boolean palindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                System.out.println("String is not a palindrome ");
                return false;
            }
        }
        System.out.println("String is palindrome ");
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = in.next();
        palindrome(str);

    }
}