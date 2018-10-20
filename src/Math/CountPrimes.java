package Math;

public class CountPrimes {
    /*****************************************************************
     质数又称素数。
     指在一个大于1的自然数中，除了1和此整数自身外，没法被其他自然数整除的数。
     质数必须大于1，所以0不是质数。1也不是质数。
     *******************************************************************/
    public int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++){
            if (notPrimes[i] == false) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    notPrimes[i * j] = true;
                }
            }
        }
        return count;
    }
}
