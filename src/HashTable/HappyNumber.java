package HashTable;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int squareSum, remain;

        while (set.add(n)){
            squareSum = 0;

            while (n > 0){
                remain = n % 10;
                squareSum += remain * remain;
                n = n / 10;
            }

            if (squareSum == 1)
                return true;
            else n = squareSum;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int happy = scanner.nextInt();
        System.out.println(isHappy(happy));
    }
}
