package Array;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int N = digits.length;
        for (int i = N-1; i > 0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            else digits[i] = 0;
        }
        int[] newdigits = new int[N+1];
        newdigits[0] = 1;
        return newdigits;
//        int N = digits.length;
//        int[] result = new int[digits.length];
//        int[] jinwei = new int[digits.length];
//
//        if (digits[N-1] == 9){
//            for (int i = N-1; i >= 0; i--){
//
//            }
//        }
//        for (int i = digits.length-1; i >= 0; i--){
//            if (digits[i] == 9){
//                digits[i] = 0;
//                jinwei[i-1] = 1;
//                result[i] = digits[i] + jinwei[i];
//            }
//            else {
//                result[i] = digits[i] + jinwei[i];
//            }
//        }
//
//        return result;
    }
}
