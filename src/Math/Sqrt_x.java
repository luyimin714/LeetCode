package Math;

public class Sqrt_x {
    public int mySqrt(int x) {
//        if (x == 0)
//            return 0;
//        int left = 1, right = x;
//        while (left <= right){
//            int mid = (left + right) / 2;
//            if (mid > x / mid)
//                right = mid - 1;
//            else
//                left = mid + 1;
//        }
//        return right;
        if (x == 0)
            return 0;
        int left = 1, right = Integer.MAX_VALUE;
        while (true) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }
}
