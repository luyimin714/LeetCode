package BitManipulation;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        int count = 0;
        for (int i = 0; i < 32; i++){
            int temp = n & 1;
            n >>>= 1;
            if (temp == 1)
                count++;
            if (count > 1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString((int)Math.pow(2,10)));
    }
}
