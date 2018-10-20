package BitManipulation;

public class CountingBits {
    public int[] countBits(int num) {
        int[] ans = new int[num+1];
        for (int i = 1; i <= num; i++){
            ans[i] = ans[i/2] + i%2;  //i/2 == i >> 1
        }
        return ans;
    }
}
