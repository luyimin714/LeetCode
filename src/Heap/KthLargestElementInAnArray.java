package Heap;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        final PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums){
            pq.add(num); //pq.offer()
            if (pq.size() > k)
                pq.poll();
        }
        return pq.peek();
    }
}
