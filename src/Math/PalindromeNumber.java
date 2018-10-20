package Math;

import java.util.Scanner;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int reverse = 0;
        int y = x;
        while (0 < x){
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return y == reverse;
    }

    public static int reverse(int x){
        int reverse = 0;
        while (0 < x){
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(reverse(x));
    }
}
