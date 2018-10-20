package BUPT_OJ;

import java.util.Arrays;
import java.util.Scanner;

public class MexQuery {
    private static int findMin(int[] a){
        Arrays.sort(a);
        if(a[0] != 0)
            return 0;
        for (int i = 0; i < a.length; i++){
            if (a[i+1] != a[i] + 1)
                return a[i]+1;
        }
        return a[a.length-1] + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testnum = scanner.nextInt();
        int[] num = new int[testnum];
        for (int i = 0; i < testnum; i++){
            num[i] = scanner.nextInt();
            int[] case1 = new int[num[i]];
            for (int j = 0; j < num[i]; j++)
                case1[j] = scanner.nextInt();
        }
        for (int i = 0; i < testnum; i++){

        }
    }
}
