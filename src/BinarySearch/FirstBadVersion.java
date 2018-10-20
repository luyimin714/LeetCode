package BinarySearch;

public class FirstBadVersion extends VersionControl{
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid))
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(1/2);
        int lo = 0, hi = 7;
        System.out.println((lo+hi)/2);
        System.out.println(lo+(hi-lo)/2);
    }
}
