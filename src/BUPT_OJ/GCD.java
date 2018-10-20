package BUPT_OJ;

import java.util.Scanner;

public class GCD {
    private static int f(int a, int b){
        if (a != 0 && b != 0)
            return f(b%a, a) + 1;
        else
            return 0;
    }
    private static int[] findMax(int n){
        int maxa = 0, maxb = 0;
        int maxf = 0;
        for (int b = 1; b <= n; b++){
            for (int a = 1; a <= n; a++){
                int f = f(a, b);
                if (f > maxf){
                    maxf = f;
                    maxa = a;
                    maxb = b;
                }
            }
        }
        int[] result = new int[3];
        result[0] = maxf;
        result[1] = maxa;
        result[2] = maxb;
        return result;
    }

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        for (int i = 1; i < 1000; i++) {
            int[] result = findMax(i);
            for (int j = 0; j < 3; j++) {
                System.out.print(result[j] + " ");
            }
            System.out.println();
        }
    }
}
