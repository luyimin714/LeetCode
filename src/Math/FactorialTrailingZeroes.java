package Math;

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        long factorial = 1;
        while(n > 0){
            factorial *= n;
            n--;
        }
        int num0 = 0;
        long rest = factorial % 10;
        while(rest == 0){
            num0++;
            factorial = factorial / 10;
            rest = factorial % 10;
        }
        return num0;
    }

    public static long jiecheng(int n){
        long factorial = 1;
        while(n > 0){
            factorial *= n;
            n--;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(jiecheng( 30));
    }
}
