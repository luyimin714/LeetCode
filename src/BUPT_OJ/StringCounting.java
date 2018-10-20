package BUPT_OJ;

import java.io.FileOutputStream;
import java.util.Scanner;

public class StringCounting {
    private static int Count(String s){
        char[] s1 = s.toCharArray();

        int n = s.length();
        int count = 0;
        for (int i = 0; i <= n-4; ){
            if (s.charAt(i) == 'b'){
                for (int j = i + 1; j <= n-3; j++){
                    if (s.charAt(j) == 'u'){
                        for (int k = j + 1; k <= n-2; k++){
                            if (s.charAt(k) == 'p'){
                                for (int u = k + 1; u <= n-1; u++){
                                    if (s.charAt(u) == 't') {
                                        count++;
                                        if (count > (int)Math.pow(10,9)+7)
                                            return count;
                                    }
                                }
                            }
                        }
                    }
                }
                i++;
            }
            else
                i++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] str = new String[num];
        for (int i = 0; i < num; i++){
            str[i] = scanner.next();
        }
        for (int i = 0; i < num; i++){
            System.out.println(Count(str[i]));
        }
    }
}
