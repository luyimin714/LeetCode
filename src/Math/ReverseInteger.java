package Math;

public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;

        while(x != 0){
            int tail = x % 10;
            int newResult = result * 10 + tail;

            if ((newResult - tail) / 10 != result)
            { return 0; }

            result = newResult;
            x = x / 10;
        }
        return result;
    }

    public static int test(int x){
        int result = 0;
        int tail = x % 10;
        int newResult = result * 10 + tail;
        return newResult - tail;
    }

    public static void main(String[] args) {
        System.out.println(test(2147483647));
    }
}
