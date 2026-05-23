import java.util.Scanner;

public class Palindrome {

    // reverse karo string
    static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    //  check karo palindrome hai ya nahi
    static boolean isPalindrome(String str) {
        String original = str;
        String reverse = reverseString(original);

        // compare
        for (int i = 0; i < original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
            if (ch1 != ch2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();

        if (isPalindrome(s)) {
            System.out.println(s + " is a Palindrome ");
        } else {
            System.out.println(s + " is NOT a Palindrome ");
        }
    }
}