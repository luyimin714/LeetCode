package BinarySearch;

public class H_IndexII {
    public int hIndex(int[] citations) {
        //因为citations[n]随n增加，但len-n随n减小。因此，如果citations[mid] ==（len-mid），
        //那么mid是citations[n] <= len-n的最大数字
        int len = citations.length;
        int left = 0, right = len - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (citations[mid] > len - mid)
                right = mid - 1;
            else if (citations[mid] < len - mid)
                left = mid + 1;
            else
                return citations[mid];
        }
        return len - left;
    }
}
