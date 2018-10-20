package BitManipulation;

public class NumberOf1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            int temp = n & 1;
            if(temp == 1)
                count++;
            n >>>= 1;
        }
        return count;
    }
}
