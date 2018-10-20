package Array;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {
    private class IntervalComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval a, Interval b) {
            return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
        }
    }
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1)
            return intervals;
        List<Interval> ans = new LinkedList<>();
        Collections.sort(intervals, new IntervalComparator());
        //intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (Interval interval : intervals){
            if (interval.start <= end)
                end = Math.max(interval.end, end);
            else {
                ans.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        ans.add(new Interval(start, end));
        return ans;
    }

    public static void main(String[] args) {
        int x = 2, y = 2;
        System.out.println(Integer.compare(x, y));
        List<Interval> intervals = new LinkedList<>();
        Interval interval1 = new Interval(2, 4);
        Interval interval2 = new Interval(1, 3);
        intervals.add(interval1);
        intervals.add(interval2);
        System.out.println(intervals.get(0).start);
        System.out.println(intervals.get(1).start);
        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        System.out.println(intervals.get(0).start);
        System.out.println(intervals.get(1).start);
    }
}
