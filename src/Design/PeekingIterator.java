package Design;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PeekingIterator implements Iterator<Integer>{
    Integer next;
    Iterator<Integer> iter;
    boolean isPeeked;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        iter = iterator;
        isPeeked = false;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (isPeeked){
            return next;
        } else {
            isPeeked = true;
            next = iter.next();
            return next;
        }
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer res;
        if (isPeeked){
            res = next;
        } else {
            res = iter.next();
        }
        isPeeked = false;
        return res;
    }

    @Override
    public boolean hasNext() {
        return isPeeked ? true : iter.hasNext();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        for (Iterator iter = list.iterator(); iter.hasNext();){
            String str = (String)iter.next();
            System.out.println(str);
        }
    }
}
