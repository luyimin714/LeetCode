package BitManipulation;

public class BitwiseANDofNumbersRange {
    public int rangeBitwiseAnd(int m, int n) {
        int offset = 0;
        while (m != n){
            m >>= 1;
            n >>= 1;
            offset++;
        }
        return m << offset;
    }

    public static void main(String[] args) {
        int m = 3;
        System.out.println(m <<= 1);
        m = 3;
        System.out.println(m >>= 1);
    }
}
